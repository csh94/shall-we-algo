import java.io.*;
import java.util.StringTokenizer;

public class Problem1012 {
    static int[][] map;
    static int m,n,k,x,y;
    static int[] dx = {0, 1, -1, 0};
    static int[] dy = {1, 0, 0, -1};

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st;

        int T = Integer.parseInt(br.readLine());

        for (int i=0; i<T; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            while(st.hasMoreTokens()) {
                m = Integer.parseInt(st.nextToken());
                n = Integer.parseInt(st.nextToken());
                k = Integer.parseInt(st.nextToken()); 
            }

            map = new int[n][m];

            for (int j=0; j<k; j++) {
                st = new StringTokenizer(br.readLine(), " ");
                while(st.hasMoreTokens()) {
                    x=Integer.parseInt(st.nextToken());
                    y=Integer.parseInt(st.nextToken());
                    map[y][x] = 1;
                }
            }
            System.out.println(solution());
        }
    }

    public static int solution() {
        int count = 0;
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                if(map[i][j] == 1) {
                    conc(i, j);
                    count++;
                }
            }
        }
        return count;
    }

    public static void conc(int x, int y) {
        map[x][y] = 0;
        for (int i=0; i<4; i++) {
            if(x+dx[i] >= 0 && x+dx[i] < n && y+dy[i] >= 0 && y+dy[i] < m) {
                if(map[i+dx[i]][y+dy[i]] == 1) {
                    conc(x+dx[i], y+dy[i]);
                }
            }
        }
    }
}
