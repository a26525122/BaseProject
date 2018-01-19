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

  /*
   * public String getId() { return id; }
   * 
   * public String getPassword() { return password; }
   */

  public void check() {
    String ScanId = "";
    String ScanPassword = "";
    boolean login;
    do {
      login = false;
      System.out.println("--請輸入帳號密碼");
      System.out.println("--帳號:");
      scan = new Scanner(System.in);
      ScanId = scan.nextLine();
      System.out.println("--密碼:");
      ScanPassword = scan.nextLine();
      if (ScanId.equals(id) && ScanPassword.equals(password)) {
        System.out.println("--歡迎登入!");
        login = true;
      } else {
        System.out.println("--帳號密碼輸入錯誤，請重新輸入!");
      }
    } while (login == false);
  }
}
