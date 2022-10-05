public class Book {

    private String name;
    private Author author;
    private int year;


    public Book(String name, int year, Author nameAuthor) {
        this.name=name;
        this.year=year;
        this.author = nameAuthor;
    }
    public String getName() {
        return this.name;
    }
    public int getYear() {
        return this.year;
    }

    public String getAuthor() {
        return (this.author.getFirstName() + " " + this.author.getSecondName());

    }
    public void setYear (int year){
        this.year = year;
    }
}
