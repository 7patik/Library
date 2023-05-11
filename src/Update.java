import java.util.Scanner;

public class Update {
    static Scanner sc=new Scanner(System.in);
    public static void update(){
        System.out.print("Kitabın seriyasını daxil edin: ");
        String serach=sc.nextLine();
        boolean found=false;
        for (Book b : DataBase.books){
            if (b.getSeries().equals(serach)){
                System.out.print("Kitabın yazarının adını daxil edin: ");
                b.setAuthor(sc.nextLine());
                System.out.print("Kitabın adını daxil edin: ");
                b.setTitle(sc.nextLine());
                System.out.print("Kitabın sayını daxil edin: ");
                b.setQuantity(sc.nextInt());
                System.out.print("Kitabın qiymətini daxil edin: ");
                b.setPiece(sc.nextInt());
                found=true;
            }

        }BookNotFound.BookNotFound(found);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
