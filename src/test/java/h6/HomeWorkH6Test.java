package h6;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HomeWorkH6Test {

    @Test
    public void LengthShouldBe8AfterDoubling4() {
        //given
        HomeWorkH6 h6 = new HomeWorkH6();
        long[] initArray = new long[]{1L, 2L, 3L, 4L};
        int lengthToBe = 8;
        //when
        initArray = h6.doubleArraySize(initArray);
        //then
        assertEquals(initArray.length, lengthToBe);

    }

}