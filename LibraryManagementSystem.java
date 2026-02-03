import java.util.Scanner;

class Book {
    int id;
    String title;
    boolean available;

    Book(int id, String title) {
        this.id = id;
        this.title = title;
        this.available = true;
    }

    void display() {
        System.out.println(id + " | " + title + " | " +
                (available ? "Available" : "Borrowed"));
    }
}

public class LibraryManagementSystem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Book[] books = new Book[5];
        int count = 0;
        int choice;

        do {
            System.out.println("\n1. Add Book");
            System.out.println("2. View Books");
            System.out.println("3. Borrow Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    if (count >= books.length) {
                        System.out.println("Library Full");
                        break;
                    }
                    System.out.print("Enter Book ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Book Title: ");
                    String title = sc.nextLine();

                    books[count] = new Book(id, title);
                    count++;
                    System.out.println("Book Added");
                    break;

                case 2:
                    if (count == 0) {
                        System.out.println("No Books Available");
                    }
                    for (int i = 0; i < count; i++) {
                        books[i].display();
                    }
                    break;

                case 3:
                    System.out.print("Enter Book ID: ");
                    id = sc.nextInt();
                    for (int i = 0; i < count; i++) {
                        if (books[i].id == id) {
                            if (books[i].available) {
                                books[i].available = false;
                                System.out.println("Book Borrowed");
                            } else {
                                System.out.println("Book Already Borrowed");
                            }
                        }
                    }
                    break;

                case 4:
                    System.out.print("Enter Book ID: ");
                    id = sc.nextInt();
                    for (int i = 0; i < count; i++) {
                        if (books[i].id == id) {
                            books[i].available = true;
                            System.out.println("Book Returned");
                        }
                    }
                    break;

                case 5:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid Choice");
            }

        } while (choice != 5);

        sc.close();
    }
}
