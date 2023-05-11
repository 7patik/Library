import java.util.Scanner;

public class AddBook {
    static Scanner sc = new Scanner(System.in);
    public static void varolanlar(){
        Book b1=new Book("Wulf Dorn","21","987654321",5,10);
        Book b2=new Book("Elxan Elatli","14-cu adam","98765432",1,10);
        Book b3=new Book("Orhan Pamuk","Cevdet bey ve ogullari","9876543",2,20);
        DataBase.books.add(b1);
        DataBase.books.add(b2);
        DataBase.books.add(b3);
    }

    public static void add() {
        System.out.print("Kitabın yazarının adını daxil edin: ");
        String auther=sc.nextLine();
        System.out.print("Kitabın adını daxil edin: ");
        String title=sc.nextLine();
        System.out.print("Kitabın seriyasını daxil edin: ");
        String series=sc.nextLine();
        System.out.print("Kitabın sayını daxil edin: ");
        int quantity=sc.nextInt();
        System.out.print("Kitabın qiymətini daxil edin: ");
        double piece=sc.nextDouble();
        Book b=new Book(auther,title,series,quantity,piece);
        DataBase.books.add(b);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
