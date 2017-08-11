// Example of higher level function testing whether a value 
// is greater than another


function greaterThan(value1){
    return function(value2){
        return value2 > value1;
    };
}

// testing it
var greaterThan10 = greaterThan(10);
console.log(greaterThan10(13));
console.log(greaterThan10(4));



// Creating a function that changes other functions
function noisy(f){
    return function(arg){
        console.log("Calling with", arg);
        var val = f(arg);
        console.log("Called with", arg, "- got", val);
        return val;
    };
}

noisy(Boolean)(0);
noisy(Boolean)(1);
