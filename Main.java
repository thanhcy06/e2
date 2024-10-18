
public class Main {
    public static void main(String[] args) {
        Author ahTeck = new Author("Tan Ah Teck", "ahteck@nowhere.com", 'm'); // Test the constructor
        System.out.println(ahTeck);  // Test toString()
        ahTeck.setEmail("paulTan@nowhere.com");  // Test setter
        System.out.println("name is: " + ahTeck.getName());     // Test getter
        System.out.println("email is: " + ahTeck.getEmail());   // Test getter
        System.out.println("gender is: " + ahTeck.getGender());
        Book dummyBook = new Book("Java for dummy", ahTeck, 19.95, 99);
        System.out.println(dummyBook);
        dummyBook.setPrice(29.95);
        dummyBook.setQty(28);
        System.out.println("name is:" +dummyBook.getName());
        System.out.println("price is: " +dummyBook.getPrice());
        System.out.println("qty is: " +dummyBook.getQty());
        System.out.println("Author is: " +dummyBook.getAuthor());
        System.out.println("Author's name is:" +dummyBook.getAuthor().getName());
        System.out.println("Author's email is: " + dummyBook.getAuthor().getEmail());


        Book anotherBook = new Book("more Java",
                new Author("Paul Tan", "paul@somewhere.com", 'm'),29.95,30);
        System.out.println(anotherBook);
    }
}