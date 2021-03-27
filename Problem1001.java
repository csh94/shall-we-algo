import java.io.*;

public class Problem1001 {
    public static void main(String[] args){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try{
            String[] arr = br.readLine().split(" ");
            System.out.println(Integer.parseInt(arr[0]) - Integer.parseInt(arr[1]));
        } catch(Exception e){
            e.printStackTrace();
        }
    } 
}