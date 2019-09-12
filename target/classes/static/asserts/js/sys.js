$(function () {
 //异步加载数据
    $("#data").load('getClub');

});

//异步删除
function delete_btn(id) {
    var v = confirm("确定要删除吗?");
    if (v){
        $.ajax({
            type: "delete",
            url: "club/"+id,
            success: function(data){
                if (data=="1") {
                    alert("删除成功");
                    $("#data").load('getClub');
                }
            }

        })
    }
}

