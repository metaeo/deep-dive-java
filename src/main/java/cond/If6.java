package cond;

public class If6 {
    public static void main(String[] args) {

        int price = 10000;
        int age = 10;
        int discount = 0;

        if (price >= 10000) {
            discount = discount + 1000;
            System.out.println("10000원 이상 구매, 1000원 할인");
            // 2번째는 적용 안된다. 첫번째에 매칭이 되었기 때문에
        } else if (age <= 10) {
            discount = discount + 1000;
            System.out.println("10세 이하 1000원 할인");
        } else {
            System.out.println("No discount");
        }
        System.out.println("총 할인 금액: " + discount + "원");

    }
}
