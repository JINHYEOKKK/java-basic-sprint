package 복습;

public class 복습3반복문과조건문짝수 {
    public static void main(String[] args) {
        // 1~100 중 짝수만 출력
        // 반복문을 통하여 1~100을 출력하는 프로그램을 생성
        // i가 1부터 100까지 출력을하는데 i에다가 %2 를 하여 0이 나오는 수는 짝수이므로 출력
        for (int i = 1; i <= 100 ; i++) {;
            if(i % 2 == 0)
                System.out.println(i);
            }
        }
    }

