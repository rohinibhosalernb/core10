package Mini_project;

import java.util.Scanner;

public class Main_method 
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create Library Management System
        LibraryManagementSystem librarySystem = new LibraryManagementSystem(100);
        boolean isRunning = true;
        System.out.println("Welcome to the Library Management System!");
        while (isRunning) {
            // Display menu options

            System.out.println("1. Login");
            System.out.println("2. Sign up");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    loginUser(librarySystem, scanner);
                    break;
                case 2:
                    signUpUser(librarySystem, scanner);
                    break;
                case 3:
                    System.out.println("Exiting the system...");
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }

        scanner.close();
    }

    // Sign-up
    private static void loginUser(LibraryManagementSystem librarySystem, Scanner scanner) {
        System.out.println("Please enter your credentials to login.");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        User user = librarySystem.getUserByUsername(username);
        if (user != null && user.checkPassword(password)) {
            System.out.println("Login successful!");
            // Proceed with user tasks...
            adminPage(librarySystem, scanner, user);
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }
    }

    private static void signUpUser(LibraryManagementSystem librarySystem, Scanner scanner) {
        System.out.println("Please enter your desired username and password to sign up.");
        System.out.print("Enter username: ");
        String username = scanner.nextLine();

        // Check if username already exists
        User existingUser = librarySystem.getUserByUsername(username);
        if (existingUser != null) {
            System.out.println("Username already exists. Please choose another one.");
            return;
        }

        System.out.print("Enter password: ");
        String password = scanner.nextLine();

        // Add user
        User newUser = new User(username, password);
        librarySystem.addUser(newUser);
        System.out.println("User signed up successfully!");
    }


    // Admin page
    private static void adminPage(LibraryManagementSystem librarySystem, Scanner scanner, User currentUser) {
        System.out.println("Login successful!");
        System.out.println("Welcome to the Admin Page, " + currentUser.getUsername() + "!");
        System.out.println("1. Student Record");
        System.out.println("2. Book Record");
        System.out.println("3. Manage Book");
        System.out.println("4. Exit");

        boolean isAdminPageOpen = true;
        while (isAdminPageOpen) {
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Student Record");
                    handleStudentRecord(librarySystem, scanner);
                    break;
                case 2:
                    System.out.println("Book Record");
                    handleBookRecord(librarySystem, scanner);
                    break;
                case 3:
                    System.out.println("Manage Book");
                    // Add logic for managing books
                    break;
                case 4:
                    System.out.println("Exiting Admin Page...");
                    isAdminPageOpen = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
    }

    private static void handleStudentRecord(LibraryManagementSystem librarySystem, Scanner scanner) {
        boolean isStudentRecordOpen = true;
        while (isStudentRecordOpen) {
            System.out.println("1. Add Student");
            System.out.println("2. Display Students");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addStudents(librarySystem, scanner);
                    break;
                case 2:
                    librarySystem.displayStudents();
                    break;
                case 3:
                    System.out.println("Exiting Student Record...");
                    isStudentRecordOpen = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        // After exiting student record, return to admin page
        System.out.println("Returning to Admin Page...");
        showAdminPage();
    }

    private static void addStudents(LibraryManagementSystem librarySystem, Scanner scanner) {
        System.out.print("How many students do you want to add? ");
        int numStudents = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        Student[] newStudents = new Student[numStudents];
        for (int i = 0; i < numStudents; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter student ID: ");
            int id = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            newStudents[i] = new Student(name, id); // Create a new Student object
        }

        librarySystem.addStudents(newStudents); // Add the new students to the library system
        System.out.println("Students added successfully!");
    }

    private static void handleBookRecord(LibraryManagementSystem librarySystem, Scanner scanner) {
        boolean isBookRecordOpen = true;
        while (isBookRecordOpen) {
            System.out.println("1. Add Book");
            System.out.println("2. Display Books");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    addBook(librarySystem, scanner);
                    break;
                case 2:
                    librarySystem.displayBooks();
                    break;
                case 3:
                    System.out.println("Exiting Book Record...");
                    isBookRecordOpen = false;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }
        // After exiting book record, return to admin page
        System.out.println("Returning to Admin Page...");
        showAdminPage();
    }

    private static void showAdminPage() {
        System.out.println("1. Student Record");
        System.out.println("2. Book Record");
        System.out.println("3. Manage Book");
        System.out.println("4. Exit");
    }

    private static void addBook(LibraryManagementSystem librarySystem, Scanner scanner) {
        System.out.print("Enter book title: ");
        String title = scanner.nextLine();
        System.out.print("Enter book author: ");
        String author = scanner.nextLine();
        System.out.print("Enter book ISBN: ");
        int isbn = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        Book newBook = new Book(title, author, isbn); // Create a new Book object
        librarySystem.addBook(newBook); // Add the new book to the library system
        System.out.println("Book added successfully!");
    }
}

