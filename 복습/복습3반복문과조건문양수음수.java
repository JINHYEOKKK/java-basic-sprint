package 복습;

import java.util.Scanner;

public class 복습3반복문과조건문양수음수 {
    public static void main(String[] args) {
        // 사용자로부터 입력받을 스캐너와 값을 초기화할 변수를 생성
        // 사용자가 입력한 숫자가 양수인지, 음수인지, 0인지를 판단하여 출력
        // 조건문을 통하여 0보다 크거나 작거나를 확인
        Scanner sc = new Scanner(System.in);

        System.out.print("숫자를 한개를 입력하세요:");

        int num = sc.nextInt();

        if(num > 0) {
            System.out.println("입련된 값은 양수입니다.");
        }else if(num < 0) {
            System.out.println("입렫된 값은 음수입니다.");
        }else{
            System.out.println("입력된 값은 0입니다.");
        }




    }
}
