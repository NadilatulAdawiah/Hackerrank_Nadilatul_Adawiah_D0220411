import java.util.*;
import java.security.*;

public class Day1_JavaInt_ToString {

    public static void main(String[] args) {

        DoNotTerminate.forbidExit();
      
        try {
         Scanner in = new Scanner(System.in);
         int n = in .nextInt();
         in.close();
         //String s=???; Complete this line below
      
         //Write your code here
         //cara 1
         //String s = ""+n;
         
         //cara 2
         //String s = String.valueOf (n);
         
         //cara ke 3
         //String s = Integer.toString(n);
         
         //cara ke 4
         //String s = String.format("%d", n);
         
         //cara ke 5
         Integer i = new Integer(n);
         StringBuilder sb = new StringBuilder();
         sb.append(i);
         String s = sb.toString();
      
         
         if (n == Integer.parseInt(s)) {
          System.out.println("Good job");
         } else {
          System.out.println("Wrong answer.");
         }
        } catch (DoNotTerminate.ExitTrappedException e) {
         System.out.println("Unsuccessful Termination!!");
        }
       }
      }
      
      //The following class will prevent you from terminating the code using exit(0)!
      class DoNotTerminate {
      
       public static class ExitTrappedException extends SecurityException {
      
        private static final long serialVersionUID = 1;
       }
      
       public static void forbidExit() {
        final SecurityManager securityManager = new SecurityManager() {
         @Override
         public void checkPermission(Permission permission) {
          if (permission.getName().contains("exitVM")) {
           throw new ExitTrappedException();
          }
         }
        };
        System.setSecurityManager(securityManager);
      
    
    }

}
