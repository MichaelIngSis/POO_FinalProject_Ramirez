package ui;
import domain.TicketOffice;
import javax.swing.*;
import java.awt.*;
import java.io.File;

public class MainMenu extends JFrame {

    private TicketOffice office;

    public MainMenu(TicketOffice office) {
        
        this.office = office;

        setTitle("Ticket Office");
        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // Centrar ventana

        // Panel vertical para botones
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 1, 10, 10));
        panel.setBorder(BorderFactory.createEmptyBorder(20, 20, 20, 20));

        // 1. Comprar ticket
        JButton buyTicketBtn = new JButton("Comprar Ticket");
        buyTicketBtn.addActionListener(e -> {
        new EventSelectionUI(office).setVisible(true);
        dispose();
        });

        // 4. Agregar eventos
        JButton addEventBtn = new JButton("Agregar Eventos");
        addEventBtn.addActionListener(e -> {
                new AddEventUI(office).setVisible(true);
                dispose();
        });

        // 5. Agregar clientes
        JButton addCustomerBtn = new JButton("Agregar Clientes");
        addCustomerBtn.addActionListener(e -> {
            new AddCustomerUI(office).setVisible(true);
            dispose();
        });

        // 6. Consultar tickets de clientes
        JButton checkTicketsBtn = new JButton("Consultar Tickets de Clientes");
        checkTicketsBtn.addActionListener(e -> {
            new CheckCustomerTicketsUI(office).setVisible(true);
            dispose();
        });


        JButton venueBtn = new JButton("Agregar Venue");
        venueBtn.addActionListener(e -> {
            dispose();
            new AddVenueUI(office).setVisible(true);
        });

        JButton locBtn = new JButton("Agregar Localidad");
        locBtn.addActionListener(e ->{
            dispose();
            new AddLocationUI(office).setVisible(true);
        });

        // Agregar botones al panel
        panel.add(buyTicketBtn);
        panel.add(addEventBtn);
        panel.add(addCustomerBtn);
        panel.add(checkTicketsBtn);
        panel.add(venueBtn);
        panel.add(locBtn);

        add(panel);
    }
}
