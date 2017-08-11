// Useless function showing pattern
function transparentWrap(f){
    return function(){
        return f.apply(null, arguments);
    };
}