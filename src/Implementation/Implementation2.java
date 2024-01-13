package Implementation;

import java.util.Scanner;

public class Implementation2 {
    /* 시각
    * 정수 N이 입력되면 00시 00분 00초부터 N시 59분 59초까지의 모든 시각 중에서
    * 3이 하나라도 포함되는 모든 경우의 수를 구하는 프로그램을 작성하시오.
    * 예를 들어, 1을 입력했을 떄 다음은 3이 하나라도 포함되어 있으므로 세어야 하는 시각이다.
    * - 00시 00분 00초
    * - 00시 13분 30초
    * */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int cnt = 0;

        for (int i = 0; i <= n; i++) { // 시
            for (int j = 0; j < 60; j++) { // 분
                for (int k = 0; k < 60; k++) { // 초

                    if ((String.valueOf(i) + String.valueOf(j) + String.valueOf(k)).indexOf("3") > -1) {
                        cnt ++;
                    }
                }
            }
        }
        System.out.println(cnt);
    }
}
