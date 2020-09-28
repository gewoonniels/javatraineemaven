package chainstore;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CashRegister {

    private List<Card> cardList = new ArrayList();

    public CashRegister(Card... card) {
        for (Card c : card) {
            cardList.add(c);
        }
    }

    public void pay() {
        printCardOverview();

        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter the cardID:");
        String cardID = myObj.next();
        System.out.print("Enter the amount to pay:");
        String amount = myObj.next();

        for (int i = 0; i < cardList.size(); i++) {
            Card card = cardList.get(i);
            if (card.cardId == Integer.parseInt(cardID)) {
                card.pay(Integer.parseInt(amount));
            }
        }
        printCardOverview();
    }

    public void printCardOverview() {
        String returnString = String.format("%10s %10s %10s %10s \n", "CardId", "Name", "Credit", "Discount");
        for (int i = 0; i < cardList.size(); i++) {
            Card c = cardList.get(i);
            returnString += String.format("%10s %10s %10s %10s", c.cardId, c.name, c.credit, c instanceof GoldCard ? ((GoldCard) c).discount + "\n" : "\n");
        }
        System.out.println(returnString);
    }
}

