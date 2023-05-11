import java.util.Scanner;

public class Read {
    static Scanner sc = new Scanner(System.in);
    public static void readByAuthor() {
        boolean found=false;
        System.out.print("Kitabın yazarının adını daxil edin: ");
        String serach = sc.nextLine();
        for (Book b : DataBase.books) {
            if (b.getAuthor().equals(serach)){System.out.println(b);found=true;}
        }BookNotFound.BookNotFound(found);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
    public static void readByTitle() {
        boolean found=false;
        System.out.print("Kitabın adını daxil edin: ");
        String serach = sc.nextLine();
        for (Book b : DataBase.books) {
            if (b.getTitle().equals(serach)){System.out.println(b);found=true;}
        }BookNotFound.BookNotFound(found);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
    public static void readAll(){
        for (Book b : DataBase.books){System.out.println(b);}
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}

