# LeapYearCheckProject
SDEV 1060 Project. 
In this project, the user enters a year; the response specifies the number of days in February in that year, and whether or not it is a leap year. This requires 2 methods, one that returns an integer for the number of days in February of the specified year (used in the first line of the output), and one that returns a Boolean which is true if the year IS a leap year, and false if the year is NOT a leap year (used in the second line of the output). Both methods do the same work; the return value is the only difference. The Main method asks the user for the year, calls both methods, puts together the strings for the output lines, and does the printing of those string results. Note: This project will use static helper methods, not in a separate class but in the same file with the Main method. In previous project, the methods to be tested existed in a separate class from the main class -- here, they will not be in a separate class, they are part of Main, with "static" attribute.   To focus on testing these methods, most of the code is provided to you.  The main method will do the following work (written in pseudocode -- you need to write that code in Java or C# as needed):      Display the header of "Leap Year Check by Student Name"     Display the question: "Enter year:"     Get the user's input, an integer, 4 digits for the year     Call the method to get the number of days in Feb for that input year, and store the integer that it returns in a variable     Print out the line "Number of days in Feb is " and the variable for that number that was returned from the method     Call the method to get the Boolean about whether it is or is not a leap year for that input year, and store the Boolean that comes back in a variable     If that Boolean variable is true, print "This year IS a leap year", else print "this year is NOT a leap year"  The methods to get the integer and Boolean values need to be static helper methods, written in the same file as the main method, not in a separate class. The method that returns the number of days in February is "daysInFeb"; the method that returns the Boolean is "checkLeapYear". Create the project and make sure it runs as expected, producing the results shown in the examples at the top.     Testing: Accessing methods that are not in a separate class  In previous projects, which had a separate class that contained the methods you wanted to test, you instantiated an object from that class in your unit tests, then referenced the methods through that object. Since this project does not contain a class for the methods, you won't instantiate an object because there is no separate class. Instead, you have to be able to call those static helper methods that exist in the main file, where you find the main method. You might consider that the "object" through which you can access those helper methods is the program itself.  Look at the top of the file that contains the main method.   In Java, the file begins with "package" and the name of the project you created, any needed import statements, and "public class ProjectName", where ProjectName is the project name you supplied. This line "public class ProjectName" has an opening curly brace below it, the beginning of a code block. There is a matching closing curly brace at the very bottom of the file. Everything else in the file is inside of that code block. This class with the name you provided is the one you have to reference in the unit tests to get to the helper methods. Now you can do the usual work of adding a unit test package (Java) or project (C#).     Writing tests for methods that are not in separate classes  Follow the usual procedure to create the unit test package (Java) / project (C#).  Add unit tests to check if both methods are working correctly. These tests will use multiple assertions to test each method multiple times in one test.  In Java, the code to test the number of days in the specified year calls the method "daysInFeb" like this:  assertEquals(28, LeapYearCheck.daysInFeb(2007));  Notice the reference to the public class name at the top of the main file (LeapYearCheck), rather than a reference to an instantiated object from a separate class.  In C#, the code to test the number of days in the specified year calls the method "daysInFeb" like this::  Assert.AreEqual(28, Program.daysInFeb(2007));  Notice the reference to Program, the public class name at the top of the main file, rather than a reference to an instantiated object from a separate class.     New Assertions for Booleans  You already know how to test if an integer is correct. How do you test if the correct Boolean was returned? There is an assertion for that. In Java, use "assertTrue", also its opposite, "assertFalse".  In C#, use "Assert.IsTrue" and its opposite, "Assert.IsFalse". The pattern for this assertion is:  Java:    assertTrue(method call)  C#:    Assert.IsTrue(method call)  For example, the test method calls a method named "isValid(someData )" which returns a Boolean. That test would be:  Java:    assertTrue(ProjectName.isValid(someData));  C#:    Assert.IsTrue(Program.isValid(someData));  If the method under test returns true, as asserted, then the test passes; if it returns false, the test fails.   If you are testing a method that should return a Boolean value of false, you can use the assertion (Java) assertFalse  / (C#) Assert.IsFalse. Then that expected result of false would pass the test -- the test asserts the Boolean will be false, and if it is, the test is true and it passes. You will see how this assertion that the Boolean is false can be the correct result below, in the Leap Year project.  If a test that returns a Boolean runs and the assertion fails, the system prints out some unhelpful messages, such as (Java) "junit.framework.AssertionFailedError" or (C#) "Message: Assert.IsTrue failed". This is not very helpful without further examination of the code. If you want to display a more helpful message when the assertion fails, the assertion methods provide an optional parameter for a message. You could write:  Java:    assertTrue("optional message here", ProjectName.isValid(someData));  C#:    Assert.IsTrue(Program.isValid(someData), "optional message here");  The same optional message is available in the (Java) assertFalse and (C#) Assert.IsFalse assertions.  When the assertion returns false, the test fails and displays that message you included in the assertion. You've seen that a failed (Java) assertEquals or (C#) Assert.AreEqual test displays a message explaining that the expected result was X and the actual result was Y -- that is a helpful message, generated automatically by the compiler. The automatic message when a Boolean is incorrect is less helpful. You can make the tests much better if you include a helpful message in the (Java) assertTrue/assertFalse or (C#) Assert.IsTrue/Assert.IsFalse tests.   For example, using the isValid(someData) example, if the data 50 is invalid, the test could be:  Java:    assertTrue("50 is invalid", ProjectName.isValid(50));  C#:    Assert.IsTrue(Program.isValid(50), "50 is invalid");  The message "50 is invalid" displays in the error message pane, where it shows the test failed. This is very helpful when there are multiple assertions in the test. If there are 20 assertions and 1 fails, how do you know which one has a problem? If you add a message that specifies which test value fails, then it can pinpoint which test needs more attention. Don't use a simple message like "test failed" -- add enough detail so it tells you exactly which test failed, such as the value being tested.   Java:  Java Boolean messagesNotice "50 is invalid" in the last line, that is the message included in the test.  C#:  C sharp boolean messageNotice "50 is invalid", from the message in the test, in the bottom portion with the standard messages.   You can use that optional message parameter in all assertions, such as (Java) assertEquals or (C#) Assert.AreEqual. If the assertion fails, the message appears in the details about that failure.     This Project  In your project, test the two methods that check if a year is a leap year. One method returns an integer -- use (Java) assertEquals or (C#) Assert.AreEqual to test that the expected result is equal to that actual result. One method returns a Boolean -- test that the Boolean returned is the expected Boolean. That means that if the Boolean should be true (it IS a leap year), then assert that it is true -- use (Java) assertTrue or (C#) Assert.IsTrue. If the Boolean should be false (it is NOT a leap year), assert that it is false -- use (Java) assertFalse or (C#) Assert.IsFalse. You know that 2007 is NOT a leap year, for example -- the method under test is behaving correctly if it returns False, that it is NOT a leap year, so a good test is to assert that the Boolean is false when the input year is 2007. To test the Boolean method, then you need a mixture of assertions that the result is True and assertions that the result is False.  Use the following test cases for both methods:  2000 (it IS a leap year, 29 days in Feb) 2001 (it is NOT a leap year, 28 days in Feb) 1904 (it IS a leap year, 29 days in Feb) 1900 (it is NOT a leap year, 28 days in Feb) 2020 (it IS a leap year, 29 days in Feb) 2015 (it is NOT a leap year, 28 days in Feb) 2012 (it IS a leap year, 29 days in Feb) 1950 (it is NOT a leap year, 28 days in Feb) 2004 (it IS a leap year, 29 days in Feb) 2100 (it is NOT a leap year, 28 days in Feb)  Take a screenshot of the running project with one of the dates that IS a leap year and another screenshot with one of the dates that is NOT a leap year.  In the testing code, use multiple assertions so all 10 tests for each test method run at once. Make sure to write them so that all 10 tests will pass (use the appropriate assertions about whether the Boolean method will return true or false). Verify that all tests pass, and take a screenshot of that result.  In each test method, add a test for the year 2032 -- it IS a leap year. Make this test fail. When testing for the integer, use 28 as the expected result, which is an error because the method should calculate that there are 29 days in Feb 2032. When testing for the Boolean, assert that the expected result is false, which is incorrect, because 2032 IS a leap year. Add the message string "testing 2032, it IS a leap year" to both of these incorrect tests. You should have 11 tests for each method, and the final one for 2032 should fail. Make sure it is the final one in the series of assertions.   Take a screenshot of the result of running 11 tests in each test method, with the final test purposefully failing -- be sure to capture the extra message on the failed tests    
Submission: screenshots as specified, and the root folder for the project


== We're Using GitHub Under Protest ==

This project is currently hosted on GitHub.  This is not ideal; GitHub is a
proprietary, trade-secret system that is not Free and Open Souce Software
(FOSS).  We are deeply concerned about using a proprietary system like GitHub
to develop our FOSS project.  We have an
[open {bug ticket, mailing list thread, etc.} ](INSERT_LINK) where the
project contributors are actively discussing how we can move away from GitHub
in the long term.  We urge you to read about the
[Give up GitHub](https://GiveUpGitHub.org) campaign from
[the Software Freedom Conservancy](https://sfconservancy.org) to understand
some of the reasons why GitHub is not a good place to host FOSS projects.

If you are a contributor who personally has already quit using GitHub, please
[check this resource](INSERT_LINK) for how to send us contributions without
using GitHub directly.

Any use of this project's code by GitHub Copilot, past or present, is done
without our permission.  We do not consent to GitHub's use of this project's
code in Copilot.

![Logo of the GiveUpGitHub campaign](https://sfconservancy.org/img/GiveUpGitHub.png)
