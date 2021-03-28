import java.io.*;

public class Problem1003 {
    static int zero;
    static int one;
    static int sum;
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int Times = Integer.parseInt(br.readLine());

        StringBuilder sb = new StringBuilder();

        for (int i=0; i<Times; i++) {
            int Num = Integer.parseInt(br.readLine());
            fibonacci(Num);
            sb.append(zero).append(' ').append(one).append('\n');
        }
        System.out.println(sb);
    }


    public static void fibonacci(int Num) {
        zero = 1;
        one = 0;
        sum = 1;

        for (int i=0; i<Num; i++) {
            zero = one;
            one = sum;
            sum = zero + one;
        }
    }
}
