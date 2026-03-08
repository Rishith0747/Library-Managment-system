public class Book {
    int bookId;
    String title;
    String author;
    boolean isBorrowed;

    Book(int bookId,String title,String author){
        this.bookId = bookId;
        this.title = title;
        this.author = author;
        this.isBorrowed =false;
    }

    void display(){
        System.out.println("BookID :" + bookId);
        System.out.println("Title of the Book; "+title);
        System.out.println("Author of the Book: "+author);
        if(isBorrowed ==true){
            System.out.println("Status: Borrowed.");
        }
        else{
            System.out.println("Status: Available.");
        }
    }
    void borrow(){
        if(isBorrowed == false){
            System.out.println("Book borrowed successfully");
            isBorrowed = true;
        }
        else{
            System.out.println("The book is already Borrowed.");
        }
    }
    void returnbook(){
        if(isBorrowed == true){
            System.out.println("Hope you enjoyed Reading the Book.");
            isBorrowed = false;
        }
        else{
            System.out.println("It is not Borrowed.");
        }
    }
}
