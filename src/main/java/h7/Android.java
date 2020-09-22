package h7;

public class Android extends Human implements Chargeable {

    int level = 0;

    @Override
    public String greet() {
        return "I'm only half human, but human still... My energy level is " + level + "%.";
    }

    @Override
    public int charge(int amount) {
        if (level + amount >= 100) {
            System.out.println("Kan niet opladen, zit al vol");
        } else {
            this.level += amount;
            System.out.println("Opladen....");
        }
        return this.level;
    }
}
