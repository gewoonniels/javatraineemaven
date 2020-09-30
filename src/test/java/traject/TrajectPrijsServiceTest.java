package traject;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.ArgumentMatchers.anyInt;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class TrajectPrijsServiceTest {

    @InjectMocks
    private TrajectPrijsService target;

    @Mock
    private TrajectEenhedenNaarPrijsService naarPrijs;

    @Mock
    private TrajectNaarTrajectEenhedenService naarEenheden;


    @BeforeEach
    void setUp() {

    }

    @Test
    void getTracjectPrijs() {
        when(naarEenheden.getTrajectEenheden(anyString(), anyString())).thenReturn(0);
        when(naarPrijs.getPriceTrajectEenheden(anyInt())).thenReturn(33);

        int prijs = target.getTracjectPrijs("utrecht", "amsterdam");
        assertThat(prijs, is(33));
    }

    @Test
    void getInvalidLocationExceptionWhenUsingApeldoorn() {
        when(naarEenheden.getTrajectEenheden("apeldoorn", "apeldoorn")).thenThrow(InvalidLocationException.class);

        Assertions.assertThrows(InvalidLocationException.class, () -> {
            naarEenheden.getTrajectEenheden("apeldoorn", "apeldoorn");
        });
    }
}