import java.util.Objects;

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
    public String toString() {
        return "Название книги: " + this.name +" год выхода: "+ this.year + " Автор: "+this.author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return year == book.year && name.equals(book.name) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, year);
    }
}
