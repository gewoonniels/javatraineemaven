package h5;

import java.util.Arrays;

public class Lab5 {

    public int greatest(int a, int b){
//        a > b ? a : b;
        return Math.max(a,b);
    }

    public String greatest(String a, String b){
        return a.length() > b.length() ? a : b;
    }

    public int greatest(int ... a){
        return  Arrays.stream(a).max().getAsInt();
    }

    public int factorial(int n){
        int sum = 0;
        if(n == 1){
            return n;
        }else{
            sum = n * factorial(n -1);
        }
        return sum;
    }

}
