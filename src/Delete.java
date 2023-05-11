import java.util.Scanner;

public class Delete {
    public static void remove(){
        boolean found=false;
        Scanner sc=new Scanner(System.in);
        System.out.print("Kitabın seriyasını daxil edin: ");
        String search=sc.nextLine();
        for (Book b : DataBase.books){
            if (b.getSeries().equals(search)){DataBase.books.remove(b);found=true;}
            System.out.println(search+" seriyalı kitab silindi");
        }BookNotFound.BookNotFound(found);
        System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
    }
}
