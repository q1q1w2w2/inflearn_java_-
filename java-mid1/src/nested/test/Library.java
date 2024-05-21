package nested.test;

public class Library {
    private Book[] books;
    private int count;

    public Library(int size) {
        books = new Book[size];
        count = 0;
    }

    public void addBook(String title, String author){
        if(count < books.length){
            books[count++] = new Book(title, author);
        }else{
            System.out.println("공간 부족");
        }
    }

    public void showBooks(){
        System.out.println("== 책 목록 출력 ==");
        for (int i = 0; i < books.length; i++){
            System.out.println("도서 제목: " + books[i].title + ", 저자: " + books[i].author);
        }
    }

    private static class Book{
        private String title;
        private String author;

        public Book(String title, String author) {
            this.title = title;
            this.author = author;
        }
    }
}
