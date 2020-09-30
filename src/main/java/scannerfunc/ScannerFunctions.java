package scannerfunc;

import java.util.ArrayList;
import java.util.List;

public class ScannerFunctions {

    private ScannerWrapper scannerWrapper = new ScannerWrapper();


    public int returnInputLength() {
        String scan = scannerWrapper.read();
        return scan.length();
    }

    public void run() {
        String s1 = scannerWrapper.read();
        String s2 = scannerWrapper.read();
        String s3 = scannerWrapper.read();

        List<String> items = new ArrayList<>();
        items.add(s1);
        items.add(s2);
        items.add(s3);

        for (String i : items) {
            if (i.indexOf("P") != 0) {
                scannerWrapper.write(i + " ");
            }
        }
        scannerWrapper.write();
    }

    public void setScannerWrapper(ScannerWrapper scannerWrapper) {
        this.scannerWrapper = scannerWrapper;
    }
}
