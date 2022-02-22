import java.io.*;
import java.util.*;

public class Day21_Java_List {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<n;i++){
            int ele = scn.nextInt();
            al.add(ele);
        }
        int q = scn.nextInt();
        for(int i=0;i<q;i++){
            String query = scn.next();
            if(query.equals("Insert")){
                int x = scn.nextInt();
                int y = scn.nextInt();
                al.add(x,y);
            }else{
                int x = scn.nextInt();
                al.remove(x);
            }
        }
        Iterator itr = al.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next()+" ");
        }
        scn.close();
    }
}
