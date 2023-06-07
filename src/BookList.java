import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class BookList {
    HashMap<Integer, Ebook> Ebook;

    public BookList() {
        Ebook = new HashMap<>();
    }

    public void addBook() {
        Scanner sc = new Scanner(System.in);
        Iterator iter = Ebook.keySet().iterator();
        int i = Ebook.size() + 1;
        System.out.println("----- Add new ebook -----");
        System.out.print("Input ID: ");
        String ID = sc.nextLine();
        System.out.print("Input Name: ");
        String name = sc.nextLine();
        System.out.print("Input Year: ");
        int year = sc.nextInt();
        System.out.print("Input authors: ");
        sc.nextLine();
        String authors = sc.nextLine();
        System.out.print("Input URL: ");
        String url = sc.nextLine();
        System.out.print("Input size (kilobyte): ");
        int size = sc.nextInt();
        Ebook.put(i, new Ebook(ID, name, year, authors, url, size));
        System.out.println("Ebook created and added to list of ebooks successful!");
    }

    /*
     * public int SearchBook(String code){
     * Iterator iter = Ebook.keySet().iterator();
     * Object key =null;
     * while (iter.hasNext()){
     * if (Ebook.get(key).getID().toLowerCase().equals(code)){
     * return (int) key;
     * }
     * }
     * return -1;
     * }
     */
    public void biggestSizeBook() {
        Iterator iter = Ebook.keySet().iterator();
        Object keyb=null;
        System.out.println("----- List of ebooks -----");
        System.out.println("--   ID   --    Ebook name    --  Year  --      Authors     --      URL     --  Size  --");
        while (iter.hasNext()) {
            Object key = iter.next();
            int biggestbook=0;
            if (Ebook.get(key).getSize()>biggestbook) {
                keyb=key;
                biggestbook=Ebook.get(key).getSize();
            }
        }
        System.out.printf("--  %-5s --     %-5s        --  %-6d--      %-10s --  %-10s   --  %-3d --\n ",
                        Ebook.get(keyb).getID(), Ebook.get(keyb).getName(), Ebook.get(keyb).getYear(),
                        Ebook.get(keyb).getAuthor(), Ebook.get(keyb).getURL(), Ebook.get(keyb).getSize());

    }

    public void printListBook() {
        Iterator iter = Ebook.keySet().iterator();
        System.out.println("----- List of ebooks -----");
        System.out.println("--   ID   --    Ebook name    --  Year  --      Authors     --      URL     --  Size  --");
        while (iter.hasNext()) {
            Object key = iter.next();
            System.out.printf("--  %-5s --     %-5s        --  %-6d--      %-10s --  %-10s   --  %-3d --\n",
                    Ebook.get(key).getID(), Ebook.get(key).getName(), Ebook.get(key).getYear(),
                    Ebook.get(key).getAuthor(), Ebook.get(key).getURL(), Ebook.get(key).getSize());
        }

    }

}
