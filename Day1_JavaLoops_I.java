import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Day1_JavaLoops_I {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());
        for(int i = 1; i <= 10; i++){
            int result = N * i;
            System.out.println(N+" x "+i+" = "+result);
            
            //untuk mencetak juga bisa menggunakan formatting
            //System.out.printf("%d x %d = %d%n", N,i,result);
            
            //juga bisa menggunakan while
            // int i = 1;
            // while(i <= 10){
            //     int result = N * i;
            //     System.out.printf("%d x %d = %d%n", N,i,result);
            //     i++;
            // }

        }
        
        bufferedReader.close();
    }
}


