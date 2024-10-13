package loop.ex;

public class ForEx4 {
    // 구구단 출력
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) { // 1-9 단까지
            for (int j = 1; j <= 9; j++) { // 9번씩 곱하기
                System.out.println(i + " * " + j + " = " + i * j);
            }
        }

    }
}
