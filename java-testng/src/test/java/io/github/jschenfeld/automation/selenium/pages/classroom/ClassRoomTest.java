package io.github.jschenfeld.automation.selenium.pages.classroom;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.github.jschenfeld.automation.selenium.MobileBaseTest;
import io.github.jschenfeld.automation.selenium.pages.youtube.BaseScreen;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.net.MalformedURLException;
import java.util.List;

public class ClassRoomTest extends BaseScreen {

    public ClassRoomTest(WebDriver driver) throws MalformedURLException, InterruptedException {
        super((AndroidDriver<WebElement>) driver);
        switchToNativeView();
    }

    @AndroidFindBy(id = "com.google.android.apps.classroom:id/course_photo")
    private MobileElement firstLink;

    @AndroidFindBy(id = "com.google.android.youtube:id/search_edit_text")
    private MobileElement searchBox;

    @AndroidFindBy(id = "com.google.android.youtube:id/title")
    private MobileElement titleDevWeek;

    @AndroidFindBy(id="com.google.android.youtube:id/video_info_view")
    private List<MobileElement> devWeekVideos;

    @AndroidFindBy(id="com.google.android.youtube:id/results")
    private MobileElement results;

    public void tapOnFirstLink() {
        tapElementWait(firstLink, 15);
    }

    public void clickFirstLink() throws InterruptedException{
        firstLink.click();
    }



}
