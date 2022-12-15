package calidadPractica3;

import org.junit.runner.JUnitCore; 
import org.junit.runner.Result; 
import org.junit.runner.notification.Failure; 
 
public class TestRunnerFalse { 
 public static void main(String[] args) { 
       Result result = JUnitCore.runClasses(TestAssertFalse.class); 
       for (Failure failure : result.getFailures()) { 
    	  System.out.println("For bucle");
          System.out.println(failure.toString()); 
       } 
       System.out.println("Salida For bucle");
       System.out.println(result.wasSuccessful()); 
    }
}