//create graph//

import java.util.*;

public class graph {
    public static void main(String[] args) {
        //Introduction//
        System.out.println("######################################");
        System.out.println("Program by Teuton Roy");
        System.out.println("######################################");

        Scanner sc = new Scanner(System.in);

        int n;
        System.out.println("Enter how many nodes you want: ");
        n = sc.nextInt();

        int[][] graph = new int[n][n];

        System.out.println("Enter the graph: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                graph[i][j] = sc.nextInt();
            }
        }

        System.out.println("The graph is: ");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }
}