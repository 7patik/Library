import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean run=true;
        AddBook.varolanlar();
        while (run) {
            System.out.println("""
                    =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                    Kitab əlavə etmək-->1
                    Kitabı yeniləmək-->2
                    Kitabın adı ilə axtarış-->3
                    Kitabın yazarı ilə axtarış-->4
                    Kitabı silməl-->5
                    Kitab təhvil vermək-->6
                    Kitabı təhvil almaq-->7
                    Kitabların siyahısını görmək-->8
                    Sistemdən çıxmaq-->0
                    =-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=
                    """);
            System.out.print("Secimi daxil edin: ");
            int choose=sc.nextInt();
            switch (choose) {
                case 1 -> AddBook.add();
                case 2 -> {try{Update.update();}catch (Exception e){System.out.println("Belə bir kitab yoxdur");}}
                case 3 -> {try{Read.readByTitle();}catch (Exception e){System.out.println("Belə bir kitab yoxdur");}}
                case 4 -> {try{Read.readByAuthor();}catch (Exception e){System.out.println("Belə bir kitab yoxdur");}}
                case 5 -> {try{Delete.remove();}catch (Exception e){System.out.println("Belə bir kitab yoxdur");}}
                case 6 -> {try{Delivery.takeEBook();}catch (Exception e){System.out.println("Belə bir kitab yoxdur");}}
                case 7 -> {try{Delivery.returnBook();}catch (Exception e){System.out.println("Belə bir kitab yoxdur");}}
                case 8 -> Read.readAll();
                case 0 -> run = false;
                default -> {
                }
            }

        }
    }
}