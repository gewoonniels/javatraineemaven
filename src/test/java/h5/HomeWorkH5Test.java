package h5;

import org.junit.Test;

import static org.junit.Assert.*;

public class HomeWorkH5Test {

    @Test
    public void FiboWithLength6ShouldEndOn8(){
        //given
            HomeWorkH5 h5 = new HomeWorkH5();
            int shouldBe = 8;
        //when
            int lastOfFibo = h5.fibo(6);
        //then
        assertEquals(shouldBe,lastOfFibo);
    }

}