import java.io.*;

public class Problem1005 {
    static int round;   //테스트 횟수
    static int N;       //건물 수
    static int K;       //건물 순서 규칙 수
    static int[] times;  //각 건물 소요시간
    static int[][] curriculum;
    static int W;       //마지막 건설 건물

    static int[] beforeW;
    static int[] answer;

    public static void main(String[] agrs) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        round = Integer.parseInt(br.readLine());
        answer = new int[round];

        for (int r=0; r<round; r++) {
            String[] spl = br.readLine().split(" ");
            N = Integer.parseInt(spl[0]);
            K = Integer.parseInt(spl[1]);

            times = new int[N];
            spl = br.readLine().split(" ");
            for (int i=0; i<N; i++) {
                times[i] = Integer.parseInt(spl[i]);
            }

            curriculum = new int[N][N];
            int before;
            int after;
            for (int i=0; i<K; i++) {
                spl = br.readLine().split(" ");
                before = Integer.parseInt(spl[0]);
                after = Integer.parseInt(spl[1]);
                curriculum[before-1][after-1] = 1;
            }

            W = Integer.parseInt(br.readLine());

            beforeW = new int[N];
            for (int i=0; i<N; i++) {
                beforeW[i] = -1;
            }
            answer[r] = calcu(W-1);
        }

        for(int r : answer) {
            System.out.println(r);
        }
    }

    public static int calcu(int target) {
        
        if(beforeW[target] != -1) {
            return beforeW[target];
        }
        int currentCost = 0;
        for (int i=0; i<N; i++) {
            if(curriculum[i][target] == 1) {
                currentCost = Math.max(currentCost, calcu(i));
            }
        }
        beforeW[target] = currentCost + times[target];
        return beforeW[target];
    }
}
