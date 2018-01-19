package github;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import static org.junit.Assert.*;

import org.junit.Ignore;
import org.junit.Test;

public class Testapp {

  /**
   * test for App.
   * 
   * @throws IOException
   */
  @Test
  public final void testApp() throws IOException { // Prepare to capture output
    PrintStream originalOut = System.out;
    OutputStream os = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(os);
    System.setOut(ps);

    // Perform tests
    String separator = System.getProperty("line.separator");
    App app = new App();
    app.whatToDo(7);
    assertEquals("選擇錯誤，請重新輸入!" + separator + "---------------------------" + separator, os.toString());

    // Restore normal operation
    System.setOut(originalOut);
  }

  /**
   * test for information.
   */
  @Test
  public final void testinformation() { // Prepare to capture output
    PrintStream originalOut = System.out;
    OutputStream os = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(os);
    System.setOut(ps);

    // Perform tests
    String separator = System.getProperty("line.separator");
    Information info = new Information();
    info.stop(1);
    assertEquals("--輸入錯誤，請重新輸入!" + separator + "---------------------------" + separator + "--返回 ( 0 ):" + separator,
        os.toString());

    // Restore normal operation
    System.setOut(originalOut);
  }

  /**
   * test for Friends.
   * 
   * @throws IOException
   */
  @Ignore
  @Test
  public final void testFriends() throws IOException { // Prepare to capture output
    PrintStream originalOut = System.out;
    OutputStream os = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(os);
    System.setOut(ps);

    // Perform tests
    String separator = System.getProperty("line.separator");
    Friends fri = new Friends();
    int num = 6;
    Invite.frined = 1;
    fri.show(num);
    assertEquals("--輸入錯誤，請重新輸入!" +separator +"---------------------------"+separator+"--好友名單:"+separator, os.toString());

    // Restore normal operation
    System.setOut(originalOut);
  }

  /**
   * test for FriendInf
   */
  @Test
  public final void testFriendsInf() { // Prepare to capture output
    PrintStream originalOut = System.out;
    OutputStream os = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(os);
    System.setOut(ps);

    // Perform tests
    String separator = System.getProperty("line.separator");
    FriendsInf friInf = new FriendsInf();
    friInf.stop(1);
    assertEquals("--輸入錯誤，請重新輸入!" + separator, os.toString());

    // Restore normal operation
    System.setOut(originalOut);
  }

  /**
   * Test for invite.
   */
  @Test
  public final void testinvite() { // Prepare to capture output

    Invite inv = new Invite();
    boolean result = true;
    assertEquals(result, inv.confirm("YES"));
    // Restore normal operation
  }

  @Test
  public final void testSuggest() { // Prepare to capture output
    PrintStream originalOut = System.out;
    OutputStream os = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(os);
    System.setOut(ps);

    // Perform tests

    Suggest reply = new Suggest();
    boolean ans = false;

    assertEquals(ans, reply.confirm("NO"));

    // Restore normal operation
    System.setOut(originalOut);
  }
  @Test
  public final void testPassWord() { // Prepare to capture output
    PrintStream originalOut = System.out;
    OutputStream os = new ByteArrayOutputStream();
    PrintStream ps = new PrintStream(os);
    System.setOut(ps);

    // Perform tests
    String separator = System.getProperty("line.separator");
    PassWord password = new PassWord();
    
    password.check("D0542426","19971110");
   
    assertEquals("--帳號密碼輸入錯誤，請重新輸入!" + separator, os.toString());

    // Restore normal operation
    System.setOut(originalOut);
  }
}
