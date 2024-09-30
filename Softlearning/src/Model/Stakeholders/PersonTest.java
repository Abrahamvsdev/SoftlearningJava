package Model.Stakeholders;

public class PersonTest {
    public static void main(String[] args) {
        Client client1;
        try {
            
            client1 = Client.getInstance("name", "surname", "email@gmail.com", "address", "35016718G", "655555555", 1, "paymentMode", "membershipLevel", "10-10-1990");
            
            System.out.println(client1.getDetails());
        } catch (Exception e) {
            
            System.out.println("Error al crear la persona: " + e.toString());
        }
    }
}





