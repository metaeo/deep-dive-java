package cond;

public class CondOpEx {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        int max = (a > b) ? a : b;
        String maxS = (a > b) ? "a" : "b";
        System.out.println("더 큰 숫자는 " + maxS + ", " + max + "입니다");
    }
}
