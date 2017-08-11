var verbose = 0;
// Making the log of values from an array by using a
// function

function logEach(array){
    for(var i = 0; i < array.length; i++)
        console.log(array[i]);
}


// Testing logEach
var array1 = ["Wampeter", "Foma", "Granfalloon"];
logEach(array1);



// Making a function that takes an array and an action to be perfomed on the array

function forEach(array, action){
    for (var i=0; i<array.length; i++)
        action(array[i]);
}

// Testing forEach
function testS1(){
    forEach(array1, console.log);
    forEach(array1, alert);
}

//  Creating a function where you don’t pass a predefined 
//  function to forEach but create a function value on the
//  spot instead.
var numbers = range(1, 25), sum = 0;
forEach(numbers, function(number){
   sum += number; //function definition here;
});

console.log(sum);


// Making gatherCorrelations shorter

function gatherCorrelations(journal){
    var phis = {};
    journal.forEach(function(entry){
        entry.events.forEach(function(event){
            if(!(event in phis))
                phis[event] = phi(tableFor(event, journal));
        });
    });
    return phis;
}
