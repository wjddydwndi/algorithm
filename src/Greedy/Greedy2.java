package Greedy;

import java.util.Scanner;

public class Greedy2 {
    /*
    * 1. 숫자가 쓰인 카드들이 n * m 형태로 놓여있다. 이 때, n 은 행의 개수를 의미하며, m은 열의 개수를 의미한다.
    * 2. 먼저 뽑고자 하는 카드가 포함되어 있는 행을 선택한다.
    * 3. 그 다음 선택된 행에 포함된 카드들 중 가장 숫자가 낮은 카드를 뽑아야 한다.
    * 4. 따라서 처음에 카드를 골라낼 행을 선택할 때, 이후에 해당 행에서
    * 가장 숫자가 낮은 카드를 뽑을 것을 고려하여 최종적으로 가장 높은 숫자의 카드를 뽑을 수 있도록 전략을 세워야 한다.
    *
    * 예 )
    * 3 3
    * 3 1 2
    * 4 1 4
    * 2 2 2
    * 답 : 2
    * */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        int max = 0;
        for (int i = 0; i < m; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < n; j++) {
                min = Math.min(min, sc.nextInt());
            }
            max = Math.max(max, min);
            System.out.println(max);
        }

        System.out.println(max);
    }
}
