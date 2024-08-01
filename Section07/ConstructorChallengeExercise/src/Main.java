public class Main {
    public static void main(String[] args) {
        Customer cus1 = new Customer();
        Customer cus2 = new Customer("Second", "second@email.com");
        Customer cus3 = new Customer("Third", 5000.0, "third@email.com");

        System.out.println(cus1.getCreditLimit());
        System.out.println(cus2.getName());
        System.out.println(cus3.getEmailAddress());
    }
}
