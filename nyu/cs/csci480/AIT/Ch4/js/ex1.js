function range(start, end, step){
    var array = [];
    if(step ==  undefined){
        for(var i = start; i <= end; i++){
            array.push(i);
        }
    } else {
        if(start < end){
            for(var i = start; i <= end; i=i+step)
                array.push(i);
        }else{
            for(var i = start; i >= end; i=i+ step)
                array.push(i);
        }
    }
    return array;
}



function sumArray(array){
    var sum = 0;
    for(var i = 0; i < array.length; i++)
        sum+=array[i];
    return sum;
}
