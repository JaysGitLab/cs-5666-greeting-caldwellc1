import static org.junit.Assert.assertEquals;
import org.junit.Test;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.junit.Before;
import org.junit.After;

public class HelloTest { 
      private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
      private final ByteArrayOutputStream errContent = new ByteArrayOutputStream();

      @Before
      public void setUpStreams() {
          System.setOut(new PrintStream(outContent));
          System.setErr(new PrintStream(errContent));
      }

      @After
      public void cleanUpStreams() {
          System.setOut(null);
          System.setErr(null);
      }

      @Test
      public void out() {
	  System.out.print("Hello, Cydney");
	  assertEquals("Hello, Cydney", outContent.toString());
      }
      @Test
      public void err() {
          System.err.print("hello again");
          assertEquals("hello again", errContent.toString());
      }

}
