package 복습;

import java.util.Scanner;

public class 복습3반복문과조건문n의합 {
    public static void main(String[] args) {
        /*
        스캐너 객체 호출한다.
        값을 입력받을 변수가 필요하다.
        사용자가 만약 5를 입력했다면, 5번을 반복해서 중첩시켜 합을 구해야하니 그 합을 저장할 변수도 필요하다.
         */
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;
        //1부터 사용자로부터 입력받은 수까지 반복 하겠다
        for (int i = 1; i <= n; i++) {
            // n만큼 i가 반복하여 합해지는 값을 변수 sum에 저장
            sum += i;

        }
        System.out.println(sum);


    }
}
