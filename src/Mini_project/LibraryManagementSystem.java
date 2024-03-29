package Mini_project;

public class LibraryManagementSystem {
    private User[] users;//array of User objects to store user data
    private Student[] students;
    private Book[] books;
    private int userCount;
    private int studentCount;
    private int bookCount;

    public LibraryManagementSystem(int maxSize) {
        users = new User[maxSize];
        students = new Student[maxSize];
        books = new Book[maxSize];
        userCount = 0;
        studentCount = 0;
        bookCount = 0;
    }

    public void addUser(User user) {
        users[userCount++] = user;
    }

    public User getUserByUsername(String username) {
        for (int i = 0; i < userCount; i++) {
            if (users[i].getUsername().equals(username)) {
                return users[i];
            }
        }
        return null;
    }

    public void addStudent(Student student) {
        students[studentCount++] = student;
    }

    public void addStudents(Student[] newStudents) {
        for (int i = 0; i < newStudents.length; i++) {
            students[studentCount++] = newStudents[i];
        }
    }

    public void addBook(Book book) {
        books[bookCount++] = book;
    }

    public void displayStudents() {
        if (studentCount == 0) {
            System.out.println("No students to display.");
            return;
        }
        System.out.println("Students:");
        for (int i = 0; i < studentCount; i++) {
            System.out.println("Name: " + students[i].getName() + ", ID: " + students[i].getId());
        }
    }

    public void displayBooks() {
        if (bookCount == 0) {
            System.out.println("No books to display.");
           
        }
        else {
        System.out.println("Books:");
        for (int i = 0; i < bookCount; i++) {
            System.out.println("Title: " + books[i].getTitle() + ", Author: " + books[i].getAuthor() + ", ISBN: " + books[i].getIsbn());
        }
        }
    }
}
