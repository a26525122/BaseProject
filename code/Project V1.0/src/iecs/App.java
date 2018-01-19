package iecs;

import java.util.Scanner;

public class App {
  Scanner scan = new Scanner(System.in);
  
  public void Login() {
    //開帳號密碼的檔案
    System.out.println("--請輸入帳號密碼");
    System.out.println("帳號:");
 //   String account = scan.next();
    System.out.println("密碼:");
 //   String password = "";
 //   password = scan.nextLine();
    //這邊要讀檔案確認密碼是否正確!
    
    
    WhatToDo();
  }
  
  public void WhatToDo() {
    int num = 0;
    while (num != 5) {
      System.out.println("--請選擇功能");
      System.out.println("1.檢視個人資訊");
      System.out.println("2.好友名單");
      System.out.println("3.加入好友");
      System.out.println("4.建議好友");
      System.out.println("5.登出");
      num = scan.nextInt();
      switch (num) {
      case 1:
        
        break;
      case 2:
        
        break;
      case 3:

        break;
      case 4:

        break;
      case 5:
        System.out.println("已登出!");        
        break;
      default:
        System.out.println("選擇錯誤，請重新輸入!");
        System.out.println("---------------------------");
        break;
      }

    }
  }
}
