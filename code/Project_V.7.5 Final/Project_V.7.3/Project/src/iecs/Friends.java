package iecs;

import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Friends {

  private int num;
  private Scanner scan;

  public void friendlist() throws IOException {
    FileReader f = new FileReader("friendlist.txt");
    BufferedReader br = new BufferedReader(f);
    String str;
    while ((str = br.readLine()) != null) {
      System.out.println(str);
    }
    br.close();
  }

  public void qrCodefriend() throws IOException {
    // TODO Auto-generated method stub
    FileReader f = new FileReader("friendlist2.txt");
    BufferedReader br = new BufferedReader(f);
    String str;
    while ((str = br.readLine()) != null) {
      System.out.println(str);
    }
    br.close();
  }

  public void invitedfriend1() throws IOException {
    // TODO Auto-generated method stub
    FileReader f = new FileReader("invitedfriend1.txt");
    BufferedReader br = new BufferedReader(f);
    String str;
    while ((str = br.readLine()) != null) {
      System.out.println(str);
    }
    br.close();
  }

  public void invitedfriend2() throws IOException {
    // TODO Auto-generated method stub
    FileReader f = new FileReader("invitedfriend2.txt");
    BufferedReader br = new BufferedReader(f);
    String str;
    while ((str = br.readLine()) != null) {
      System.out.println(str);
    }
    br.close();
  }

  public void invitedfriend3() throws IOException {
    // TODO Auto-generated method stub
    FileReader f = new FileReader("invitedfriend3.txt");
    BufferedReader br = new BufferedReader(f);
    String str;
    while ((str = br.readLine()) != null) {
      System.out.println(str);
    }
    br.close();
  }

  public void list() throws IOException {
    System.out.println("---------------------------");
    System.out.println("--好友名單:");
    if (Invite.frined == 1) {
      invitedfriend1();
    } else if (Invite.frined == 2) {
      invitedfriend2();
    } else if (Invite.frined == 3) {
      invitedfriend3();
    } else if (QrCode.friendQR == 1){
      qrCodefriend();
    } else {
      friendlist();
    }
    System.out.println("---------------------------");
    System.out.println("--請輸入想要查看的好友資訊，返回 ( 0 ) :");
    scan = new Scanner(System.in);
    num = scan.nextInt();
    show(num);
  }

  public void show(int num) throws IOException {
    if (Invite.frined == 1) {
      if (num < 0 || num > 4) {
        System.out.println("--輸入錯誤，請重新輸入!");
        list();
      } else if (num == 1) {
        FriendsInf friendsInf = new FriendsInf();
        friendsInf.friendone();
        list();
      } else if (num == 2) {
        FriendsInf friendsInf = new FriendsInf();
        friendsInf.friendtwo();
        list();
      } else if (num == 3) {
        FriendsInf friendsInf = new FriendsInf();
        friendsInf.friendQR();
        list();
      } else if (num == 4) {
        FriendsInf friendsInf = new FriendsInf();
        friendsInf.friendthree();
        list();
      }
    } else if (Invite.frined == 2) {
      if (num < 0 || num > 4) {
        System.out.println("--輸入錯誤，請重新輸入!");
        list();
      } else if (num == 1) {
        FriendsInf friendsInf = new FriendsInf();
        friendsInf.friendone();
        list();
      } else if (num == 2) {
        FriendsInf friendsInf = new FriendsInf();
        friendsInf.friendtwo();
        list();
      } else if (num == 3) {
        FriendsInf friendsInf = new FriendsInf();
        friendsInf.friendQR();
        list();
      } else if (num == 4) {
        FriendsInf friendsInf = new FriendsInf();
        friendsInf.friendfour();
        list();
      }
    } else if (Invite.frined == 3) {
      if (num < 0 || num > 5) {
        System.out.println("--輸入錯誤，請重新輸入!");
        list();
      } else if (num == 1) {
        FriendsInf friendsInf = new FriendsInf();
        friendsInf.friendone();
        list();
      } else if (num == 2) {
        FriendsInf friendsInf = new FriendsInf();
        friendsInf.friendfour();
        list();
      } else if (num == 3) {
        FriendsInf friendsInf = new FriendsInf();
        friendsInf.friendQR();
        list();
      } else if (num == 4) {
        FriendsInf friendsInf = new FriendsInf();
        friendsInf.friendthree();
        list();
      } else if (num == 5) {
        FriendsInf friendsInf = new FriendsInf();
        friendsInf.friendfour();
        list();
      }
    } else if (QrCode.friendQR == 1) {
      if (num < 0 || num > 3) {
        System.out.println("--輸入錯誤，請重新輸入!");
        list();
      } else if (num == 1) {
        FriendsInf friendsInf = new FriendsInf();
        friendsInf.friendone();
        list();
      } else if (num == 2) {
        FriendsInf friendsInf = new FriendsInf();
        friendsInf.friendtwo();
        list();
      } else if (num == 3) {
        FriendsInf friendsInf = new FriendsInf();
        friendsInf.friendQR();
        list();
      }
    } else {
      if (num < 0 || num > 2) {
        System.out.println("--輸入錯誤，請重新輸入!");
        list();
      } else if (num == 1) {
        FriendsInf friendsInf = new FriendsInf();
        friendsInf.friendone();
        list();
      } else if (num == 2) {
        FriendsInf friendsInf = new FriendsInf();
        friendsInf.friendtwo();
        list();
      }
    }
  }
}
