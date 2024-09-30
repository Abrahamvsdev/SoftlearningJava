package Model.Stakeholders;

public class PersonTest {
    public static void main(String[] args) {
        Client client1;
        try {
            
            client1 = Client.getInstance(name, surname, email, address, dni, number, antiquity, paymentMode, membershipLevel, registrationDate);
            
            System.out.println(client1.getDetails());
        } catch (Exception e) {
            
            System.out.println("Error al crear la persona: " + e.toString());
        }
    }
}





