package userinterface;

import net.serenitybdd.core.annotations.findby.By;
import net.serenitybdd.screenplay.targets.Target;

public class OpenCartCatalog {

    public static final Target Buton_catalog = Target.the("Click en catalog")
            .located(By.cssSelector("#menu-catalog > a"));

    public static final Target Buton_categories = Target.the("Click en categories")
            .located(By.xpath("/html/body/div[1]/nav/ul/li[2]/ul/li[1]/a"));

}
