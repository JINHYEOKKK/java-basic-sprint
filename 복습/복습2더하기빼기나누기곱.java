package 복습;

import java.util.Scanner;

public class 복습2더하기빼기나누기곱 {
    public static void main(String[] args) {
        // 사용자한테 값을 입력받을수있게 스캐너를 호출
        // 숫자 두개를 입력하라는 문구를 출력하자
        // 값을 입력받고 값을 초가화 할수있는 변수를 만들자
        // 출력문으로 + - * / % 각각 결과를 출력하자

        Scanner input = new Scanner(System.in);


                System.out.println("---숫자를 두개를 입력해주새요---");

                System.out.print("첫번째 숫자를 입력하주세요: ");
                double num = input.nextDouble();

                System.out.print("두번째 숫자를 입력해주세요: ");
                double num2 = input.nextDouble();

                System.out.println("덧샘 결과는: " + num + num2);
                System.out.println("빼기 결과는: " + (num - num2));
                System.out.println("곱샘 결과는: " + num * num2);
                System.out.println("나머지 결과는: " + num % num2);
                System.out.println("나누기 결과는: " + num / num2);
                input.nextLine();

        //if문으로 0으로 나누기의 예외 처리를 따로 해주기.
        try {
            System.out.println(2 / 0);

        } catch (Exception e) {
            System.out.println("0으로 나눌수 없습니다.");
        }
    }
}



