//import static org.junit.Assert.*;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LoadNative
{
    @Test
    public void getNative()
    {
        PublicFunction pb=new PublicFunction();

        //请求native广告:先点击native按钮，进入native广告页面
        DriverInit.driver.findElement(By.id("com.hillsmobi.test:id/Native")).click();
        pb.screenShot(DriverInit.driver,DriverInit.phoneName,"进入Native主页");

        //点击Load按钮请求广告
        DriverInit.driver.findElement(By.id("com.hillsmobi.test:id/load1")).click();
        pb.screenShot(DriverInit.driver,DriverInit.phoneName,"Native页面点击load按钮");

        try
        {
            WebElement loadMessage = DriverInit.driver.findElement(By.id("com.hillsmobi.test:id/tv_msg_01"));
            if(loadMessage.isDisplayed())
            {
                pb.screenShot(DriverInit.driver,DriverInit.phoneName,"SuccessToLoadNative");
            }
            else
            {
                pb.screenShot(DriverInit.driver,DriverInit.phoneName,"FailToLoadNative");
            }
        }
        catch (Exception e){}
    }
}
