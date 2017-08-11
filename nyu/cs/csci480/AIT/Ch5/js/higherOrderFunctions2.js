// Creating function that provides a control flow
function unless(test, then){
    if(!test) then();
}

function repeat(times, body){
    for(var i = 0; i < times; i++)
        body(i);
}

repeat(7, function(n){
    unless(n % 2, function(){
       console.log(n, "is even");
    });
    unless(!(n % 2), function(){
       console.log(n, "is odd"); 
    });
});