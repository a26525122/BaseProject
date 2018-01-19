package iecs;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class PassWord {
  private String[] passwordTxt;
  private String id;
  private String password;
  private Scanner scan;
  private boolean login;

  public void readToString() {
    File file = new File("D:/JAVA/Project/password.txt");
    Long filelength = file.length();
    byte[] filecontent = new byte[filelength.intValue()];
    try {
      FileInputStream in = new FileInputStream(file);
      in.read(filecontent);
      in.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }
    passwordTxt = new String(filecontent).split("\r\n");
    id = passwordTxt[0];
    password = passwordTxt[1];
  }

  public void checkin() {

    String ScanId = "";
    String ScanPassword = "";

    do {
      login = false;
      System.out.println("--�п�J�b���K�X");
      System.out.println("--�b��:");
      scan = new Scanner(System.in);
      ScanId = scan.nextLine();
      System.out.println("--�K�X:");
      scan = new Scanner(System.in);
      ScanPassword = scan.nextLine();
      check(ScanId, ScanPassword);
    } while (login == false);
  }

  public void check(String ScanId, String ScanPassword) {
    if (ScanId.equals(id) && ScanPassword.equals(password)) {
      System.out.println("--�w��n�J!");
      login = true;
    } else {
      System.out.println("--�b���K�X��J���~�A�Э��s��J!");
    }

  }
}
