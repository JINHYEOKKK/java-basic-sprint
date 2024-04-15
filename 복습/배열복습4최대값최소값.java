package 복습;

public class 배열복습4최대값최소값 {
    public static void main(String[] args) {
        {

            //처음에 입력받아야할 값과 출력해야할것을 처음에 코드작성하기전에 생각해보자.

        /*
            1. 필요한 변수
            입력받을 배열
            최대값, 최소값


            3. 결과 출력
            최대값과 최소값을 출력한다.

         */
            //입력받을 배열
            int[] arr = {1, 20, 3, 4, 9};

            // 반복문으로 배열안에 있는 값들을 출력
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }

            //최대값,최소값을 변수에 저장
            int max = Integer.MIN_VALUE;
            int min = Integer.MAX_VALUE;

           /* 2. 동작
            반복문안에서 배열의 요소(index)를 하나씩 접근하면서 기존의 최대값과 배열의 요소를 비교해서 최대값을 다시 선언
            최소값도 동일하게. */

            for (int i = 0; i < arr.length; i++) {
                // max라는 변수에 최소값을 담아줬기 때문에 max보다 배열에 있는 숫자가 순차적으로 돌면서 점점 큰수가 max로 값이 저장된다.
                if (max < arr[i]) {
                    max = arr[i];
                }

                if (min > arr[i]) {
                    min = arr[i];
                }
            }

            System.out.println(min);
            System.out.println(max);

        }
    }
}