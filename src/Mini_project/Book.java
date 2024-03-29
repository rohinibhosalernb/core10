package Mini_project;

//Book class here to create variable pass it through method using parameterised constructor
public class Book {
  private String title;
  private String author;
  private int isbn;

  public Book(String title, String author, int isbn) {
      this.title = title;
      this.author = author;
      this.isbn = isbn;
  }

  public String getTitle() {
      return title;
  }

  public String getAuthor() {
      return author;
  }

  public int getIsbn() {
      return isbn;
  }
}




