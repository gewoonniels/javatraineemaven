package scannerfunc;

import java.util.Scanner;

public class ScannerWrapper {

    private Scanner scanner = new Scanner(System.in);

    public String read() {
        return scanner.nextLine();
    }

    public void write(String s) {
        System.out.println(s);
    }

    public void write() {
        System.out.println();
    }

}
