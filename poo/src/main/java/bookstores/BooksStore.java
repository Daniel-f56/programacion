package bookstores;
import books.Book;
import java.util.Scanner;
public class BooksStore {
static Scanner sc = new Scanner(System.in);
        
    public static void main(String[] args) {
        Book[] booksArrays = new Book[5];
        booksArrays[0] = new Book("El imperio final", 1, 11, "Fantasia");
        booksArrays[1] = new Book("El nombre del viento",1,12,"Fantasia");
        booksArrays[2] = new Book("El codigo da vinci",1,13,"Misterio");
        booksArrays[3] = new Book("Orgullo y prejuicio",1,14,"Romance");
        booksArrays[4] = new Book("Elantris",1,15,"Fantasia");

        
        //Ejemplo de como prestar un libro
        //booksArrays[0].lendBook();
        //System.out.println(booksArrays[0].isAvailable());
        //System.out.println(booksArrays[1].isAvailable());
        
        
        System.out.println("Bienvenido a la biblioteca");
        System.out.println("Libros disponibles e info: ");
        for (int i = 0; i<booksArrays.length; i++){
            System.out.println("Titulo: "+booksArrays[i].titleBook());
            System.out.println("Codigo: "+booksArrays[i].idBook());
            

        }
        System.out.println("Ingrese codigo de libro para ver si esta disponible: ");
        int n = sc.nextInt();
        int aa = 0;
        for(int i = 0; i<booksArrays.length; i++){
            if(n == booksArrays[i].idBook()){
                System.out.println("El libro que elegiste es: ");
                System.out.println(booksArrays[i].titleBook());
                aa = booksArrays[i].idBook();
                if(booksArrays[i].isAvailable()==true){
                System.out.println("El libro si esta disponible, quedan: "+booksArrays[i].quantityBook()+" Libros disponibles");
                
                } else if (booksArrays[i].isAvailable()==false){
                System.out.println("El libro no esta disponible");
                }
            }
            
        }
        
        System.out.println("Quieres tomar prestado el libro?  1)Si  2)No ");
        int p = sc.nextInt();
        
        switch (p) {
            case 1:
                booksArrays[aa].lendBook();
                break;
            case 2:
                System.out.println("Gracias por asistir a la biblioteca");
                break;
        }
        System.out.println(booksArrays[aa].isAvailable());
        System.out.println("Gracias por asistir a la biblioteca");
    }
}
