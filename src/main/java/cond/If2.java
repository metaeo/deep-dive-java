package cond;

import java.util.Scanner;

public class If2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int age = sc.nextInt();
        if (age >= 19) {
            System.out.println("성인이네");
        } else {
            System.out.println("미성년자네!");
        }
    }
}
