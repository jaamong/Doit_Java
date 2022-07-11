package array;

public class TwoDimensionArr {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];
        System.out.println(arr.length); //2 -> [0][0] 가리킴. 행의 길이를 의미함
        System.out.println(arr[0].length); //3 -> 첫번째 행의 열의 길이
    }
}
