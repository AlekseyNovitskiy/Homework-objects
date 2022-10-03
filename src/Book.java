public class Book {

    private String name;
    private Author author;
    private int year;


    public Book(String name, int year, String nameAuthor) {
        this.name=name;
        this.year=year;
        this.author=new Author(nameAuthor);
    }
    public String getName() {
        return this.name;
    }
    public int getYear() {
        return this.year;
    }

    public Author getAuthor() {
        return (this.author);
    }

    public String getAuthorName() {
        return (this.author.getFirstName() + " " + this.author.getSecondName());
    }
    public void setYear (int year){
        this.year = year;
    }
}
