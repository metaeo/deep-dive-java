package loop.ex;

public class WhileEx3 {
    // 누적 합 계산
    public static void main(String[] args) {
        int sum = 0;
        int max = 100;
        int i = 1;

        while (i <= max) {
            sum += i;
            System.out.println(sum);
            i++;
        }
        System.out.println();
        System.out.println("합계 : " + sum);
    }
}
