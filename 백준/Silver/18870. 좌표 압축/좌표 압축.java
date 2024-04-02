import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        int [] origin = new int[N];
        int [] sorted = new int[N];
        HashMap<Integer, Integer> Map = new HashMap<Integer, Integer>();

        for (int i = 0; i < N; i++) {
            sorted[i] = origin[i] = sc.nextInt();
        }
        Arrays.sort(sorted);

        int rank = 0;
        for(int value : sorted){
            if (!Map.containsKey(value)){
                Map.put(value, rank);
                rank++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int key : origin){
            int ranking = Map.get(key);
            sb.append(ranking).append(' ');
        }
        System.out.println(sb);


    }
}