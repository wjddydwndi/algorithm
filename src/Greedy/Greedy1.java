package Greedy;

import java.util.Arrays;
import java.util.Scanner;

public class Greedy1 {

    public static void main(String[] args) {
        /*
        * 다양한 수로 이루어진 배열이 있을 때 주어진 수들을 m 번 더하여 가장 큰 수를 만드는 법칙.
        * 단, 배열의 특정한 인덱스(번호)에 해당하는 수가 연속해서 k번을 초과하여 더해질 수 없는 것이 법칙의 특징이다.
        *
        * 예 ) 2, 4, 5, 4, 6 / m = 8 / k = 3
        * 6 + 6 + 6 + 5 + 6 + 6 + 6 + 6 + 5 = 46
        * */
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);

        int first = arr[n - 1];
        int second = arr[n - 2];

        int a = m / (k + 1) * k + m % (k + 1);
        a = a * first;
        int b =  m / (k + 1) * second;

        System.out.println(a + b);
    }
}
