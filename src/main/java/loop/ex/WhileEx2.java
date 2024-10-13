package loop.ex;

public class WhileEx2 {

    // 짝수 출력하기
    public static void main(String[] args) {
        int num = 0;
        int count = 1;

        while (count <= 10) {
            num += 2;
            count++;
            System.out.println(num);
        }
        // count 1, num = 2
        // count 2, num = 4
        // count 3, num = 6
        // ...
        // count 10, num = 20

    }
}

