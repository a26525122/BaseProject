package github;

import java.io.*;

public class Information {
  public void show() throws IOException {
    FileReader f = new FileReader("me.txt");
    BufferedReader br = new BufferedReader(f);
    String str;
    while ((str = br.readLine()) != null) {
      System.out.println(str);
    }
    br.close();
  }
  
  public String getImformation(String str) {
    return str;
  }
  
  public void back() {
    System.out.println("---------------------------");
    System.out.println("--��^ ( 0 ):");
  }
  
  public void stop(int num) {
      if (num == 0) {

      } else {
        System.out.println("--��J���~�A�Э��s��J!");
        back();
      }
  }
}
