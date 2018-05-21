var sd = document.getElementById("hey")
function subdoc() {

	var articleId = document.getElementById("Articleid").value;
    var articletitle = document.getElementById("Articletitle").value;
    var imageLink = document.getElementById("imageLink").value;
    var content = document.getElementById("content").value;
    var videoLink = document.getElementById("videoLink").value;

    var jsonOb = convertToJson(articleId,articletitle,imageLink,content,videoLink);
    console.log("josn is:  "+jsonOb);

     $.ajax({
            type: "POST",
            contentType: "application/json",
            url: "/home/add/"+jsonOb,
            dataType: 'json',
            timeout: 600000,
            success: function () {

                console.log("success")
            },
            error: function (e) {

                console.log(e)

            }
        });



}


function convertToJson(o,a,b,c,d){
var json = "{ \"articleId\":\""+o+"\",\"articletitle\":\""+a+"\",\"imageLink\":\""+b+"\",\"content\":\""+c+"\",\"videoLink\":\""+d+"\"} ";
return json;

}



function openDoc() {

     $.ajax({
            type: "POST",
            contentType: "application/json",
            url: "/home/getArticle/" + "tejas",
            dataType: 'json',
            timeout: 600000,
            complete: function (answer) {
                var he = answer
                console.log("success")
                document.getElementById("ans").innerHTML = he.responseText;
            },
            error: function (e) {
                console.log(e)

            }
        });





}





function addArticleload(){

    window.location = '/home/addArticle'

}