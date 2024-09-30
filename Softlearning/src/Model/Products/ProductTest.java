package Model.Products;

public class ProductTest {
    public static void main(String[] args) throws Exception {
    Books libro1;
    try {
        libro1 = Books.getInstance("asdasd", 17.90, false, 0, "libro", "cash", "10-10-2000", "yasdhk", "1231231231231", "tapadura", 100, "genero", "editorial", 10.00, 10.10, 10.00, 10.00);
        System.out.println(libro1.getDetails());
        
    } catch (Exception e) {
        System.out.println(e.toString());
        
    }    

    }




}





