
package practice;
import java.util.*;

public class Arrange {

    public static boolean canArrangeStudents(int numCases, List<int[]> cases) {
        List<String> results = new ArrayList<>();

        for (int t = 0; t < numCases; t++) {
            int[] boys = cases.get(t * 2);
            int[] girls = cases.get(t * 2 + 1);
            int n = boys.length;

            Arrays.sort(boys);
            Arrays.sort(girls);

            boolean isPossible = isValidArrangement(boys, girls) || isValidArrangement(girls, boys);

            if (isPossible) {
                results.add("YES");
            } else {
                results.add("NO");
            }
        }

        for (String result : results) {
            System.out.println(result);
        }

        return true;
    }

    public static boolean isValidArrangement(int[] boys, int[] girls) {
        int n = boys.length;
        int[] arranged = new int[2 * n];

        int i = 0, j = 0, index = 0;
        boolean turn = true;

        while (i < n && j < n) {
            if (turn) {
                arranged[index++] = boys[i++];
            } else {
                arranged[index++] = girls[j++];
            }
            turn = !turn;
        }

    

        for (int k = 1; k < arranged.length; k++) {
            if (arranged[k] < arranged[k - 1]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numCases = sc.nextInt();

        List<int[]> cases = new ArrayList<>();

        for (int i = 0; i < numCases; i++) {
            int n = sc.nextInt();
            int[] boys = new int[n];
            int[] girls = new int[n];

            for (int j = 0; j < n; j++) {
                boys[j] = sc.nextInt();
            }
            for (int j = 0; j < n; j++) {
                girls[j] = sc.nextInt();
            }

            cases.add(boys);
            cases.add(girls);
        }

        canArrangeStudents(numCases, cases);
        sc.close();
    }
}