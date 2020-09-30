package scannerfunc;

import org.hamcrest.CoreMatchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;
import static org.mockito.Mockito.doNothing;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class ScannerFunctionsTest {

    @InjectMocks
    private ScannerFunctions scannerfunctions;

    @Mock
    private ScannerWrapper scannerwrapper;

    @BeforeEach
    void setUp() {
    }

    @Test
    void ReturnLengthShouldBe2ByJo() {
        when(scannerwrapper.read()).thenReturn("JO");
        int length = scannerfunctions.returnInputLength();
        assertThat(length, is(2));
    }

    @Test
    void scannerOut() {
        when(scannerwrapper.read()).thenReturn("banaan", "appel", "niels");
        ArgumentCaptor<String> arg = ArgumentCaptor.forClass(String.class);
        doNothing().when(scannerwrapper).write(arg.capture());
        scannerfunctions.run();
        List<String> allValues = arg.getAllValues();
        assertThat(allValues.get(0).trim(), CoreMatchers.is("banaan"));
    }

}