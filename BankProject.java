import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BankProject {
    @Test   // טסט מספר 1 יש בעיה
    public void depositTest() throws InterruptedException {
        xyz xyz1 = new xyz();
        String expectUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
        String actualUrl = xyz1.openSite1(expectUrl);
        Assert.assertEquals(expectUrl, actualUrl);
        System.out.println("smoke test ----> pass");


        String expectLabel = "Harry Potter";
        String actualLabel = xyz1.costumerLogin();
        Assert.assertEquals(actualLabel, expectLabel);
        System.out.println("page test-----> pass!!!");


        String expectTxt = "Deposit";
        String actualTxt = xyz1.deposit();
        Assert.assertEquals(actualTxt, expectTxt);
        System.out.println("Deposit test----> pass");

Thread.sleep(3000);
        String expectamount = "250";
        String actualamount = xyz1.Transaction();
        Assert.assertEquals(actualamount, expectamount);
        System.out.println("check amount ----> pass!!!!");
        xyz1.driver.quit();
    }

    @Test    //טסט מספר 4 עבר
    public void depAndWit() {
        xyz xyz1 = new xyz();
        String expectUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
        String actualUrl = xyz1.openSite1(expectUrl);
        Assert.assertEquals(expectUrl, actualUrl);
        System.out.println("smoke test ----> pass");


        String expectLabel = "Harry Potter";
        String actualLabel = xyz1.costumerLogin();
        Assert.assertEquals(actualLabel, expectLabel);
        System.out.println("page test-----> pass!!!");


        String expectTxt = "Deposit";
        String actualTxt = xyz1.deposit1000();
        Assert.assertEquals(actualTxt, expectTxt);
        System.out.println("Deposit1000 test----> pass");


        String expectWtrlTxt = "Transaction successful";
        String actualWtrlTxt = xyz1.withdrawl();
        Assert.assertEquals(expectWtrlTxt, actualWtrlTxt);
        System.out.println("withdrawl test-----> pass");

String expectAmount="750";
String actualAmount=xyz1.amount();
Assert.assertEquals(actualAmount,expectAmount);
        System.out.println("amount test -----> pass");
        xyz1.driver.quit();
    }
@Test    ////טסט מספר 6 עבר
    public  void depositAndCheck(){
    xyz xyz1 = new xyz();
    String expectUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
    String actualUrl = xyz1.openSite1(expectUrl);
    Assert.assertEquals(expectUrl, actualUrl);
    System.out.println("smoke test ----> pass");


    String expectLabel = "Hermoine Granger";
    String actualLabel = xyz1.costumerLoginHermoine();
    Assert.assertEquals(actualLabel, expectLabel);
    System.out.println("page test-----> pass!!!");


    String expectTxt = "Withdraw";
    String actualTxt = xyz1.withdrawl1500();
    Assert.assertEquals(actualTxt, expectTxt);
    System.out.println("Withdrawl1500 test----> pass");

String expectAmount ="1500";
String actualAmount=xyz1.TransactionHermoine();
Assert.assertEquals(expectAmount,actualAmount);
    System.out.println("transection test----> pass");

    xyz1.driver.quit();


}
@Test    /// טסט מספר 3  עבר
    public void newCustomer() throws InterruptedException {
    xyz xyz1 = new xyz();
    String expectUrl = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
    String actualUrl = xyz1.openSite1(expectUrl);
    Assert.assertEquals(expectUrl, actualUrl);
    System.out.println("smoke test ----> pass");



String expectName="Severus";
String actualName=xyz1.managerEnter(expectName);
Assert.assertEquals(expectName,actualName);
    System.out.println("open new customer test -----> pass");
    xyz1.driver.quit();
}





}
