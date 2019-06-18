import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.*;

public class LoadBanner
{
    @Test
    public void getBanner()
    {
        DriverInit.driver.navigate().back();
        PublicFunction pb=new PublicFunction();

        //请求Banner广告:先点击Banner按钮，进入Banner广告页面
        DriverInit.driver.findElement(By.id("com.hillsmobi.test:id/banner")).click();
        pb.screenShot(DriverInit.driver, DriverInit.phoneName, "进入Banner主页");

        //点击Load按钮请求广告
        DriverInit.driver.findElement(By.id("com.hillsmobi.test:id/load1")).click();
        pb.screenShot(DriverInit.driver, DriverInit.phoneName, "Banner主页点击Load按钮");

        try
        {
            WebElement loadMessage = DriverInit.driver.findElement(By.id("com.hillsmobi.test:id/tv_msg_01"));
            if(loadMessage.isDisplayed())
            {
                pb.screenShot(DriverInit.driver,DriverInit.phoneName,"SuccessToShowBanner");
            }
            else
            {
                pb.screenShot(DriverInit.driver,DriverInit.phoneName,"FailToShowBanner");
            }
        }
        catch (Exception e){}
    }
}
