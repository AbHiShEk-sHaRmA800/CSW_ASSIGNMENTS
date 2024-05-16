class Book {
    private int bookId;
    private String bookName;
    private double price;
    public Book(int bookId, String bookName, double price) {
    this.bookId = bookId;
    this.bookName = bookName;
    this.price = price;
    }
    public int getBookId() {
    return bookId;
    }
    public void setBookId(int bookId) {
        this.bookId = bookId;
}
public String getBookName() {
return bookName;
}
public void setBookName(String bookName) {
this.bookName = bookName;
}
public double getPrice() {
return price;
}
public void setPrice(double price) {
this.price = price;
}
public String toString() {
return "Book{" +"bookId=" + bookId +", bookName='" + bookName + '\'' +", price=" + price + '}';
}
public boolean equals(Object obj) {
if (obj == this) {
return true;
}
if (!(obj instanceof Book)) {
return false;
}
Book other = (Book) obj;
return this.bookId == other.bookId && this.bookName.equals(other.bookName) && this.price ==other.price;
}
public static int compare(Book book1, Book book2) {
if (book1.price < book2.price) {
return -1;
} else if (book1.price > book2.price) {
return 1;
} else {
return 0;
}
}
}
public class Q2{
public static void main(String[] args) {
Book book1 = new Book(1, "Book1", 10.0);
Book book2 = new Book(2, "Book2", 12.0);
System.out.println("Book1: " + book1);
System.out.println("Book2: " + book2);
int comparisonResult = Book.compare(book1, book2);
if (comparisonResult < 0) {
System.out.println("Book1 is cheaper than Book2");
} else if (comparisonResult > 0) {
System.out.println("Book2 is cheaper than Book1");
} else {
System.out.println("Both books have the same price");
}
}
}
