package leapyearcheck;

import org.junit.Test;
import static org.junit.Assert.*;

public class LeapYearCheckTest {
    
    public LeapYearCheckTest() {
    }

    @Test
    public void testDaysInFebruary() {
        System.out.println("daysInFebruary");
        assertEquals("2000 is invalid",29, LeapYearCheck.daysInFebruary(2000)); //test case 1
        assertEquals("2001 is invalid",28, LeapYearCheck.daysInFebruary(2001)); //test case 2
        assertEquals("1904 is invalid",29, LeapYearCheck.daysInFebruary(1904)); //test case 3
        assertEquals("1900 is invalid",28, LeapYearCheck.daysInFebruary(1900)); //test case 4
        assertEquals("2020 is invalid",29, LeapYearCheck.daysInFebruary(2020)); //test case 5
        assertEquals("2015 is invalid",28, LeapYearCheck.daysInFebruary(2015)); //test case 6
        assertEquals("2012 is invalid",29, LeapYearCheck.daysInFebruary(2012)); //test case 7
        assertEquals("1950 is invalid",28, LeapYearCheck.daysInFebruary(1950)); //test case 8
        assertEquals("2004 is invalid",29, LeapYearCheck.daysInFebruary(2004)); //test case 9
        assertEquals("2100 is invalid",28, LeapYearCheck.daysInFebruary(2100)); //test case 10
    } //end testDaysInFebruary

    @Test
    public void testIsLeapYear() {
        System.out.println("isLeapYear");
        assertTrue("2000 is invalid",LeapYearCheck.isLeapYear(2000)); //test case 1
        assertFalse("2001 is invalid",LeapYearCheck.isLeapYear(2001)); //test case 2
        assertTrue("1904 is invalid",LeapYearCheck.isLeapYear(1904)); //test case 3
        assertFalse("1900 is invalid",LeapYearCheck.isLeapYear(1900)); //test case 4
        assertTrue("2020 is invalid",LeapYearCheck.isLeapYear(2020)); //test case 5
        assertFalse("2015 is invalid",LeapYearCheck.isLeapYear(2015)); //test case 6
        assertTrue("2012 is invalid",LeapYearCheck.isLeapYear(2012)); //test case 7
        assertFalse("1950 is invalid",LeapYearCheck.isLeapYear(1950)); //test case 8
        assertTrue("2004 is invalid",LeapYearCheck.isLeapYear(2004)); //test case 9
        assertFalse("2100 is invalid",LeapYearCheck.isLeapYear(2100)); //test case 10
    } //end testIsLeapYear
    
} //end LeapYearCheckTest

