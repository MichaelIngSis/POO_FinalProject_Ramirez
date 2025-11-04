import java.io.Console;
public class pruebas {
    static Console console = System.console();
    public static void main(String[] args) {
        Customer customer = new Customer(101, "Michael", "Ramírez", "Calle 65", "michael@prueba.com", "3033043938");
        console.printf(""+customer.getCustomerId()+"\n");
        console.printf(""+customer.getCustomerAddress()+"\n");
        console.printf(""+customer.getCustomerEmail()+"\n");
        console.printf(""+customer.getCustomerPhoneNumber()+"\n");
        customer.setCustomerAddress("");
        customer.setCustomerEmail("michael.ramirez@outlook.es");
        customer.setCustomerPhoneNumber("3033023029");
        console.printf("Datos despues de la modificación:");
        console.printf(""+customer.getCustomerAddress()+"\n");
        console.printf(""+customer.getCustomerEmail()+"\n");
        console.printf(""+customer.getCustomerPhoneNumber()+"\n");
    }
}
