public class Book {
    // Properties (Instance Variables)
    private int id;
    private String isbn;
    private String title;
    private boolean isCheckedOut;
    private String checkedOutTo;

    // Constructor (to initialize the Book object)
    public Book(int id, String isbn, String title) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.isCheckedOut = false;  // When a book is created, it's not checked out
        this.checkedOutTo = "";     // No one has checked out the book yet
    }

    // Getters and Setters for the properties
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public boolean isCheckedOut() {
        return isCheckedOut;
    }

    public String getCheckedOutTo() {
        return checkedOutTo;
    }

    // Methods for checking out a book
    public void checkOut(String name) {
        if (!this.isCheckedOut) {  // If the book is not already checked out
            this.isCheckedOut = true;
            this.checkedOutTo = name;
            System.out.println("The book '" + this.title + "' has been checked out by " + name + ".");
        } else {
            System.out.println("The book '" + this.title + "' is already checked out by " + this.checkedOutTo + ".");
        }
    }

    // Methods for checking in a book
    public void checkIn() {
        if (this.isCheckedOut) {  // If the book is checked out
            this.isCheckedOut = false;
            System.out.println("The book '" + this.title + "' has been returned by " + this.checkedOutTo + ".");
            this.checkedOutTo = "";  // Reset the person who checked it out
        } else {
            System.out.println("The book '" + this.title + "' was not checked out.");
        }
    }
}

