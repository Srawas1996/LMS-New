package Steps;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.example.com.LMS.base.Base;

public class Hocks extends Base {
    @Before
    public void runBeforeAnyScenario(){

    }


    @After
    public void runAfterAnyScenario(){
        driver.quit();
    }



}
