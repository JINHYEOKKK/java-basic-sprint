package 복습;

import java.util.Scanner;

public class 복습1변수와타입 {
    public static void main(String[] args) {

        // 각각 타입을 정해 변수를 생성후 초기화.
        int num1 = 30;
        int num = 40;
        int sum = num - num1;
        int sum1 = num + num1;
        double dub = 50.0;
        char c = 'b';
        boolean t = true;
        String str = "jim";

        System.out.println("곱하기 결과: "+num * num1);
        System.out.println("나누기 결과: "+num / num1);
        System.out.println("더하기 결과: "+sum1);
        System.out.println("빼기 결과: "+sum);

        /* 이름과 나이를 입력받음
        콘솔로 입력 받아야 함.
        총 2개의 변수가 필요
        이름과 나이를 받을 수 있는 변수를 선언
        콘솔 입력을 위한 Scanner  객체 생성
        스캐너 객채를 사용하여 이름과 나이를 입력받음
        타입 +변수이름.next.Line() // 정수는 next.Int() */

        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        String name = sc.nextLine();
        System.out.print("나이를 입력하세요: ");
        String age = sc.nextLine();


        System.out.println("이름: " + name);
        System.out.print("나이: " + age);










    }
}


