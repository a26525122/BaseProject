package iecs;

import java.util.Scanner;

public class App {
  Scanner scan = new Scanner(System.in);
  
  public void Login() {
    //�}�b���K�X���ɮ�
    System.out.println("--�п�J�b���K�X");
    System.out.println("�b��:");
 //   String account = scan.next();
    System.out.println("�K�X:");
 //   String password = "";
 //   password = scan.nextLine();
    //�o��nŪ�ɮ׽T�{�K�X�O�_���T!
    
    
    WhatToDo();
  }
  
  public void WhatToDo() {
    int num = 0;
    while (num != 5) {
      System.out.println("--�п�ܥ\��");
      System.out.println("1.�˵��ӤH��T");
      System.out.println("2.�n�ͦW��");
      System.out.println("3.�[�J�n��");
      System.out.println("4.��ĳ�n��");
      System.out.println("5.�n�X");
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
        System.out.println("�w�n�X!");        
        break;
      default:
        System.out.println("��ܿ��~�A�Э��s��J!");
        System.out.println("---------------------------");
        break;
      }

    }
  }
}
