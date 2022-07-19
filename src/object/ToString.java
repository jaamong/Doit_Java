package object;

class Book{
    String title;
    String author;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public String toString() { //Object 클래스의 toString 메소드를 재정의
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}

public class ToString {
    public static void main(String[] args) {
        Book book = new Book("부활", "한포진");
        System.out.println(book); //해쉬코드값

        String str = new String("test");
        System.out.println(str); //"test" : String class에 object 클래스의 toString이 이미 재정의 되어있기 때문
    }
}
