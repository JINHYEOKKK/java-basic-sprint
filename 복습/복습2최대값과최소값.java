package 복습;

import java.util.Scanner;

public class 복습2최대값과최소값 {
    public static void main(String[] args) {
        /*- 세 개의 다른 정수 값들을 비교하여 가장 큰 수와 가장 작은 수를 결정하는 프로그램을 작성하세요.
            - 세 개의 다른 정수는 모두 콘솔 입력을 통해 할당합니다.
            - **`&&`**, **`||`**, **`!`** 연산자를 사용하여 논리 연산을 수행하는 예제를 작성하세요. */

        Scanner threeNum = new Scanner(System.in);

        System.out.println("비교하고 싶은 숫자 3개를 입력하새요.");

        System.out.print("첫번째: ");
        int a = threeNum.nextInt();

        System.out.print("두번째: ");
        int b = threeNum.nextInt();

        System.out.print("세번째: ");
        int c = threeNum.nextInt();

        // 가장 큰수를 담을 변수.
        int max;

        // a 가 b 보다 크거나 같은때와 a 가 c 보다 크거나 같을때. 둘다 조건에 맞으면 max = a;
        if (a >= b && a >= c) {
            max = a;
            //b 가 a 보다 크거나 같을때와 b 가 c 보다 크거나 같을때. 둘다 조건에 맞으면 max에 b가 제일큰수니까 들어간다.
        } else if (b >= a && b >= c) {
            max = b;
        } else { //위 조건이 다 안맞으면 c가 제일 큰수므로 max에 c값이 담긴다.
            max = c;

        }

        System.out.println("비교하고 싶은 숫자 3개를 입력하새요.");

        System.out.print("첫번째: ");
        int z = threeNum.nextInt();

        System.out.print("두번째: ");
        int x = threeNum.nextInt();

        System.out.print("세번째: ");
        int v = threeNum.nextInt();

        // 가장 작은수를 넣을 변수.
        int min;

        if(z <= x && z <= v){
            min = z;
        }else if(x <= z && x <= v) {
            min = x;
        }else{
            min = v;
        }
        System.out.println("가장 작은수는: " +min);
        System.out.println("가장 큰수는: " +max);

    }
}

