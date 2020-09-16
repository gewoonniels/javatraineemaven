package h5;

public class HomeWorkH5 {

    public int fibo(int n) {
        return fibo(1, n);
    }

    public int fibo(int start, int n) {
        return fibo(start, start, n);
    }

    public int fibo(int f1, int f2, int n) {
        int first = f2;
        int second = f1;
//        System.out.println(f1);
//        System.out.println(f2);
        for (int i = 0; i < n - 2; i++) {
//            System.out.println(first + second);
            int buffer = first;
            first = first + second;
            second = buffer;
        }
        return first;
    }

    public double[] LastTwoFibo(int n) {
        double first = 1;
        double second = 1;
        for (int i = 0; i < n - 2; i++) {
            double buffer = first;
            first = first + second;
            second = buffer;
        }
        return new double[]{first, second};
    }

    public double goldenRatioByFibo(int n) {
        double[] intArray = LastTwoFibo(10);
        System.out.println(intArray[0] + " " + intArray[1]);
        return intArray[0] / intArray[1];
    }

    public double goldenRatio(int n) {
        if (n == 0) return 1;
        return 1.0 + 1.0 / goldenRatio(n - 1);
    }
}

