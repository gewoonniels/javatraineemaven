package traject;

public class TrajectNaarTrajectEenhedenService {

    public int getTrajectEenheden(String from, String to) {
        // calculate traject eenheden from route
        if (from.toLowerCase().equals("apeldoorn") || to.toLowerCase().equals("apeldoorn")) {
            throw new InvalidLocationException();
        }

        return 2;
    }
}
