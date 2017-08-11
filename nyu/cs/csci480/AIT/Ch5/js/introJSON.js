// Quick intro to JSON using stringify method
var string = JSON.stringify({name: "Rick", born: 1988});

// Testing stringify
console.log(string);

// Testing parse
console.log(JSON.parse(string).born);
console.log(JSON.parse(string).name);

var ancestry = JSON.parse(ANCESTRY_FILE);
console.log(ancestry.length);