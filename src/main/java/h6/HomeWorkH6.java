package h6;

public class HomeWorkH6 {

    public long[] doubleArraySize(long[] longArray) {
        long[] doubledArray = new long[longArray.length * 2];
        for (int i = 0; i < doubledArray.length; i++) {
            doubledArray[i] = i < longArray.length ? longArray[i] : 0;
        }
        return doubledArray;
    }

    public long[] multiply(long[] input, int multiplier) {
        for (int i = 0; i < input.length; i++) {
            input[i] = input[i] * multiplier;
        }
        return input;
    }

    public long[] fibo(int f1, int f2, int n) {
        long[] array = new long[n];
        int first = f2;
        int second = f1;
        array[0] = f1;
        array[1] = f2;
        for (int i = 2; i < n; i++) {
            array[i] = first + second;
            int buffer = first;
            first = first + second;
            second = buffer;
        }
        return array;
    }


}
