define(function () {
    return function (tableId, url, columns) {
        return {
            rows: [
                {
                    view: 'toolbar',
                    cols: [
                        {
                            view: 'button',
                            label: 'Add',
                            click: function () {
                                var markList = $$(tableId)
                                var id = markList.add({})
                                markList.editRow(id)
                            }
                        }
                    ]
                },
                {
                    id: 'markList',
                    view: "datatable",
                    pager: "markPager",
                    datafetch: 3,
                    columns: columns,
                    url: url,
                    save: url,
                    autoheight: true,
                    autowidth: true,
                    editable: true
                },
                {
                    view: "pager",
                    id: "markPager",
                    size: 3,
                    group: 3,
                    template: "{common.first()}{common.prev()}{common.pages()}{common.next()}{common.last()}Page {common.page()} from #limit#"
                }
            ]

        }
    }
})