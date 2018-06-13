$a.page(function () {
    this.init = function (id, param) {
        var $body = $('body');

        function initGrid () {
            $('#grid_todolist').alopexGrid({
                columnMapping: [
                    {
                        columnIndex: 0,
                        align: 'center',
                        key: 'number',
                        title: 'Number',
                        width: '100px'
                    }, {
                        columnIndex: 1,
                        align: 'center',
                        key: 'todo',
                        title: 'To Do 항목',
                        width: '300px'
                    }
                ]
            });
        }

        $a.request.setup({
            platform: 'NEXCORE.J2EE',
            url: function (id, param) {
                return 'http://ui.alopex.io/2.3/started/education/' + id + '.json';
            },
            method: 'GET',
            before: function (id, option) {
                $body.progress();
            },
            after: function (res) {
                $body.progress().remove();
            },
            fail: function (res) {
                alert('서버 오류 발생');
                $body.progress().remove();
            },
            error: function (err) {
                alert('현재 네트 상태를 확인하십시요');
                $body.progress().remove();
            }
        });

        initGrid();

        $a.request('response', {
            data: {
                "id": param['name']
            },
            success: '#grid_todolist'
        });
    };
});