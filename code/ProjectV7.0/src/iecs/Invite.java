package iecs;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Invite {
  private int num;
  public static int frined = 0;

  private boolean check;
  private int reply = 0;
  private Scanner scan;
  public int maxInv = 2;
  
  public void invitedlist() throws IOException {
    FileReader f = new FileReader("invitedlist.txt");
    BufferedReader br = new BufferedReader(f);
    String str;
    while ((str = br.readLine()) != null) {
      System.out.println(str);
    }
    br.close();
  }

  public void writeone() throws IOException {
    FileWriter fw = new FileWriter("invitedlist.txt");
    fw.write("1.�G�y��");
    fw.close();
  }

  public void writetwo() throws IOException {
    FileWriter fw = new FileWriter("invitedlist.txt");
    fw.write("1.�G����");
    fw.close();
  }

  public void writenothing() throws IOException {
    FileWriter fw = new FileWriter("invitedlist.txt");
    fw.write("---�L�n���ܽ�");
    fw.close();
  }

  public void showWho() throws IOException {
    System.out.println("--�n�ͥӽ�");
    invitedlist();
    // �L�X�Ҧ��e�X�ܽЪ��H
    System.out.println("---------------------------");
    System.out.println("--��^ ( 0 )");
    scan = new Scanner(System.in);
    num = scan.nextInt();
    reply(num);
  }

  public void reply(int num) throws IOException {
    while (num < 0 || num > maxInv) {
      System.out.println("��J���~�A�Э��s��J!");
      num = scan.nextInt();
    }

    if (App.invitecheck == 0) {
      if (num == 0) {

      } else if (num == 1) {
        System.out.println("--�O�_�[�J�n��? ( YES/NO/NotNow )");
        String temp = scan.next();
        confirm(temp);
        if (reply == 1) {
          System.out.println("--�w�[�J�n��!");
          System.out.println("---------------------------");
          writeone();
          App.invitecheck = 1;
          frined = 1;
          maxInv--;
          showWho();
        } else if (reply == 2) {
          System.out.println("--�w�R���n�ͥӽ�!");
          System.out.println("---------------------------");
          writeone();
          App.invitecheck = 1;
          maxInv--;
          showWho();
        } else {
          showWho();
        }
      } else if (num == 2) {
        System.out.println("--�O�_�[�J�n��? ( YES/NO/NotNow )");
        String temp = scan.next();
        confirm(temp);
        if (reply == 1) {
          System.out.println("--�w�[�J�n��!");
          System.out.println("---------------------------");
          writetwo();
          App.invitecheck = 1;
          frined = 2;
          maxInv--;
          showWho();
        } else if (reply == 2) {
          System.out.println("--�w�R���n�ͥӽ�!");
          System.out.println("---------------------------");
          writetwo();
          App.invitecheck = 1;
          maxInv--;
          showWho();
        } else {
          showWho();
        }
      }
    } else if (App.invitecheck == 1) {
      if (num == 0) {

      } else if (num == 1) {
        System.out.println("--�O�_�[�J�n��? ( YES/NO/NotNow )");
        String temp = scan.next();
        confirm(temp);
        if (reply == 1) {
          System.out.println("--�w�[�J�n��!");
          System.out.println("---------------------------");
          writenothing();
          maxInv--;
          frined = 3;
          showWho();
        } else if (reply == 2) {
          System.out.println("--�w�R���n�ͥӽ�!");
          System.out.println("---------------------------");
          writenothing();
          maxInv--;
          showWho();
        } else {
          showWho();
        }
      } else if (num == 2) {
        System.out.println("--�O�_�[�J�n��? ( YES/NO/NotNow )");
        String temp = scan.next();
        confirm(temp);
        if (reply == 1) {
          System.out.println("--�w�[�J�n��!");
          System.out.println("---------------------------");
          writetwo();
          maxInv--;
          frined = 1;
          showWho();
        } else if (reply == 2) {
          System.out.println("--�w�R���n�ͥӽ�!");
          System.out.println("---------------------------");
          writetwo();
          maxInv--;
          showWho();
        } else {
          showWho();
        }
      }
    }
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
        System.out.println("--��J���~�A�Э��s��J!");
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
}
