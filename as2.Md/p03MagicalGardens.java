//import static java.lang.System.*;
import java.util.Scanner;
public class p03MagicalGardens {
  public static void main(String[] args) {
    Scanner po = new Scanner(System.in);
    System.out.println("What is the width of the garden:");
    int width = po.nextInt();
    System.out.println("X coordinate of the tree:");
    int x = po.nextInt();
    System.out.println("Y coordinate of the tree:");
    int y = po.nextInt();
    int[][] mars = new int[y+1][width];
    int height = 0;
    for(int row=0; row<y+1; row++) {
      for(int column=0; column<width; column++) {
        height++;
        mars[row][column] = height;
        if(row==y && column==x)
          break;
      }
    }
    System.out.println(mars[y][x]);
  }
}