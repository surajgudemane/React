let i = 0;

function print() {
    if (i === 10) {
        return;
    }
    console.log(i++);
    // i++;
    print();
}

print();
