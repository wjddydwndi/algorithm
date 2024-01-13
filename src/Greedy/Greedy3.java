package Greedy;

import java.util.Scanner;

public class Greedy3 {
    /*
    * 1이 될 때까지
    * 어떠한 수 N이 1이 될 때까지 다음의 두 과정 중 하나를 반복적으로 선택하여 수행하려고 한다.
    * 단, 두 번쨰 연산은 N이 K로 나누어 떨어질 때만 선택할 수 있다.
    * 1. N에서 1을 뺀다.
    * 2. N을 K로 나눈다.
    * 25, 5  / 2
    * */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        int cnt = 0;
        while (n > 1) {

            n = n % k == 0 ? n/k : n-1;
            cnt++;
        }

        System.out.println(cnt);
    }
}
