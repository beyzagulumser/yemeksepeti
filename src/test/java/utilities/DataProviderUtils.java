package utilities;

import org.testng.annotations.DataProvider;

public class DataProviderUtils {

    @DataProvider
    public Object[][] loginData() {
        return new Object[][]{{ConfigReader.getProperty("InValid_Email"),
                ConfigReader.getProperty("InValid_Password")},
                {ConfigReader.getProperty("Vendor_Username"),
                ConfigReader.getProperty("InValid_Password")},
                {ConfigReader.getProperty("InValid_Email"),
                ConfigReader.getProperty("Vendor_Password")}};
    }

}
