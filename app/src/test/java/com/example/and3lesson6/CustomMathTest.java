package com.example.and3lesson6;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CustomMathTest {

    private CustomMath math;

    @Before
    public void setUp() {
        math = new CustomMath();
        System.out.println("Before");
    }

    @Test
    public void simpleAddCase() {
        assertEquals("6", math.add("4","2"));
        System.out.println("simpleAddCase");
    }

    @After
    public void tearDown() {
        math = null;
        System.out.println("After");
    }

    @Test
    public void emptyFieldCase() {
        assertEquals("0",math.add("",""));
        System.out.println("emptyFieldCase");
    }
    @Test
    public void wordFieldCase() {
        assertEquals("необходимо вводить цифры",math.add("a","s"));
        System.out.println("wordFieldCase");

    }
    @Test
    public void spaceFieldCase() {
        assertEquals("10", math.add("   5", "   5  "));
        System.out.println("spaceFieldCase");
    }

    @Test
    public void divideByZero() {
        assertEquals("нельзя делить на ноль", math.div("3","0"));
        System.out.println("divideByZero");
    }

    public void simpleTwoWordsReverse() {
        assertEquals("World Hello", math.reverseString("Hello World"));
        System.out.println("simpleTwoWordsReverse");
    }

    public void simpleThreeAndMoreWordsReverse() {
        assertEquals("Four Three Two One", math.reverseString("One Two Three Four"));
        System.out.println("simpleThreeAndMoreWords");
    }

    public void spaceWordsRevers() {
        assertEquals("Four Three Two One", math.reverseString("    One Two Three Four   "));
        System.out.println("simpleThreeAndMoreWords");
    }

}
