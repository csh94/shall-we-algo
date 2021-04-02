import java.io.*;

public class Problem1009 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int times = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<times; i++){
            String[] computerNum = br.readLine().split(" ");
            int a = Integer.parseInt(computerNum[0]);
            int b = Integer.parseInt(computerNum[1]);
            int temp = (int)(Math.pow(a%10, b%4+4) % 10);
            int num = temp!=0 ? temp : 10;
            sb.append(num).append('\n');
        }
        System.out.println(sb);
    }
}
