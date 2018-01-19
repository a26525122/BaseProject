package github;
import java.io.IOException;
import java.util.Scanner;

public class Main {

  private static Scanner scan;

  public static void main(String[] args) throws IOException {
    boolean cont = true;
    App app = new App();
    while (cont) {
      app.Login();
      boolean check = false;
      while (!check) {
        System.out.println("--是否繼續使用? ( YES / NO ).");
        scan = new Scanner(System.in);
        String temp = scan.next();
        if (temp.equals("YES") || temp.equals("NO")) {
          if (temp.equals("YES")) {
            cont = true;
          } else {
            cont = false;
          }
          check = true;
        } else {
          System.out.println("輸入錯誤，請重新輸入!");
          check = false;
        }
      }
    }
  }
}
