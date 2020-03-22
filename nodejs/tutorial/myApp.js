//1. require http
var http = require('http'); //导入http模组

//2. create server and response
http.createServer(function(request,response){  //创建并启动服务器
    response.writeHead(200,{'Content-type':'text/plain'});
    response.end('Hello Nodejs\n');
}).listen(8888);

//3. log
console.log('Server running at http://127.0.0.1:8888/');