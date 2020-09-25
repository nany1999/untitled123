var driver= require('mongodb').MongoClient;
var conn='mongodb://localhost:27017/nanyan';



 var selectData = function(db, callback) {
//     //连接到表
    var collection =db.collection('nanyan');
    //查询数据
    var whereStr = {"name":'nanmimi'};
    collection.find(whereStr).toArray(function(err, result) {
        if(err)
        {
            console.log('Error:'+ err);
            return;
        }
        callback(result);
    });
}
     driver.connect(conn, function (err, db) {
         console.log("连接成功！");
         selectData(db, function (result) {
             console.log(result);
             db.close();
         });
     });
