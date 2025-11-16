import java.io.Console;
import java.util.List;
public class pruebas {
    static Console console = System.console();
    public static void main(String[] args) {
        Event event = new Event("Perros Criollos", "26/10/2026", 1900, "Música");
        Event event1 = new Event("Perras Criollas", "27/10/2028", 1900, "Música");
        Venue venue = new Venue("Aula Maxima", "Carrera 20", 3000, "Eventos de Música");
        Customer customer = new Customer(1001, "Michael", "Ramirez", "Calle 76", "michael@example.com", "+57 91921");
        TicketOffice oficina = new TicketOffice(1001, "calle 89", "oficina@example.com", "+57 320302", "Manizales");
        event.setVenue(venue);
        event1.setVenue(venue);
        event.createLocations("Palcos", 1000);
        event.createLocations("General", 2000);
        event1.createLocations("Palcos", 1000);
        event1.createLocations("General", 2000);
        oficina.addEvents(event);
        oficina.addEvents(event1);
        oficina.addCustomer(customer);

        oficina.sellTicket(event1, customer, event1.getLocations().get(1));
        List<Event> eventos = oficina.getEvents();

        /*for(Event evento : eventos){
            console.printf(""+evento.getEventId()+"\n");
        }*/

        System.out.println(customer.getTickets().get(0).getTicketSeat());
        System.out.println(event1.getTickets().get(0).getTicketSeat());
        System.out.println(oficina.getTickets().get(0).getTicketSeat());
    }
}
