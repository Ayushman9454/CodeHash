import java.io.*;

class input{
        public static void main(String args[])throws IOException{
                InputStreamReader read = new InputStreamReader(System.in);
                BufferedReader in = new BufferedReader(read);
                
                int num = Integer.parseInt(in.readLine());
                System.out.println(num);
                
                String s = in.readLine();
                System.out.println(s);
                
                float num2 = Float.parseFloat(in.readLine());
                System.out.println(num2);
        }
}
