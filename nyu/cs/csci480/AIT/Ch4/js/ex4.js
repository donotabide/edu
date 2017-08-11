/*
    Write a function, deepEqual, that takes two values and 
    returns true only if they are the same value or are 
    objects with the same properties whose values are also 
    equal when compared with a recursive call to deepEqual.
*/

function deepEqual(value1, value2){
    if(value1 === value2) return true;
    
    if(typeof value1 != "object" || value1 == null ||
       typeof value2 != "object" || value2 == null)
        return false;
    
    var prop1 = 0;
    for(var element in value1)
        prop1++;
    
    var prop2 = 0;
    for(var element in value2){
        prop2++;
        if(!(element in value1) || !deepEqual(value1[element], value2[element]))
            return false;
        
    }
    
    return prop1 == prop2;
}

var obj = {here: {is: "an"}, object: 2};
console.log(deepEqual(obj, obj));
// → true
console.log(deepEqual(obj, {here: 1, object: 2}));
// → false
console.log(deepEqual(obj, {here: {is: "an"}, object: 2}));
// → true