//import static java.lang.System.*;
import java.util.Scanner;
public class p02SpaceExploration {
  public static void main(String[] args) {
    Scanner po = new Scanner(System.in);
    System.out.println("Original Message:");
    String saturn = po.nextLine();
    System.out.println("Received Message:");
    String venus = po.nextLine();
    int change = 0;
    for(int m=0; m<saturn.length(); m++) {
      if(saturn.codePointAt(m) != venus.codePointAt(m))
        change++;
    }
    System.out.println("Numbers of letters changed: "+change);
  }
}