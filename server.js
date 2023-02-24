const express = require('express');
const { exec } = require('child_process');
const app = express();
const port = process.env.PORT || 3000;
const options = {
	extensions:['htm','html','css','java','js','ico','jpg','jpeg','png','svg','pdf'],
	index:['index.html'],
}
app.use(express.static("frontend"));
app.use(express.json());
app.use(express.static("public",options));

app.get("/", function(req, res){
	res.sendFile(__dirname+"/PathFinder.java");
});

app.listen(port, function(){
    console.log("Server running on http://localhost:"+port);
});

 const  executeJava = function hello()  {
    return new Promise((resolve, reject) => {
        const child = exec('PathFinderProject.jar', function (error, stdout, stderr) {
            console.log('Value at stdout is: ' + stdout); 
            resolve(stdout);
            if (error !== null) {
                console.log('exec error: ' + error);
                reject(error);
            }
        });
    })
}

const myResult  =   executeJava();