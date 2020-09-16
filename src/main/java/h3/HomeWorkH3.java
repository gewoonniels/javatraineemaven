package h3;

public class HomeWorkH3 {

    public void showDifference() {
        int i = 3;
        System.out.println("For the difference between i++ and i++, we start with the int 3");
        System.out.println("When we use ++i the number will first get one higher:" + ++i);
        System.out.println("When we use i++ we get the value first so the number will be the same:" + i++);
        System.out.println(" Next time we print it it will be higher " + i);
    }

    public void calculateJ() {
        int i = 3;
        int j = i < 3 ? i++ + ++i : ++i >>> 1;
        System.out.println(j);
    }

    public String calculateBinary(String firstByte, String secondByte) {
        int b1 = Integer.parseInt(firstByte, 2);
        int b2 = Integer.parseInt(secondByte, 2);
        int sum = b1 + b2;
        return Integer.toBinaryString(sum);
    }

    public void calculateBinarySimple() {
//        byte a = 0b1010;
//        byte b = 0b100;
//        System.out.println(a + b);
    }

    public void calculateTime(int currentTime, int leapedHours) {
        int finalHour = (currentTime + leapedHours) % 24;
        System.out.println("Het is " + finalHour + " uur, er zijn " + ((currentTime + leapedHours) / 24) + " voorbij gegaan");
    }

//    byte	8 bits	-128 to +127
//    short	16 bits	-32,768 to +32,767
//    int	32 bits	(about)-2 billion to +2 billion
//    long	64 bits	(about)-10E18 to +10E18
//    float	32 bits	Maximum Values of -3.4E+38 to +3.4E+38 and a smallest value of +1.40239846E-45 to 1.40239846E-45
//    double	64 bits	-1.7E+308 to 1.7E+308
//    char 0 to 65,536E
}
