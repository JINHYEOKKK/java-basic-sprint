package 복습;

import java.util.Scanner;

public class 배열복습4학생점수평균 {
    public static void main(String[] args) {
        //사용자로부터 5명의 학생의 점수를 입력받을 변수를 만든다
        //학생 5명의 점수를 합산한다
        //합산한 점수를 5로 나눈후 출련한다

        Scanner sc = new Scanner(System.in);

        System.out.println("5명의 점수를 각각 입력하세요: ");
//      sc.nextLine();
        int sum1 =0;
        for (int i = 1; i <=5; i++) {
            System.out.print(i+ "번째 학생:");
            double student1 = sc.nextDouble();
            //sum1에 학생들의 점수를 다 더해준다.
            sum1 += student1;
        }

        System.out.println(("평균 점수는: " + sum1 /5));
    }
}

