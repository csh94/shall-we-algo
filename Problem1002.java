import java.io.*;
import java.util.*;

public class Problem1002 {
    public static int calPoint(int x1, int y1, int r1, int x2, int y2, int r2){
        int r = (int)(Math.pow(x2-x1, 2) + Math.pow(y2-y2, 2));

            if (x1==x2 && y1==y2 && r1==r2){
                return -1;  // 두원이 같을때
            } else if (r == Math.pow(r2+r1, 2)) {
                return 1;    // 외접 접점 
            } else if (r == Math.pow(r2-r1, 2)) {
                return 1;    // 내접 접점
            } else if (r > Math.pow(r2+r1, 2)) {
                return 0;    // 두원이 떨어짐
            } else if (r < Math.pow(r2-r1, 2)) {
                return 0;    // 원 내부에 원
            } else {
                return 2;    // 접점이 두개
            }
    }
    public static void main(String[] args) throws IOException {
        StringTokenizer st; 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());
            System.out.println(calPoint(x1,y1,r1,x2,y2,r2));
        }
    }
}

/*
public class Problem1002 {
    
    static StringTokenizer st;
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken());
            int y1 = Integer.parseInt(st.nextToken());
            int r1 = Integer.parseInt(st.nextToken());
            int x2 = Integer.parseInt(st.nextToken());
            int y2 = Integer.parseInt(st.nextToken());
            int r2 = Integer.parseInt(st.nextToken());

            int r = (int)(Math.pow(x2-x1, 2) + Math.pow(y2-y2, 2));

            if (x1==x2 && y1==y2 && r1==r2){
                System.out.println("-1");   // 두원이 같을때
            } else if (r == Math.pow(r2+r1, 2)) {
                System.out.println("1");    // 외접 접점 
            } else if (r == Math.pow(r2-r1, 2)) {
                System.out.println("1");    // 내접 접점
            } else if (r > Math.pow(r2+r1, 2)) {
                System.out.println("0");    // 두원이 떨어짐
            } else if (r < Math.pow(r2-r1, 2)) {
                System.out.println("0");    // 원 내부에 원
            } else {
                System.out.println("2");    // 접점이 두개
            }
        }
    }
}
*/