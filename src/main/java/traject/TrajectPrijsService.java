package traject;

public class TrajectPrijsService {

    TrajectNaarTrajectEenhedenService trajectNaarEenheden = new TrajectNaarTrajectEenhedenService();
    TrajectEenhedenNaarPrijsService trajectNaarPrijs = new TrajectEenhedenNaarPrijsService();

    public int getTracjectPrijs(String from, String to) {
        int eenheden = trajectNaarEenheden.getTrajectEenheden(from, to);
        int prijs = trajectNaarPrijs.getPriceTrajectEenheden(eenheden);
        return prijs;
    }

    public void setTrajectNaarTrajectEenheden(TrajectNaarTrajectEenhedenService eenheden) {
        this.trajectNaarEenheden = eenheden;
    }

    public void setEenhedenNaarPrijs(TrajectEenhedenNaarPrijsService prijs) {
        this.trajectNaarPrijs = prijs;
    }


}
