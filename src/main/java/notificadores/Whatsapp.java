package notificadores;

import classroom.notifier.interfaces.Observer;

public class Whatsapp implements Observer {
    @Override
    public void update(Object data) {
        System.out.println("Mensaje enviado por Whatsapp");
        System.out.println(data);
    }
}
