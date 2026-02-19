let a1;
let b1;

let result1 = document.querySelector('#result');

let temp = 0;

function numSeries() {

    result1.innerText += a1 + "\n";
    let c1 = a1 + b1;
    a1 = b1;
    b1 = c1;

    temp = setTimeout(numSeries, 2000);

}

let startBtn = document.querySelector('#btnStart');

startBtn.addEventListener('click', () => {
    endBtn.disabled = false;
    a1 = 0;
    b1 = 1;

    result1.innerText = "";
    
    if(temp === 0){
        numSeries();
    }
});

let endBtn = document.querySelector('#btnEnd');

endBtn.addEventListener('click', () => {
    alert("Stoped");
    console.log("Stop");
    clearTimeout(temp);
    temp = 0;
});