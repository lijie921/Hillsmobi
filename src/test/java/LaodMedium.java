import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.*;

public class LaodMedium
{
    @Test
    public void getMedium()
    {
        DriverInit.driver.navigate().back();
        PublicFunction pb=new PublicFunction();

        //点击medium按钮进入medium广告页面
        DriverInit.driver.findElement(By.id("com.unit.sample_all:id/medium")).click();
        pb.screenShot(DriverInit.driver, DriverInit.phoneName, "进入Medium主页");

        //点击Load按钮，加载广告
        DriverInit.driver.findElement(By.id("com.unit.sample_all:id/load1")).click();
        pb.screenShot(DriverInit.driver, DriverInit.phoneName, "Medium主页点击Load按钮");

        //点击getview按钮
        WebElement getviewMedium=pb.findElement(DriverInit.driver,"com.unit.sample_all:id/getView1");
        if(getviewMedium.isEnabled())
        {
            getviewMedium.click();
            pb.screenShot(DriverInit.driver, DriverInit.phoneName, "Medium主页点击getView按钮");
            WebElement showMedium=pb.findElement(DriverInit.driver,"com.unit.sample_all:id/show1");
            if(showMedium.isEnabled())
            {
                showMedium.click();
                pb.screenShot(DriverInit.driver, DriverInit.phoneName, "SuccessToLoadMedium");
                /*检查广告图片上的元素
                WebElement img=DriverInit.driver.findElementByClassName("android.widget.Image");
                if(img.isEnabled())
                {
                    pb.screenShot(DriverInit.driver, DriverInit.phoneName, "SuccessToLoadMedium");
                }
                else
                {
                    pb.screenShot(DriverInit.driver,DriverInit.phoneName,"FailToLoadMedium");
                }*/
            }
            else
            {
                pb.screenShot(DriverInit.driver,DriverInit.phoneName,"FailToShowMedium");
            }
        }
        else
        {
            pb.screenShot(DriverInit.driver,DriverInit.phoneName,"FailToLoadMedium");
        }
       // assertTrue(getviewMedium.isEnabled());
    }
}
