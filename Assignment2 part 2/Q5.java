import java.util.HashMap;

class Book {
    private int id;
    private String name;
    private String author;
    private int quantity;

    public Book(int id, String name, String author, int quantity) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public int getQuantity() {
        return quantity;
    }

    @Override
    public String toString() {
        return "Book[" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", quantity=" + quantity +
                ']';
    }
}

public class _2241019447_Ass4_Q5_Library {
    public static void main(String[] args) {
        HashMap<Integer, Book> books = new HashMap<>();

        Book book1 = new Book(1, "Java Programming", "Aditya", 10);
        Book book2 = new Book(2, "Python Programming", "Raj", 15);

        books.put(book1.getId(), book1);
        books.put(book2.getId(), book2);

        for (Book book : books.values()) System.out.println(book);

        String searchBookName = "Java Programming";
        System.out.println("Is \"" + searchBookName + "\" present in the library? " + isBookPresent(books, searchBookName));

        int removeBookId = 2;
        System.out.println("Removing book with id " + removeBookId);
        removeBook(books, removeBookId);

        System.out.println("Books in the library after removal:");
        
        for (Book book : books.values()) System.out.println(book);
    }

    public static boolean isBookPresent(HashMap<Integer, Book> books, String bookName) {
        for (Book book : books.values()) 
        	if (book.getName().equals(bookName)) return true;
        return false;
    }

    public static void removeBook(HashMap<Integer, Book> books, int bookId) {
        books.remove(bookId);
    }
}
