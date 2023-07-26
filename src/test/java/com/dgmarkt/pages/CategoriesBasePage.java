package com.dgmarkt.pages;
import com.dgmarkt.utilities.Driver;
import org.openqa.selenium.By;
import com.dgmarkt.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import java.util.List;


public class CategoriesBasePage extends BasePage {

    //here we will be locating web elements and implementing functions that are same in the all categories

    @FindBy(tagName = "h1")
    public WebElement categoryTitle;

    @FindBy(id = "input-sort")
    public WebElement sortingInput;

    @FindBy(xpath = "//select[@id='input-sort']/option[@selected='selected']")
    public WebElement sortInputSelected;

    @FindBy(id = "input-limit")
    public WebElement limitInput;

    @FindBy(id = "compare-total")
    public WebElement compareProductNav;

    @FindBy(xpath = "//div[@class='inner']/h4")
    public List<WebElement> productsList;

    @FindBy(xpath = "//div[@class='box-price']/p")
    public List<WebElement> pricesList;

    @FindBy(xpath = "//div[@class='list-group-item']")
   public WebElement PriceSlider;

    @FindBy(xpath = "//div[@id='slider-price']")
     public WebElement PriceSlider2;

    @FindBy(xpath = "//input[@placeholder='Min']")
    public WebElement MinText;

    @FindBy(xpath = "//input[@placeholder='Max']")
    public WebElement MaxText;

    @FindBy(xpath = "(//div[@id='slider-price']//span)[1]")
    public WebElement PriceSliderMin;

    @FindBy(xpath = "(//div[@id='slider-price']//span)[2]")
    public WebElement PriceSliderMax;


    public void selectViewOption(String viewOption) {

        //clicking to the option
        Driver.get().findElement(By.xpath("//button[@title='" + viewOption + "']")).click();

    }

    @FindBy(css = ".product-item")
    public WebElement firstProduct;


    @FindBy(css = ".button-cart")
    public WebElement firstAddToCart;


    public void goToProductPage(String productName) {
        WebElement product = Driver.get().findElement(By.xpath("//img[@title='" + productName + "']"));
        BrowserUtils.scrollToElement(product);
        BrowserUtils.clickWithJS(product);
        Driver.get().findElement(By.xpath("//button[@id='button-cart']")).click();
    }

    public void hoverAndAddProduct(String productName) {

        WebElement product = Driver.get().findElement(By.xpath("(//img[contains(@title,'" + productName + "')])[2]"));
        BrowserUtils.scrollToElement(product);

        BrowserUtils.hover(product);
        WebElement cart = Driver.get().findElement(By.xpath("//img[contains(@title,'" + productName + "')]/../../../..//span[text()='Add to Cart']/.."));

        cart.click();
    }

    /**
     * This method is created for select a product with its order/index number on a category page,
     * Exp: first product in the category
     *         5. product in the category
     * @param number
     */
    public void selectProductWithIndex(int number) {
        WebElement product = Driver.get().findElement(By.xpath("(//*[@class='product-item'])[" + number + "]"));
        BrowserUtils.scrollToElement(product);
        BrowserUtils.hover(product);
        WebElement addToCartButton = Driver.get().findElement(By.xpath("(//*[@class='button-cart'])[" + number + "]"));
        addToCartButton.click();
    }



}

