import notificadores.Whatsapp;
import org.junit.Assert;
import org.junit.Test;
public class TestUI {

    @Test
    public void test(){
        Whatsapp wts = new Whatsapp();
        wts.update("Test");
    }

}
