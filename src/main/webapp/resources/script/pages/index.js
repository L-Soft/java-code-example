$a.page(function () {
    function setEventListener() {
        $("#next").click(function () {
            var $name = $('#name');
            if (!$name.validate()) {
                alert($name.getErrorMessage());
            } else {
                $a.navigate('todoList', {'name': $name.val()});
            }
        });
    }

    this.init = function (id, param) {
        setEventListener();
    }
});