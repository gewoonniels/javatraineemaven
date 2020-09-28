package traject;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

class TrajectPrijsServiceTest {

    private TrajectPrijsService target;

    @BeforeEach
    void setUp() {
        target = new TrajectPrijsService();
    }

    @Test
    void getTracjectPrijs() {
        TrajectNaarTrajectEenhedenService naarEenheden = Mockito.mock(TrajectNaarTrajectEenhedenService.class);
        TrajectEenhedenNaarPrijsService naarPrijs = Mockito.mock(TrajectEenhedenNaarPrijsService.class);

        when(naarEenheden.getTrajectEenheden(anyString(), anyString())).thenReturn(0);
        when(naarPrijs.getPriceTrajectEenheden(anyInt())).thenReturn(33);

        target.setTrajectNaarTrajectEenheden(naarEenheden);
        target.setEenhedenNaarPrijs(naarPrijs);

        int prijs = target.getTracjectPrijs("utrecht", "amsterdam");
        assertThat(prijs, is(33));

    }
}