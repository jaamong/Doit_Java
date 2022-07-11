package array;

public class BookArray {
    public static void main(String[] args) {
        Book[] library = new Book[5];
        //책이 5권이 아니라, 책 5개를 위한 주소 5개임 (객체 배열)
        //instance를 가리키는 주소 : 참조값 -> 해당 참조값은 주소에 들어간다.

        for(int i=0; i< library.length; i++) {
            //객체 배열의 경우 null로 초기화 됨
            System.out.println(library[i]);
        }

        library[0] = new Book("뿡", "뿡뿡이"); //객체 생성
        library[1] = new Book("뿡1", "뿡뿡이");
        library[2] = new Book("뿡2", "뿡뿡이");
        library[3] = new Book("뿡3", "뿡뿡이");
        library[4] = new Book("뿡4", "뿡뿡이");

        for(int i=0; i< library.length; i++){
            System.out.println(library[i]); //주소값
            library[i].showBookInfo();
        }
    }
}
