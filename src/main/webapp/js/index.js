(function(win){
    fetch("/test")
        .then(function(resp){
            return resp.json();
        })
        .then(function(data){
            console.log(data);
        })
        .catch(function(err){
            console.log("err: ", err);
        });
})(window);
