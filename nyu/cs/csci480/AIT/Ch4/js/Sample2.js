// Journal to trek source of migraines
var journal = [];

function addEntry(events, hadMigraine){
    journal.push({
        events: events,
        migraine: hadMigraine
    });
}


addEntry(["tv", "heat", "arguing", "quiz"], true);
addEntry(["climbed", "ice cream", "slept", "meatballs", "doughnut"], false);
addEntry(["ice cream", "heat", "quiz", "dougnuts"], false);


console.log(journal[0]);
console.log(journal[1].events);
console.log(journal[1].migraine);
console.log(journal[2].events[2]);
console.log(journal[2].events[4]);
console.log(journal[2].events[3]);

