requirejs.config({
    baseUrl: 'js'
})


function buildRoute(view) {
    return function() {
        webix.ui({
            id: 'root',
            rows: [
                view
            ]
        }, $$("root"))
    }
}

function buildBtn(label, route) {
    return {
        align: 'center',
        click: function () {
                routie(route)
        },
        value: label,
        view: 'button',
        width: 100
    };
}

require(
    ['views/main', 'views/cars', 'views/marks', 'util/resourceProxy']
    , function(main, cars, marks, resourceProxy) {
    webix.ready(function() {
        webix.ui({
            container: "app",
            width: document.body.clientWidth,
            height: document.body.clientHeight,
            rows: [
                {
                    view: 'toolbar',
                    cols: [
                        buildBtn('Home', ''),
                        buildBtn('Marks', 'marks'),
                    ]
                },
                {
                id: 'root'
                }
            ]

        })
    })

    routie({
        '': buildRoute(main),
        'cars': buildRoute(cars),
        'marks': buildRoute(marks)
    })
})