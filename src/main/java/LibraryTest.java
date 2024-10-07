public class LibraryTest {
    public static void main(String[] args) {
        // Create a new book
        Book book1 = new Book(1, "978-3-16-148410-0", "The Great Gatsby");

        // Display its status (should not be checked out yet)
        System.out.println("Is the book checked out? " + book1.isCheckedOut());

        // Check out the book
        book1.checkOut("John Doe");

        // Try to check out the same book again
        book1.checkOut("Jane Smith");

        // Check in the book
        book1.checkIn();

        // Check the book in again (should say it was not checked out)
        book1.checkIn();
    }
}
