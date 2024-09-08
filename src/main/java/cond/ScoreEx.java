package cond;

public class ScoreEx {
    public static void main(String[] args) {
        int score = 85;
        String s;
        // 스트링에 저장하지 않고 바로 프린트문 안에 학점은 ABCDF 라고 할 수도 있음.

        if (score >= 90) {
            s = "A";
            System.out.println("학점은 " + s + "입니다.");
        } else if (score >= 80) {
            s = "B";
            System.out.println("학점은 " + s + "입니다.");
        } else if (score >= 70) {
            s = "C";
            System.out.println("학점은 " + s + "입니다.");
        } else if (score >= 60) {
            s = "D";
            System.out.println("학점은 " + s + "입니다.");
        } else {
            s = "F";
            System.out.println("학점은 " + s + "입니다.");
        }


    }
}
