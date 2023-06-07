public class Ebook extends Book {
    private String URL;
    private int Size;
    public Ebook(String ID, String Name, int year, String author, String url, int size ){
        super(ID, Name, year, author);
        this.URL=url;
        this.Size=size;
    }
    public void setURL(String url){
        this.URL=url;
    }
    public void setSize(int size){
        this.Size=size;
    }
    public String getURL(){
        return URL;
    }
    public int getSize(){
        return Size;
    }
}
