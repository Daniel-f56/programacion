package bookstores;
import books.Book;
public class BooksStore {
        
    public static void main(String[] args) {
        Book book1 = new Book("El imperio final", 5, 25, "Fantasia");
        Book book2 = new Book("El nombre del viento",10,28,"Fantasia");
        
        //Presto el libro
        book1.lendBook();
        
        System.out.println(book1.isAvailable());
        System.out.println(book2.isAvailable());

        
    }
}
