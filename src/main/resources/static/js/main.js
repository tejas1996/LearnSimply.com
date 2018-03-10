var sd = document.getElementById("hey")
function subdoc() {

    var key = document.getElementById("key").value;
    var value = document.getElementById("value").value;

  console.log("here is key "+key)
  console.log("and the value is"+value)
    var search = key + "="+value

     $.ajax({
            type: "GET",
            contentType: "application/json",
            url: "/home/add/" + search,
            dataType: 'json',
            timeout: 600000,
            success: function () {

                console.log("success")
            },
            error: function (e) {

                console.log(e)

            }
        });

    window.location = '/home'


}

function addArticleload(){

    window.location = '/home/addArticle'

}