package domain;

public class DemoData {

    public static TicketOffice getTicketOfficeWithSampleData() {

        TicketOffice office = new TicketOffice(
                1001,
                "Calle 89",
                "oficina@example.com",
                "+57 320302",
                "Manizales"
        );

        

        
        office.addVenue("Aula Máxima", "Carrera 20", 3000, "Eventos de Música");
        office.addVenue("Estadio Palogrande", "La Estrella", 30000, "Eventos Deportivos");


        // Registrar eventos en la oficina
        office.addEvent("Perros Criollos", "26/10/2026", 1900, "Concierto",office.getVenues().get(0));
        office.addEvent("Perras Criollas", "27/10/2028", 1900, "Concierto",office.getVenues().get(0));

        office.getEvents().get(0).createLocations("Palcos", 1000);
        office.getEvents().get(0).createLocations("General", 2000);
        
        office.getEvents().get(1).createLocations("Palcos", 1000);
        office.getEvents().get(1).createLocations("General", 2000);

        // Cliente ficticio
        Customer customer = new Customer(
                1001,
                "Michael",
                "Ramirez",
                "Calle 76",
                "michael@example.com",
                "+57 91921"
        );

        office.addCustomer(customer);

        return office;
    }
}