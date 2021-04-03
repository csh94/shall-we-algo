import java.io.*;
import java.util.StringTokenizer;

public class Problem1010 {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;
        StringBuilder sb = new StringBuilder();

        int[][] dp = new int [30][30];

        for (int i=0; i<30; i++){
            dp[i][i] = 1;
            dp[i][0] = 1;
        }

        for (int i=2; i<30; i++) {
            for (int j=1; j<30; j++) {
                dp[i][j] = dp[i-1][j-1] + dp[i-1][j];
            }
        }

        int Num = Integer.parseInt(br.readLine());

        for (int i=0; i<Num; i++) {
            st = new StringTokenizer(br.readLine(), " ");

            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());

            sb.append(dp[M][N]).append('\n'); // M개 중 N개 를 뽑는 수
        } 
        System.out.println(sb);
    } 
}
