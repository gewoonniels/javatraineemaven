package h4;

public class HomeWorkH4 {

    public void coldOrWarm(Season season) {
        String temp;
        switch (season) {
            case FALL:
                temp = "cold";
                break;
            case WINTER:
                temp = "cold";
                break;
            case SUMMER:
                temp = "warm";
                break;
            case SPRING:
                temp = "warm";
                break;
            default:
                temp = "unknown";
        }
        System.out.println(temp);
    }

    public void printHourGlass(int rows) {
        if (rows % 2 == 0) {
            throw new EvenNumberException("Dikke error hier");
        }
        for (int a = 0; a < rows; a++) {
            System.out.print("*");
        }
        System.out.println("");
        int begin = 1;
        int end = rows - 2;
        for (int i = 0; i < rows - 2; i++) {
            String line = "";
            for (int j = 0; j < rows; j++) {
                if (j == begin || j == end) {
                    line += "*";
                } else {
                    line += " ";
                }
            }
            begin++;
            end--;
            System.out.println(line);
        }
        for (int i = 0; i < rows; i++) {
            System.out.print("*");
        }
    }

}
