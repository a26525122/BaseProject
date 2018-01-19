package github;

import java.io.IOException;
import java.util.Scanner;

public class App {
  Scanner scan = new Scanner(System.in);
  private int num = 0;
  public static int invitecheck = 0;
  
  public void Login() throws IOException {
    PassWord loginApp = new PassWord();
    loginApp.readToString();
    loginApp.checkin();
    list();
    num = scan.nextInt();
    whatToDo(num);
    while (num!=6) {
      list();
      num = scan.nextInt();
      whatToDo(num);
    }
  }
  
  public void list() { 
    System.out.println("---------------------------");
    System.out.println("--請選擇功能");
    System.out.println("1.檢視個人資訊");
    System.out.println("2.好友名單");
    System.out.println("3.加入好友");
    System.out.println("4.建議好友");
    System.out.println("5.好友申請");
    System.out.println("6.登出");
  }
  
  public void whatToDo(int num) throws IOException {
      switch (num) {
      case 1:
        Information information = new Information();
        information.show();
        information.back();
        int num_inf = scan.nextInt();
        information.stop(num_inf);
        while(num_inf != 0) { 
          int num1 = scan.nextInt();
          information.back();
          information.stop(num1);
          if(num1 ==0 )
            break;
        }
        break;
      case 2:
        Friends friends = new Friends();
        friends.list();
        break;
      case 3:
        QrCode qrCode = new QrCode();
        qrCode.LoadFile();
        qrCode.SetTable();
        break;
      case 4:
        Suggest suggest = new Suggest();
        suggest.readToString();
        suggest.showWho();
        break;
      case 5:
        Invite invite = new Invite();
        invite.showWho();
        break;
      case 6:
        System.out.println("已登出!");
        System.out.println("---------------------------");
        break;
      default:
        System.out.println("選擇錯誤，請重新輸入!");
        System.out.println("---------------------------");
        break;
      }
  }
}
