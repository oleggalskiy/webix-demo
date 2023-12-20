define(function () {
    return {
        rows: [
            {
                view: 'toolbar',
                cols: [
                    {
                        view: 'button',
                        label: 'Add',
                        click: function () {
                            var markList = $$('markList')
                            var id = markList.add({})
                            markList.editRow(id)
                        }
                    }
                ]
            },
            {
                id: 'markList',
                view: "datatable",
                columns: [
                    {id: "id"},
                    {id: "name", editor: "text"},
                ],
                url: 'resource->api/mark',
                save: 'resource->api/mark',
                autoheight: true,
                autowidth: true,
                editable: true
            }
        ]

    }
})