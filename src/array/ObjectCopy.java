package array;

public class ObjectCopy {
    public static void main(String[] args) {
        Book[] books1 = new Book[3];
        Book[] books2 = new Book[3];

        books1[0] = new Book("뿡", "뿡뿡이");
        books1[1] = new Book("뿡1", "뿡뿡이");
        books1[2] = new Book("뿡2", "뿡뿡이");

        System.arraycopy(books1, 0, books2, 0, 3); //books1 --copy-> books2 : 주소만 복사(얕은 복사)

        for (int i = 0; i < books2.length; i++) {
            books2[i].showBookInfo();
        }

        books1[0].setName("엥");
        books1[0].setAuthor("파리");

        for (int i = 0; i < books1.length; i++) {
            books1[i].showBookInfo();
            books2[i].showBookInfo(); //같이 바뀜, 주소만 복사됐으므로(얕은 복사)
        }

        //현재 instance는 3개만 생성되어 있음
        //객체 배열의 깊은 복사로 다른 값이 출력되도록 하자
        books2[0] = new Book(); //default constructor로 books2 배열 instacne만 생성
        books2[1] = new Book();
        books2[2] = new Book();

        for (int i = 0; i < books2.length; i++) { //arraycopy로 복사하는 것이 아닌 직접 복사
            books2[i].setName(books1[i].getName());
            books2[i].setAuthor(books1[i].getAuthor());
        }

        books1[0].setName("뭵");
        books1[0].setAuthor("야옹이");

        for (int i = 0; i < books1.length; i++) {
            books1[i].showBookInfo();
            books2[i].showBookInfo();
        }

        //enhanced for loop
        System.out.println("=======================enhanced for loop========================");

        String[] strArr = {"Java", "Android", "C"};
        for (String s : strArr) { //첨부터 끝까지 참조
            System.out.println(s);
        }

        int[] arr = {1, 2, 3, 4, 5};
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
