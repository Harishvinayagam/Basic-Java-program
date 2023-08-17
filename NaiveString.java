import java.util.*;
public class NaiveString{
  public static void search(String txt, String pat) {
    int M = pat.length();
    int N = txt.length();
    for (int i = 0; i <= N - M; i++) {
      int j;
      for (j = 0; j < M; j++)
        if (txt.charAt(i + j) != pat.charAt(j))
          break;
      if (j == M)
        System.out.println("Pattern found at index " + i);
    }
  }
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the text:");
    String txt = sc.nextLine();
    System.out.println("Enter the pattern:");
    String pat= sc.nextLine();
    long start = System.nanoTime();
    search(txt, pat);
    long end = System.nanoTime();
long exe = (end-start);
	double secs = exe/1_000_000;
	System.out.println("Execution Time in Secs:"+secs);
  }
}
