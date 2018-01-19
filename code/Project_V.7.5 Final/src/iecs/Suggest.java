package iecs;

import java.io.*;
import java.util.Random;
import java.util.Scanner;

public class Suggest {
  private int num;
  private int count;
  private boolean check;
  private int reply = 0;
  private Scanner scan;
  private String[] suggestFri;

  public void showWho() {
    System.out.println("--建議好友");
    printSuggest();
    System.out.println("---------------------------");
    System.out.println("--返回 (0)");
    do {
      scan = new Scanner(System.in);
      num = scan.nextInt();
      if (num < 0 || num > count) {
        System.out.println("輸入錯誤，請重新輸入!");
      }
    } while (num < 0 || num > count);
    reply(num);
  }

  public void reply(int num) {
    if (num == 0) {

    } else {
      System.out.println("--是否加入好友? ( YES/NO/NotNow )");
      String temp = scan.next();
      confirm(temp);
      if (reply == 1) {
        System.out.println("--已送出好友邀請!");
        System.out.println("---------------------------");
        delete(num);
        showWho();
      } else if (reply == 2) {
        System.out.println("--已刪除好友建議!");
        System.out.println("---------------------------");
        delete(num);
        showWho();
      } else {
        showWho();
      }
    }
  }

  public void delete(int num) {
    num--;

    suggestFri[num] = suggestFri[num + 1];
    suggestFri[num + 1] = suggestFri[num + 2];
    suggestFri[num + 2] = suggestFri[num + 3];
    suggestFri[num + 3] = suggestFri[num + 4];
    suggestFri[num + 4] = suggestFri[num + 5];
    count--;
  }

  public boolean confirm(String temp) {
    check = false;
    while (!check) {
      if (temp.equals("YES") || temp.equals("NO") || temp.equals("NotNow")) {
        check = true;
        if (temp.equals("YES")) {
          reply = 1;
        } else if (temp.equals("NO")) {
          reply = 2;
        } else {
          reply = 3;
        }
      } else {
        System.out.println("--輸入錯誤，請重新輸入!");
        System.out.println("---------------------------");
        temp = scan.next();
        check = false;
      }
    }
    if (temp.equals("YES")) {
      return true;
    } else {
      return false;
    }
  }

  public void readToString() {
    File file = new File("D:/JAVA/Project/suggest.txt");
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

    suggestFri = new String(filecontent).split("\r\n");
    count = randomSug();

  }

  public void printSuggest() {
    for (int i = 0; i < count; i++) {
      System.out.println((i + 1) + ": " + suggestFri[i]);
    }
  }

  public int randomSug() {
    Random rand = new Random();
    int ranNum = rand.nextInt(6) + 1;
    return ranNum;
  }
}
