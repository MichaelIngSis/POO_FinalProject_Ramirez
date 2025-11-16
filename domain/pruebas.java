import java.io.Console;
import java.util.List;
public class pruebas {
    static Console console = System.console();
    public static void main(String[] args) {
        Event event = new Event("Perros Criollos", "26/10/2026", 1900, "Música");

        Event event1 = new Event("Perras Criollas", "27/10/2028", 1900, "Música");

        TicketOffice oficina = new TicketOffice(1001, "calle 89", "oficina@example.com", "+57 320302", "Manizales");

        oficina.addEvents(event);
        oficina.addEvents(event1);

        List<Event> eventos = oficina.getEvents();

        for(Event evento : eventos){
            console.printf(""+evento.getEventId()+"\n");
        }
    }
}
