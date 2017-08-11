/* Example list */

var list1 = {
    value: 1,
    rest: {
        value: 2,
        rest: {
            value: 3,
            rest: {
                value: 4,
                rest: null
            }
        }
    }
};


/* 
    Write a function arrayToList that builds up a data 
    structure like the previous one when given [1, 2, 
    3] as argument
*/

function arrayToListNoPrepEnd(array){
    var list = {};
    
    for(var i = 0; i < array.length; i++){
        list = {
            value: array[array.length-1-i],
            rest: list
        };
    }
    
    return list;
}

array1 = [1, 2, 3, 4];

console.log(arrayToListNoPrepEnd(array1));


/* 
    Write a listToArray function that produces an array from a list
*/

function listToArray(list){
    var listTemp = list;
    var array = [];
    while(listTemp.rest!=null){
        array.push(listTemp.value);
        listTemp = listTemp.rest;
    }
    array.push(listTemp.value);
    return array;
}

console.log(listToArray(list1));


/* 
    Write the helper functions prepend, which takes an 
    element and a list and creates a new list that adds 
    the element to the front of the input list
*/

function prepend(element, list){
    var listNew = {};
    listNew.value = element;
    listNew.rest = list;
    list = listNew;
    return list;
}


function arrayToList(array){
    var list = {};
    
    for(var i = 0; i < array.length; i++)
        list = prepend(array[array.length-1-i], list);
    
    return list;
}

console.log(arrayToList(array1));


/*
     With a function nth, which takes a list and a number
     and returns the element at the given position in the 
     list, or undefined when there is no such element.
*/

function nth(list, number){
    var listTemp = list;
    var i;
    for(i = 0; listTemp.rest != null; i++){
        if(i == number)
            break;
        listTemp = listTemp.rest;
    }
    if(i != number)
        return undefined;
    else return listTemp.value;
}

console.log(nth(list1, 0));
console.log(nth(list1, 1));
console.log(nth(list1, 2));
console.log(nth(list1, 3));
console.log(nth(list1, 4));


function nthRec(list, number){
    if(number >= 0){
        if(list.rest == null && number != 0)
            return undefined;
        else if(number == 0)
            return list.value;
        return nthRec(list.rest, number-1);
    } else return undefined;
}

console.log(nthRec(list1, 0));
console.log(nthRec(list1, 1));
console.log(nthRec(list1, 2));
console.log(nthRec(list1, 3));
console.log(nthRec(list1, 4));
