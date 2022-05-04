package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class OpenCarProfile {
    public static final Target Buton_username = Target.the("Click en username")
            .located(By.cssSelector("#header > div > ul > li.dropdown > a"));
    public static final Target Buton_yourprofile = Target.the("Click en yourprofile")
            .located(By.cssSelector("#header > div > ul > li.dropdown.open > ul > li:nth-child(1) > a"));

}
