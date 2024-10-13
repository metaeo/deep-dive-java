package loop.ex;

public class ForEx3 {
    // 누적 합 계산
    public static void main(String[] args) {
        int max = 100;
        int sum = 0;

        for (int i = 1; i <= max; i++) {
            sum += i;
            System.out.println("Calculating... " + sum);
        }
        System.out.println("합계 = " + sum);
    }
}
