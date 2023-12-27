define(['component/listPage', 'collections/marks'], function (listPage, marks) {
    return listPage(
        'modelList',
        'resource->/api/model',
        [
            {id: "id"},
            {id: "mark", editor: "combo", options: marks},
            {id: "name", editor: "text"}
        ]
    )
})