package questions;

import model.openCart;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.questions.Value;
import userinterface.OpenCarLogin;

import java.util.List;

public class AnswerOne implements Question<Boolean>{

    private List<openCart> openCart;

    public AnswerOne(List<openCart> openCart) {
        this.openCart = openCart;
    }

    public static AnswerOne toThe(List<openCart> openCart) {
        return new AnswerOne(openCart);
    }

    @Override
    public Boolean answeredBy(Actor actor) {
        boolean result;
        String text=  Text.of(OpenCarLogin.Text).viewedBy(actor).asString();
        if(openCart.get(0).getSrtQuestion().equals(text)){
            result = true;
        }else {
            result = false;
        }
        return result;
    }
}
