public class Book {
    protected String ID;
    protected String Name;
    protected int year;
    protected String author;
    public Book (String ID, String name, int year, String author){
        this.ID=ID;
        this.Name=name;
        this.year=year;
        this.author=author;
    }
    public void setID(String ID){
        this.ID=ID;
    }
    public void setName(String name){
        this.Name=name;
    }
    public void setYear(int year){
        this.year=year;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public String getID(){
        return ID;
    }
    public String getName(){
        return Name;
    }
    public int getYear(){
        return year;
    }
    public String getAuthor(){
        return author;
    }
}
