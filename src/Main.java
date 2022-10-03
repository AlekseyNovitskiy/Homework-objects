public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Отверженные",1862, "Виктор Гюго");
        Book book2 = new Book("Ревизор", 1836, "Николай Гоголь");


        System.out.println("Название книги: "+ book1.getName()+ " год выхода: "+ book1.getYear()+ " Автор: " + book1.getAuthorName());
        System.out.println("Название книги: "+ book2.getName()+ " год выхода: "+ book2.getYear()+ " Автор: " + book2.getAuthorName());
        book1.setYear(1865);
        System.out.println("Название книги: "+ book1.getName()+ " год выхода: "+ book1.getYear()+ " Автор: " + book1.getAuthorName());

    }
}