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
        System.out.println("--�O�_�~��ϥ�? ( YES / NO ).");
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
          System.out.println("��J���~�A�Э��s��J!");
          check = false;
        }
      }
    }
  }
}
