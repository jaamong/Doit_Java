package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

    //throws : exception 미루기 -> 호출하는 쪽에서 핸들링해야함
    public Class loadClass(String fileName, String className) throws FileNotFoundException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream(fileName); //FileNotFoundException 핸들링
        Class c = Class.forName(className); //ClassNotFoundExceptino 핸들링
        return c;
    }

    public static void main(String[] args) {
        //try-catch를 안걸면 throws 해야함

        ThrowsException ex = new ThrowsException(); //호출했으니까 try-catch로 핸들링
        try {
            ex.loadClass("b.txt", "java.lang.String");
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (Exception e) { //Runtime error 잡는 용도 : Exception - 모든 예외 처리의 최상위 클래스라서 모든 에러가 잡힘
            System.out.println(e); //맨 위에 놓으면 안됨. 맨 마지막에 둘것
        }
        System.out.println("end");
    }
}
