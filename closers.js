function createMultiplier(multiplier) {
    let num = multiplier;
    return function (number) {
        num = num * number;
        return num;
    };
}
let c = createMultiplier(5);
console.log(c(2)); 
console.log(c(2)); 
console.log(c(2)); 
console.log(c(2));