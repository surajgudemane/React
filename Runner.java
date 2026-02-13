class MyArrayMethods {
  
    int[] arr;
    int size;
    int lenth;
    // constructor
    MyArrayMethods(int capacity) {
        arr = new int[capacity];
        size = 0;
        lenth = capacity;
    }

    // push method
    void customPush(int value) {
    if (size == arr.length) {
        throw new ArrayIndexOutOfBoundsException();
    }

    arr[size] = value;
    size++;
}

    // pop method
    int customPop(){
    if (size == 0) {
        throw new IllegalStateException("Your Array is Empty");
    }
    size--;
    lenth--;
    return arr[size];
}

// replace method
void addAtIndex(int index, int value) {

    if (size == 0) {
        throw new IllegalStateException("Array is empty");
    }

    if (index < 0 || index >= size) {
        throw new IndexOutOfBoundsException("Index " + index + " out of bounds for length " + size);
    }
    arr[index] = value;
    System.out.println(arr[index] + " sdfghjkhgfdsfghjkjhgf");
}


    // get length of Array
    int length() {
    return lenth;
}

// Print Array
void getArray() {
    for (int i = 0; i < size; i++) {
        System.out.println(arr[i]);
    }
}
}

public class Runner {

    public static void main(String[] args) {
      
        MyArrayMethods a = new MyArrayMethods(6);

        a.customPush(100);
        a.customPush(2000);
        a.customPush(300);
        a.customPush(5000);
        a.customPush(350);

        a.getArray();

        a.addAtIndex(2, 8989);
        a.getArray();

        // System.out.println("Length : "+ a.length());

        // System.out.println(a.customPop()+ " : Deleted");
        // System.out.println("Length : "+ a.length());

    }
}