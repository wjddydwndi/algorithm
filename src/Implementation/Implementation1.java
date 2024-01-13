package Implementation;

import java.util.Scanner;

public class Implementation1 {
    /* 상하좌우
    *  여행가 A는 N * N 크기의 정사각형 공가 위에 서 있다.
    * 이 공간은 1 * 1 크기의 정사각형으로 나누어져 있다.
    * 가장 왼쪽 위 좌표는 (1 , 1) 이며, 가장 오른쪽 아래 좌표는 (N, N)에 해당한다.
    * 여행가 A는 상, 하, 좌, 우 방향으로 이동할 수 있으며, 시작 좌표는 항상 (1, 1)이다.
    * 우리 앞에는 여행가 A가 이동할 계획이 적힌 계획서가 놓여있다. 계획서에는 하나의 줄에 띄어쓰기를 기준으로 하여 L, R, U, D 중 하나의 문자가 반복적으로 적혀있다.
    * 각 문자의 의미는 다음과 같다.
    * - L : 왼쪽으로 한 칸 이동
    * - R : 오른쪽으로 한 칸 이동
    * - U : 위로 한 칸 이동
    * - D : 아래로 한 칸 이동
    * 이때, 여행가 A가 N * N 크기의 정사각형 공간을 벗어나는 움직임은 무시된다.
    * */

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        char[] arr = sc.nextLine().replaceAll(" ","").toCharArray();

        char[] w = {'L', 'R', 'U', 'D'};

        int[] dx = {-1, 1, 0, 0};
        int[] dy = {0, 0, -1, 1};

        int x = 1;
        int y = 1;

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j < w.length; j++) {
                if (w[j] == arr[i]) {
                    if (x + dx[j] > 0 && x + dx[j] < n + 1) {
                        x += dx[j];
                    }

                    if (y + dy[j] > 0 && y + dy[j] < n + 1) {
                        y += dy[j];
                    }
                }
            }
        }
        System.out.println(x);
        System.out.println(y);
    }
}
