package tests;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import tests.BaseTest;
import utils.BasePage;

import static tests.PageOjectManager.*;

import utils.CustomSoftAssert;

import java.util.List;
import java.util.Map;
import java.util.Arrays;

public class CreateAlertsForMigration extends BaseTest {
    SoftAssert softAssert = new SoftAssert();

    // Sample input list for dscrCD1
    private final List<String> dscrCD = Arrays.asList("5423");//, "2760", "4635", "5423","5445");
    private final List<String> tickerCD = Arrays.asList("USAU", "USFD", "USB");
    private final List<String> indexAlertNippon = Arrays.asList("JPX日経400", "日経225", "TOPIX", "東証プライム市場指数", "東証スタンダード市場指数");
    private final List<String> indexAlertSakimono = Arrays.asList("TOPIX先物(期近)", "JPX日経400先物(期近)");
    private final List<String> indexAlertUS = Arrays.asList("NQ米国大型株", "NQ米国中型株");// "NQ米国小型株", "NQ工業株", "NQ銀行株", "NQ保険株");

   // @Test(priority = 1)
    public void createJPStockAlert() {

        createAlertUtil.prerequisiteForAlertSettingScreen();
        // Iterate through the dscrCD1 list for jp STOCKS
        for (int i = 0; i < dscrCD.size(); i++) {
            String code = dscrCD.get(i); // Get value at index i
            System.out.println("Processing Code JP: " + code); // Example action with the code

            // You can call any method that requires this code here
            createAlertUtil.createAllAlert(softAssert, code, "JP", "set", "preiceAlert", "preiceAlert1", false, false);
            // Example of using the code in another method, if applicable
            // editAlertSettingPage.setPriceAlert(region, "up", testData.getIncrementAmount(), softAssert, alertType, code);
        }
    }

  //  @Test(priority = 2)
    public void createUSStockAlert() {
        // driver.navigate().back();
        //menuPage.clickOnClose();
        menuPage.clickOnMenu();
        createAlertUtil.prerequisiteForAlertSettingScreen();

        // Iterate through the dscrCD1 list for jp STOCKS
        for (int i = 0; i < tickerCD.size(); i++) {
            String code = tickerCD.get(i); // Get value at index i
            System.out.println("Processing Code US: " + code); // Example action with the code

            // You can call any method that requires this code here
            createAlertUtil.createAllAlert(softAssert, code, "US", "set", "preiceAlert", "preiceAlert1", false, false);
            // Example of using the code in another method, if applicable
            // editAlertSettingPage.setPriceAlert(region, "up", testData.getIncrementAmount(), softAssert, alertType, code);
        }
    }

    @Test(priority = 3)
    public void createIndexAlertNippon() {
//        driver.navigate().back();
//        menuPage.clickOnClose();
        menuPage.clickOnMenu();
        createAlertUtil.prerequisiteForAlertSettingScreen();

        // Iterate through the dscrCD1 list for jp STOCKS
        for (int i = 0; i < indexAlertNippon.size(); i++) {
            String code = indexAlertNippon.get(i); // Get value at index i
            System.out.println("Processing Code JPIndex: " + code); // Example action with the code

            // You can call any method that requires this code here
            createAlertUtil.createAllAlert(softAssert, code, "Index", "set", "preiceAlert", "preiceAlert1", true, false);
            // Example of using the code in another method, if applicable
            // editAlertSettingPage.setPriceAlert(region, "up", testData.getIncrementAmount(), softAssert, alertType, code);
        }
    }

    @Test(priority = 4)
    public void createIndexAlertSakimono() {
        driver.navigate().back();
        menuPage.clickOnClose();
        menuPage.clickOnMenu();
        createAlertUtil.prerequisiteForAlertSettingScreen();

        // Iterate through the dscrCD1 list for jp STOCKS
        for (int i = 0; i < indexAlertSakimono.size(); i++) {
            String code = indexAlertSakimono.get(i); // Get value at index i
            System.out.println("Processing Code JPIndexSakimono: " + code); // Example action with the code

            // You can call any method that requires this code here
            createAlertUtil.createAllAlert(softAssert, code, "Index", "set", "preiceAlert", "preiceAlert1", true, false);
            // Example of using the code in another method, if applicable
            // editAlertSettingPage.setPriceAlert(region, "up", testData.getIncrementAmount(), softAssert, alertType, code);
        }
    }

    @Test(priority = 5)
    public void createIndexAlertUS() {
        driver.navigate().back();
        menuPage.clickOnClose();
        menuPage.clickOnMenu();
        createAlertUtil.prerequisiteForAlertSettingScreen();

        // Iterate through the dscrCD1 list for jp STOCKS
        for (int i = 0; i < indexAlertUS.size(); i++) {
            String code = indexAlertUS.get(i); // Get value at index i
            System.out.println("Processing Code IndexUS: " + code); // Example action with the code

            // You can call any method that requires this code here
            createAlertUtil.createAllAlert(softAssert, code, "Index", "set", "preiceAlert", "preiceAlert1", true, false);
            // Example of using the code in another method, if applicable
            // editAlertSettingPage.setPriceAlert(region, "up", testData.getIncrementAmount(), softAssert, alertType, code);
        }
    }
}
