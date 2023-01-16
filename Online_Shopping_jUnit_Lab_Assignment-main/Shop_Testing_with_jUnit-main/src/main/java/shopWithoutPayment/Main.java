package shopWithoutPayment;

public class Main {
    public static void main(String[] args) {


        Products product1 = new Products("Apachee", "Bike", 1000000);
        Products product2 = new Products("Duronto", "Cycle", 15000);


        Admin admin1 = new Admin("Emon");

        admin1.AddProducts(product1.Name, product1.Group, product1.Price);
        admin1.AddProducts(product2.Name, product2.Group, product2.Price);



        System.out.println("Admin1 Products");
        admin1.ViewProducts();
        Customer customer1 = new Customer("Arif");



        customer1.AddToCart(product1);
        customer1.AddToCart(product2);

        System.out.println("Cart Products");
        customer1.ViewCartProducts();

        System.out.println();
        System.out.println("Total Price of  these items : " + customer1.cart.SumTotalPrice());


        System.out.println("Guest Product");

        Guest guest1 = new Guest();
        guest1.ViewProducts(admin1);
        guest1.GetRegistered("RAFI");

    }
}