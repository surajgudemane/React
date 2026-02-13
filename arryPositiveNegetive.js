let arr = [50 ,-19, -1, -2, 3, -4, 5, 6, 7];

for (let i = 0; i < arr.length; i++) {

    if (i % 2 !== 1) {
        arr[i] = Math.abs(arr[i]);
    } else {
        arr[i] = -Math.abs(arr[i]);
    }
}

console.log(arr);

