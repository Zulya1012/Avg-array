import java.util.Scanner;
public class addarray3 {
  public static void main(String[] arg) {
    int[] b = new int[5];
    Scanner s = new Scanner(System.in);
    for (int i = 0; i < b.length; i++) {
      System.out.println("Enter " + (i + 1));
      b[i] = s.nextInt();
    }
    double avg = 0;
    for (int i = 0; i < b.length; i++) {
      avg = avg + b[i];
    }
    avg = avg / b.length;
    System.out.println("average:" + avg);
  }
}
