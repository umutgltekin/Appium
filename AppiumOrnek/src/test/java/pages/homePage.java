package pages;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import util.ElementHelper;


public class homePage {
    By clickskip=MobileBy.id("com.lcwaikiki.android:id/tvNext");
    By clickTitle=MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.view.ViewGroup/android.widget.TextView");
    By clicIcon=MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView");
    By clickcategory=MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[3]/android.view.ViewGroup/android.widget.TextView");
    By clickProduct=MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.view.ViewGroup/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup[2]/android.widget.TextView");
    By clickname=MobileBy.xpath( "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/androidx.recyclerview.widget.RecyclerView[2]/android.view.ViewGroup[1]/androidx.viewpager.widget.ViewPager/androidx.recyclerview.widget.RecyclerView/android.view.ViewGroup/android.widget.ImageView");

    By addFavorite=MobileBy.id("com.lcwaikiki.android:id/productDetailFavorite");
    By closeProduct=MobileBy.id("com.lcwaikiki.android:id/productClose");
    By click=MobileBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.HorizontalScrollView/android.widget.LinearLayout/android.widget.LinearLayout[4]/android.view.ViewGroup/android.widget.ImageView");
    By checkProduct=MobileBy.id("com.lcwaikiki.android:id/productImageView");
    By remove=MobileBy.id("com.lcwaikiki.android:id/cardViewProduct");
    By checkEmpty=MobileBy.id("com.lcwaikiki.android:id/ivNoFavoriteList");

    AppiumDriver driver;
    WebDriverWait wait;
    ElementHelper elementHelper;

    public homePage(AppiumDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 10);
        this.elementHelper = new ElementHelper(driver);
    }
    public void clickSkipButon(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickskip)).click();
    }
    public void clickTitle(String title){
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickTitle)).click();

    }
    public void clickIcon(String Icon){
    wait.until(ExpectedConditions.visibilityOfElementLocated(clicIcon)).click();

    }
    public void clickCategory(String category){
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickcategory)).click();
    }
    public void clickProduct(String product ){
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickProduct)).click();

    }
    public void clickProductName(String name){
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickname)).click();

    }
    public void addFavorite(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(addFavorite)).click();

    }
    public void closeProduct(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(closeProduct)).click();

    }
    public void click(String str){
        wait.until(ExpectedConditions.visibilityOfElementLocated(click)).click();
    }
    public void checkProductFavorite(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkProduct));

    }
    public void removeProduct(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(remove)).click();

    }
    public void checkEmptyFavorite(){
        wait.until(ExpectedConditions.visibilityOfElementLocated(clickTitle)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(click)).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(checkEmpty));

    }

}
