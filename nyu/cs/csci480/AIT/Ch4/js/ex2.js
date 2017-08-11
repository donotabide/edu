/*
    The  first, reverseArray, takes an array as argument 
    and produces a new array that has the same elements 
    in the inverse order.
*/

var array1 = ["platipus", "gig", "work", "example"];
var array2 = [0, 1, 2, 3, 4];

function reverseArray(array){
    var arrayInv = [];
    for(var i = array.length-1; i >= 0; i--)
        arrayInv.push(array[i]);
    return arrayInv;
}

console.log(reverseArray(array1));
console.log(reverseArray(array2));

/*
    The second, reverseArrayInPlace, does what the reverse
    method does: it modifies the array given as argument in 
    order to reverse its elements. Neither may use the 
    standard reverse method.
*/

function reverseArrayInPlace(array){
    var temp;
    for(var i = 0; i <= array.length/2; i++){
        temp = array[i];
        array[i] = array[array.length-1-i];
        array[array.length-1-i] = temp;
    }
    //return array;
}

console.log(array1);
console.log(array2);

reverseArrayInPlace(array1);
reverseArrayInPlace(array2);

console.log(array1);
console.log(array2);
//console.log(arrayTest1);
//console.log(arrayTest2);
