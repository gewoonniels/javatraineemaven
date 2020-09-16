package h5;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Lab5Test {

    @Test
    public void shouldGiveGreatestInt() {
        //given
        Lab5 l5 = new Lab5();
        int a = 3;
        int b = 4;
        //when
        int greatest = l5.greatest(a, b);
        //then
        assertEquals(b, greatest);
    }

    @Test
    public void shouldGiveGreatestIntWithMoreThanTwoIntegers() {
        //given
        Lab5 l5 = new Lab5();
        int a = 3;
        int b = 4;
        int c = 2;
        int d = 5;
        //when
        int greatest = l5.greatest(a, b, c, d);
        //then
        assertEquals(d, greatest);
    }

    @Test
    public void shouldGiveLongestString() {
        //given
        Lab5 l5 = new Lab5();
        String a = "kort";
        String b = "DezeStringIsVeelLanger";
        //when
        String greatest = l5.greatest(a, b);
        //then
        assertEquals(b, greatest);
    }

    @Test
    public void factorial10ShouldBe25() {
        //given
        Lab5 l5 = new Lab5();
        int n = 5;
        int intOutComeShouldBe = 120;
        //when
        int outcome = l5.factorial(n);
        //then
        assertEquals(intOutComeShouldBe, outcome);
    }


}