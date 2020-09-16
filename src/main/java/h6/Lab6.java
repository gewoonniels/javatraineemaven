package h6;

import java.util.*;

public class Lab6 {

    public void calculateSum(){
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        System.out.println("Enter numbers");

        for(int i = 0;i < 10; i++){
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }

        System.out.println(Arrays.stream(numbers).sum());
    }

    public void print3By3Array(){
        Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        List<Integer> intList = Arrays.asList(intArray);
        Collections.shuffle(intList);
        intList.toArray(intArray);
        System.out.println(intArray[0] + " " + intArray[1] + " " + intArray[2]);
        System.out.println(intArray[3] + " " + intArray[4] + " " + intArray[5]);
        System.out.println(intArray[6] + " " + intArray[7] + " " + intArray[8]);
    }

}
