package domain;
import data.TicketOfficeStorage;
import java.io.Console;
public class Prueba {
    static Console console = System.console();
    private static TicketOffice office = DemoData.getTicketOfficeWithSampleData();
    private static final String FILE_NAME = "ticketOffice.dat";
    public static void main(String[] args) {
        int decision = 0;
        while(true){
            console.printf("Ingrese un valor entre los siguientes: "+"\n");
            console.printf("1. Si desea guardar un documento que contenga una TicketOffice"+"\n");
            console.printf("2. Si desea cargar un documento que contiene una TicketOffice"+"\n");
            decision = Integer.parseInt(console.readLine());
            if(decision == 1){
                saveTicketOffice();
            }else if(decision == 2){
                loadTicketOffice();
            }else{
                break;
            }
        }
        

    }

    private static void saveTicketOffice(){
        TicketOfficeStorage.save(office, FILE_NAME);
    }

    private static void loadTicketOffice(){
        var loaded = TicketOfficeStorage.load(FILE_NAME);
        if(loaded != null){
            office = loaded;
            System.out.println("TicketOffice loaded Succesfully!");
        }
    }
}

