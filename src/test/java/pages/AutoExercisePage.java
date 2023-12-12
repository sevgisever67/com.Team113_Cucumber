package pages;

import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class AutoExercisePage {



    AutoExercisePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

}
