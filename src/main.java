import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BookList list = new BookList();
        do {
            System.out.println("----- EBOOK MANAGEMENT -----");
            System.out.println("1. Adds new ebook.");
            System.out.println("2. Shows all ebooks.");
            System.out.println("3. The biggest size ebook.");
            System.out.println("4. Quit.");
            System.out.print("Please select a function: ");
            int select = Integer.parseInt(sc.nextLine());
            switch (select) {
                case 1:
                    list.addBook();
                    break;
                case 2:
                    list.printListBook();
                    break;
                case 3:
                    list.biggestSizeBook();
                    break;
                case 4:
                    System.out.println("THANK FOR USING MY APPLICATION!\n" +
                            "SEE YOU AGAIN!");
                    return;
                default:
                    System.out.println("The function of application must be from 1 to 3!");
            }
        } while (true);
    }
}
