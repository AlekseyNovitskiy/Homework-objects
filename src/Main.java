public class Main {
    public static void main(String[] args) {
        Author author1 = new Author("Виктор","Гюго");
        Author author2 = new Author("Николай","Гоголь");
        Author author3 = new Author("Николай","Гоголь");
        Book book1 = new Book("Отверженные",1862, author1);
        Book book2 = new Book("Ревизор", 1836, author2);
        Book book3 = new Book("Ревизор", 1836, author3);


        System.out.println("Название книги: "+ book1.getName()+ " год выхода: "+ book1.getYear()+ " Автор: " + book1.getAuthor());
        System.out.println("Название книги: "+ book2.getName()+ " год выхода: "+ book2.getYear()+ " Автор: " + book2.getAuthor());
        book1.setYear(1865);
        System.out.println("Название книги: "+ book1.getName()+ " год выхода: "+ book1.getYear()+ " Автор: " + book1.getAuthor());
        System.out.println(book1);
        System.out.println(book1.equals(book2));
        System.out.println(book2.equals(book3));
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());
        System.out.println(book3.hashCode());


    }
}