package chainstore;

public class RegularCard extends Card {

    public RegularCard(String name, String address, String city, double credit) {
        super(name, address, city, credit);
    }

    @Override
    public boolean pay(int amount) {
        if ((credit - (double) amount) > 0) {
            this.credit -= (double) amount;
            return true;
        } else {
            System.out.println("insufficient funds");
            return false;
        }
    }
}