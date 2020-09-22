package chainstore;

public class GoldCard extends Card {

    public int discount;

    public GoldCard(String name, String address, String city, double credit, int discount) {
        super(name, address, city, credit);
        this.setDiscount(discount);
    }

    public void setDiscount(int discount) {
        if (discount >= 1 && discount <= 30) {
            this.discount = discount;
        } else {
            throw new RuntimeException();
        }
    }

    @Override
    public boolean pay(int amount) {
        double priceWithDiscount = amount - ((double) (amount) / 100.0 * discount);
        if ((credit - priceWithDiscount) > 0) {
            this.credit -= amount;
            return true;
        } else {
            System.out.println("insufficient funds");
            return false;
        }
    }
}
