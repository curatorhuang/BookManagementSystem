package org.example.bookmanagement;

public class BookManagementApplication {
    public static void main(String[] args) {
        BookManager bookManager = new BookManager();

        // 添加一些书籍
        bookManager.addBook(new Book("1984", "George Orwell", "123456789"));
        bookManager.addBook(new Book("To Kill a Mockingbird", "Harper Lee", "987654321"));

        // 查找书籍
        System.out.println("Find book with ISBN 123456789: " + bookManager.findBookByIsbn("123456789"));

        // 列出所有书籍
        System.out.println("All books: " + bookManager.getAllBooks());

        // 删除书籍
        bookManager.removeBook("123456789");

        // 列出所有书籍
        System.out.println("All books after removal: " + bookManager.getAllBooks());
    }
}

