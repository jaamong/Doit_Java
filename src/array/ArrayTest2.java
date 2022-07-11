package array;

public class ArrayTest2 {
    public static void main(String[] args) {

        char[] alphabets = new char[26];
        char ch = 'A';

        for(int i =0; i<alphabets.length; i++, ch++) {
            alphabets[i] = ch;
        }
    }
}
