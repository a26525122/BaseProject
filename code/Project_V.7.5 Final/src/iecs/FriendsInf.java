package iecs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FriendsInf {

  private Scanner scan;
  private int num = 0;

  public void friendone() throws IOException {
    FileReader f = new FileReader("friend1.txt");
    BufferedReader br = new BufferedReader(f);
    String str;
    while ((str = br.readLine()) != null) {
      System.out.println(str);
    }
   InfQrcode infqrcode = new InfQrcode();
   infqrcode.LoadFile();
   infqrcode.SetTable();
    do {
      back();
      scan = new Scanner(System.in);
      num = scan.nextInt();
      stop(num);
    } while (num != 0);
    br.close();
  }

  public void friendtwo() throws IOException {
    FileReader f2 = new FileReader("friend2.txt");
    BufferedReader br2 = new BufferedReader(f2);
    String str2;
    while ((str2 = br2.readLine()) != null) {
      System.out.println(str2);
    }
    InfQrcode infqrcode = new InfQrcode();
    infqrcode.LoadFile();
    infqrcode.SetTable();
    do {
      back();
      scan = new Scanner(System.in);
      num = scan.nextInt();
      stop(num);
    } while (num != 0);
    br2.close();
  }

  public void friendthree() throws IOException {
    FileReader f2 = new FileReader("friend3.txt");
    BufferedReader br2 = new BufferedReader(f2);
    String str2;
    while ((str2 = br2.readLine()) != null) {
      System.out.println(str2);
    }
    InfQrcode infqrcode = new InfQrcode();
    infqrcode.LoadFile();
    infqrcode.SetTable();
    do {
      back();
      scan = new Scanner(System.in);
      num = scan.nextInt();
      stop(num);
    } while (num != 0);
    br2.close();
  }

  public void friendfour() throws IOException {
    FileReader f2 = new FileReader("friend4.txt");
    BufferedReader br2 = new BufferedReader(f2);
    String str2;
    while ((str2 = br2.readLine()) != null) {
      System.out.println(str2);
    }
    InfQrcode infqrcode = new InfQrcode();
    infqrcode.LoadFile();
    infqrcode.SetTable();
    do {
      back();
      scan = new Scanner(System.in);
      num = scan.nextInt();
      stop(num);
    } while (num != 0);
    br2.close();
  }
  
  public void friendQR() throws IOException {
    FileReader f2 = new FileReader("friendQR.txt");
    BufferedReader br2 = new BufferedReader(f2);
    String str2;
    while ((str2 = br2.readLine()) != null) {
      System.out.println(str2);
    }
    InfQrcode infqrcode = new InfQrcode();
    infqrcode.LoadFile();
    infqrcode.SetTable();
    do {
      back();
      scan = new Scanner(System.in);
      num = scan.nextInt();
      stop(num);
    } while (num != 0);
    br2.close();
  }

  public void friendfourmember3() throws IOException {
    FileReader f2 = new FileReader("friend3.txt");
    BufferedReader br2 = new BufferedReader(f2);
    String str2;
    while ((str2 = br2.readLine()) != null) {
      System.out.println(str2);
    }
    do {
      back();
      scan = new Scanner(System.in);
      num = scan.nextInt();
      stop(num);
    } while (num != 0);
    br2.close();
  }

  public void friendfourmember4() throws IOException {
    FileReader f2 = new FileReader("friend4.txt");
    BufferedReader br2 = new BufferedReader(f2);
    String str2;
    while ((str2 = br2.readLine()) != null) {
      System.out.println(str2);
    }
    do {
      back();
      scan = new Scanner(System.in);
      num = scan.nextInt();
      stop(num);
    } while (num != 0);
    br2.close();
  }

  public void back() {
    System.out.println("---------------------------");
    System.out.println("--返回 ( 0 ):");
  }

  public void stop(int num) {
    if (num == 0) {

    } else {
      System.out.println("--輸入錯誤，請重新輸入!");
    }
  }
}
