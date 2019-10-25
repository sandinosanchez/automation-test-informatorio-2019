package io.github.jschenfeld.automation.selenium.utils;

import io.github.jschenfeld.automation.selenium.MobileBaseTest;
import io.github.jschenfeld.automation.selenium.pages.classroom.ClassRoomTest;
import io.github.jschenfeld.automation.selenium.pages.youtube.HomeScreenYoutube;
import org.testng.annotations.Test;

import java.net.MalformedURLException;

import static org.testng.Assert.assertEquals;

public class TestClassRoom extends MobileBaseTest {


    @Test
    public void selectOpenAmesTest() throws MalformedURLException, InterruptedException{
        ClassRoomTest classRoomTest = new ClassRoomTest(getDriver());
        classRoomTest.clickFirstLink();
    }
}
