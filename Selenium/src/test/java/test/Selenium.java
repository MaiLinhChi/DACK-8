/*
1. Vào trang https://www.vergency.vn/
2. Vào trang đăng nhập
3. Nhấn vào link đăng ký
4. Nhập thông tin đăng ký
5. Nhấn nút đăng ký
*/
package test;

import driver.driverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import static java.lang.Thread.sleep;

@Test
public class Selenium {
    public static void testWebsite() {
        WebDriver driver = driverFactory.getChromeDriver();
        try {
            // Vào trang web
            driver.get("https://hoang-phuc.com/");
            String pageURL = driver.getCurrentUrl();
            String pageTitle = driver.getTitle();
            sleep(6000);

            // Tắt quảng cáo
//            By elementClose = By.id("cdp-web-modal-924512-close");
//            WebElement btnClose = driver.findElement(elementClose);
//            btnClose.click();
//            sleep(1000);

            // Chọn một sản phẩm bất kỳ
            By elementProduct = By.xpath("//div[1]/div[1]/div[5]/div[1]/div[1]/div[5]/div[1]/div[1]/div[1]/div[1]");
            WebElement btnProduct = driver.findElement(elementProduct);
            btnProduct.click();
            sleep(4000);


            // Thêm sản phẩm vào giỏ hàng
            By elementAddProduct = By.xpath("//div[1]/div[2]/div[2]/section[8]/div[1]/button[2]");
            WebElement btnAddProduct = driver.findElement(elementAddProduct);
            btnAddProduct.click();
            sleep(4000);

            // Nhập họ và tên
            driver.findElement(By.xpath("//div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]")).clear();
            driver.findElement(By.xpath("//div[1]/div[1]/div[2]/div[1]/div[2]/div[1]/input[1]")).sendKeys("Mai Linh Chí");

            // Nhập số điện thoại
            driver.findElement(By.xpath("//div[1]/div[2]/div[1]/div[2]/div[2]/input[1]")).clear();
            driver.findElement(By.xpath("//div[1]/div[2]/div[1]/div[2]/div[2]/input[1]")).sendKeys("0569055398");

            // Chọn vào input Thành Phố
            By elementInputCity = By.xpath("//div[2]/div[2]/div[1]/div[1]/div[1]/div[1]/input[1]");
            WebElement clickInput = driver.findElement(elementInputCity);
            clickInput.click();
            // Chọn Thành Phố
            By elementCity = By.xpath("//div[1]/div[2]/div[2]/p[1]");
            WebElement btnCity = driver.findElement(elementCity);
            btnCity.click();
            sleep(2000);

            // Chọn vào input Quận
            By elementInputDistrict= By.xpath("//div[2]/div[1]/div[2]/div[1]/div[1]/input[1]");
            WebElement clickInputDistrict = driver.findElement(elementInputDistrict);
            clickInputDistrict.click();
            // Chọn Quận
            By elementDistrict = By.xpath("//div[1]/div[2]/div[2]/p[1]");
            WebElement btnDistrict = driver.findElement(elementDistrict);
            btnDistrict.click();
            sleep(2000);

            // Chọn vào input Phường
            By elementInputWard = By.xpath("//div[2]/div[1]/div[3]/div[1]/div[1]/div[1]/input[1]");
            WebElement clickInputWard = driver.findElement(elementInputWard);
            clickInputWard.click();
            // Chọn phường
            By elementWard = By.xpath("//div[1]/div[2]/div[2]/p[1]");
            WebElement btnWard = driver.findElement(elementWard);
            btnWard.click();
            sleep(4000);

            // Nhập địa chỉ nhà
            driver.findElement(By.xpath("//div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/input[1]")).clear();
            driver.findElement(By.xpath("//div[3]/div[1]/div[2]/div[2]/div[2]/div[1]/input[1]")).sendKeys("98/2 Tân Hòa Đông");

            // Chọn nút giao hàng
            By elementShip = By.xpath("//div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]");
            WebElement btnShip = driver.findElement(elementShip);
            btnShip.click();
            sleep(1000);
            btnShip.click();
            sleep(2000);

            // Nhập ghi chú
            driver.findElement(By.xpath("//div[1]/div[3]/div[1]/div[4]/div[1]/input[1]")).clear();
            driver.findElement(By.xpath("//div[1]/div[3]/div[1]/div[4]/div[1]/input[1]")).sendKeys("Gì cũng có mua hết ở shopee");
            sleep(2000);

            // Chọn phương thức thanh toán
            By elementCheckout = By.xpath("//div[2]/form[1]/div[1]/div[3]/div[1]/div[2]/div[2]/div[1]/div[1]");
            WebElement btnCheckout = driver.findElement(elementCheckout);
            btnCheckout.click();
            sleep(1000);
            btnCheckout.click();
            sleep(2000);

            // Nhập mã giảm giá
            driver.findElement(By.xpath("//div[3]/div[1]/div[5]/div[1]/div[2]/div[1]/input[1]")).clear();
            driver.findElement(By.xpath("//div[3]/div[1]/div[5]/div[1]/div[2]/div[1]/input[1]")).sendKeys("Hãy mua hàng ở shoppe");
            sleep(2000);

            // Chọn đặt hàng
//            By elementOrder = By.xpath("//div[1]/div[3]/div[1]/div[3]/div[1]/div[1]/div[1]/div[1]");
//            WebElement btnOrder = driver.findElement(elementOrder);
//            btnOrder.click();
//            sleep(10000);

        }catch (Exception e) {
            e.printStackTrace();
        }
        driver.quit();
    }
}