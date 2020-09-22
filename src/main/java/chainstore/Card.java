package chainstore;


public abstract class Card {
    public final int cardId = 1 + (int) (Math.random() * 999999);
    public String name;
    public String address;
    public String city;
    public double credit;

    public Card(String name, String address, String city, double credit) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.credit = credit;
    }

    public abstract boolean pay(int amount);


}
