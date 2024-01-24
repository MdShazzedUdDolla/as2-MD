//import static java.lang.System.*;
import java.util.Scanner;
public class p01FleaCircus {
  public static void main(String[] args) {
    Scanner po = new Scanner(System.in);
    System.out.println("Position of the first flea:");
    int x1 = po.nextInt();
    System.out.println("Move rate of the first flea:");
    int v1 = po.nextInt();
    System.out.println("Position of the second flea:");
    int x2 = po.nextInt();
    System.out.println("Move rate of the second flea:");
    int v2 = po.nextInt();
    if(v1==v2) {
      if(x1==x2)
        System.out.println("YES");
      else
        System.out.println("NO");
    }
    else {
      int steps = (x2-x1)/(v1-v2);
      if(steps<=0)
        System.out.println("NO");
      else {
      //if((x1+steps*v1)==(x2+steps*v2))
        System.out.println("YES");
      //else
        //out.println("NO");
      }
    }
  }
}