import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class xyz {


    //Data
    WebDriver driver;


    //Ctor

    public xyz() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\galip\\Desktop\\chromedriver_win32\\chromedriver.exe");
        this.driver = new ChromeDriver();
        this.driver.manage().timeouts().implicitlyWait(4, TimeUnit.SECONDS);
        this.driver.manage().window().maximize();
    }


    //func
    public String openSite1(String url) {
        this.driver.get(url);
        return this.driver.getCurrentUrl();
    }
//1
    public String costumerLogin() {
        WebElement costomerLogin = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.borderM.box.padT20 > div:nth-child(1) > button")); //לחיצה על כפתור הכניסה במשתמש רגיל
        String loginPage = this.driver.getCurrentUrl(); // מביא לי את הurl של דף הכניסה
        costomerLogin.click();
        String customersSelect = this.driver.getCurrentUrl(); // מביא לי את הurl  של הדף של בחירת המשתמשים
        WebElement customerSelect = this.driver.findElement(By.id("userSelect")); // לחיצה על החלון שפותח לי את אפשרויות המשתמשים
        customerSelect.click();
        WebElement selectHarry = this.driver.findElement(By.cssSelector(" #userSelect > option:nth-child(3)")); // בחירה בהארי פוטר
        selectHarry.click();
        WebElement loginBT = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > form > button")); //לחיצה על login
        loginBT.click();
        WebElement harryPotertxt = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div:nth-child(1) > strong > span")); // מחזיר לי את טקסט מהעמוד כדי שאדע שבאמת זה נכנס להארי פוטר
        return harryPotertxt.getText();
    }

    public String deposit() {
        WebElement depositBtn = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div:nth-child(5) > button:nth-child(2)")); // לחיצה על כפתור הdeposit
        depositBtn.click();
        WebElement depositBoxTxt = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > div > input")); //לחיצה על המקום שבוא מכניסים את את הסכום
        depositBoxTxt.click();
        depositBoxTxt.sendKeys("250"); // הכנסת סכום "250"
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement depositAgree = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > button")); // לחיצה על כפתור  האישור
        depositAgree.click();
        WebElement depositAgreeTxt = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > span")); // מחזיר לי את הטקסט לאחר שהפעולה בוצעה
        return depositAgree.getText();
    }

    public String Transaction() {
        WebElement transaction = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div:nth-child(5) > button:nth-child(1)")); //לחיצה על כפתור הtransaction
        transaction.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement transactionTxt = this.driver.findElement(By.cssSelector("#anchor0 > td:nth-child(2)")); // מחזיר לי טקסט שאדע שבאמת נכנסו 250
        return transactionTxt.getText();

    }

    public void closeSite (){
        this.driver.quit();
    }


//4
    public String deposit1000() {
        WebElement depositBtn = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div:nth-child(5) > button:nth-child(2)")); //לחיצה על deposit
        depositBtn.click();
        WebElement depositBoxTxt = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > div > input")); // לחיצה על המקום שבו מכניסים את הסכום
        depositBoxTxt.click();
        depositBoxTxt.sendKeys("1000"); // שליחה של 1000 לטקסט
        WebElement depositAgree = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > button")); // לחיצה על אישור
        depositAgree.click();
        WebElement depositAgreeTxt = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > span")); // מחזיר לי טקסט שאדע שהפעולה עברה בהצלחה
        return depositAgree.getText();

    }

    public String withdrawl() {
        WebElement withdrawlBtn = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div:nth-child(5) > button:nth-child(3)")); //לחיצה על כפתןר withdrawl
        withdrawlBtn.click();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement withdrawlTxtBox = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > div > input"));//לחיצה על מכום שבו מכניסים את הסכום
        withdrawlTxtBox.sendKeys("250");  //שליחה של 250

        WebElement withdrawlAgreeBtn = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > button")); //לחיצה על אישור פעולה
        withdrawlAgreeBtn.click();
        WebElement withdrawlAgreeTxt = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > span")); // מחזיר לי טקטס שאדע שהפעולה עברה בהצלחה
        return withdrawlAgreeTxt.getText();

    }


    public void quit() {
        this.driver.quit();
    }
public String amount (){
        WebElement amount=this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div:nth-child(3) > strong:nth-child(2)")); // מחזיר לי טקסט שאדע שהפעולה עברה בהצלחה ושיש לי את הסכום הרצוי
        return amount.getText();


    }

//6
    public String withdrawl1500()  {
        WebElement withdrawlBtn = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div:nth-child(5) > button:nth-child(3)"));
        withdrawlBtn.click();
        WebElement withdrawlBoxTxt = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > div > input"));
        withdrawlBoxTxt.click();
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        withdrawlBoxTxt.sendKeys("1500");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        WebElement withdrawlAgree = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > form > button"));
        withdrawlAgree.click();
        WebElement withdrawlAgreeTxt = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.container-fluid.mainBox.ng-scope > div > span"));
        return withdrawlAgree.getText();}


    public String costumerLoginHermoine() {
        WebElement costomerLogin = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.borderM.box.padT20 > div:nth-child(1) > button"));
        String loginPage = this.driver.getCurrentUrl();
        costomerLogin.click();
        String customersSelect = this.driver.getCurrentUrl();
        WebElement customerSelect = this.driver.findElement(By.id("userSelect"));
        customerSelect.click();
        WebElement selectHermoine = this.driver.findElement(By.cssSelector("#userSelect > option:nth-child(2)"));
        selectHermoine.click();
        WebElement loginBT = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > form > button"));
        loginBT.click();
        WebElement hermoinetxt = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div:nth-child(1) > strong > span"));
        return hermoinetxt.getText();
    }
    public String TransactionHermoine() {
        WebElement transaction = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div:nth-child(5) > button:nth-child(1)"));
        transaction.click();
        WebElement transactionTxt = this.driver.findElement(By.cssSelector("#anchor0 > td:nth-child(2)"));
        return transactionTxt.getText();

    }



//3
   public String managerEnter(String expectName) throws InterruptedException {
        WebElement managerBtn= this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.borderM.box.padT20 > div:nth-child(3) > button"));
        managerBtn.click();
        WebElement addCustomerBtn= this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.center > button:nth-child(1)"));
        addCustomerBtn.click();
        WebElement firstNameTxtBox=this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.ng-scope > div > div > form > div:nth-child(1) > input"));
        firstNameTxtBox.click();
        Thread.sleep(3000);
        firstNameTxtBox.sendKeys("Severus");
        WebElement lastNameTxtBox=this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.ng-scope > div > div > form > div:nth-child(2) > input"));
        lastNameTxtBox.click();
        lastNameTxtBox.sendKeys("Snape");
        WebElement postCodeTxtBox = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.ng-scope > div > div > form > div:nth-child(3) > input"));
        postCodeTxtBox.click();
        postCodeTxtBox.sendKeys("123123");
        WebElement addCustomerAgree= this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.ng-scope > div > div > form > button"));
        addCustomerAgree.click();
       this.driver.switchTo().alert().accept();
       Thread.sleep(3000);
WebElement customerBtn = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.center > button:nth-child(3)"));
customerBtn.click();
Thread.sleep(2000);
WebElement customersName = this.driver.findElement(By.cssSelector("body > div > div > div.ng-scope > div > div.ng-scope > div > div > table > tbody > tr:nth-child(6) > td:nth-child(1)"));
customersName.getText();
return customersName.getText();
   }



    }

