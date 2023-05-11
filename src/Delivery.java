import java.util.Scanner;

public class Delivery {
    static Scanner sc = new Scanner(System.in);

    public static void takeEBook() {
        boolean found = false;
        System.out.println("Kitabın seriyasını daxil edin: ");
        String search = sc.nextLine();
        for (Book b : DataBase.books) {
            if (b.getSeries().equals(search) && b.getQuantity() > 0) {
                b.setQuantity(b.getQuantity() - 1);
                System.out.println("Kitabdan " + b.getQuantity() + " ədəd qaldı");
                found = true;
            } else if (b.getSeries().equals(search) && b.getQuantity() < 1) {
                System.out.println(search + " seriyalı kitabdan qalmayıb");
                found = true;
            }
        }BookNotFound.BookNotFound(found);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }

    public static void returnBook() {
        boolean found = false;
        System.out.println("Kitabın seriyasını daxil edin: ");
        String search = sc.nextLine();
        for (Book b : DataBase.books) {
            if (b.getSeries().equals(search)) {
                b.setQuantity(b.getQuantity() + 1);
                System.out.println("Kitabdan " + b.getQuantity() + " ədəd oldu");
                found = true;
            }
        }BookNotFound.BookNotFound(found);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}

