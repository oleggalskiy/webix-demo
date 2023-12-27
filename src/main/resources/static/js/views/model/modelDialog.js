define(['component/dialogPage', 'collections/marks'],function (dialogPage,marks){
    return dialogPage(
        'modelDialog',
        'resource->/api/model',
        [
            {id: 'id'},
            {id: 'name'},
            {id: 'mark', options: marks}
        ]
    )
})