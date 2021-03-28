import java.io.*;

public class Problem1004 {
    static int count;
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int Times = Integer.parseInt(br.readLine());
        
        StringBuilder sb = new StringBuilder();

        for(int i=0; i<Times; i++){
            
            String StartArrive[] = br.readLine().split(" ");
            int x1 = Integer.parseInt(StartArrive[0]);
            int y1 = Integer.parseInt(StartArrive[1]);
            int x2 = Integer.parseInt(StartArrive[2]);
            int y2 = Integer.parseInt(StartArrive[3]);

            int planetNum = Integer.parseInt(br.readLine());
            
            for (int j=0; j<planetNum; j++) {
                String[] planetInfo = br.readLine().split(" ");
                int cx = Integer.parseInt(planetInfo[0]);
                int cy = Integer.parseInt(planetInfo[1]);
                int r = Integer.parseInt(planetInfo[2]);

                if(Math.pow((x1-cx), 2) + Math.pow((y1-cy), 2) <= Math.pow(r, 2)
                    && Math.pow((x2-cx), 2) + Math.pow(y2-cy, 2) > Math.pow(r, 2))
                    count++;
                else if (Math.pow((x1-cx), 2) + Math.pow((y1-cy), 2) > Math.pow(r, 2)
                    && Math.pow((x2-cx), 2) + Math.pow(y2-cy, 2) <= Math.pow(r, 2))
                    count++;
            }
            sb.append(count).append('\n');
            count = 0;
        }
        System.out.println(sb);
    }

}

