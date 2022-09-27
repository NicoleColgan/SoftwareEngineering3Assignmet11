import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class JUnitRunner {

    public static void main(String[] args){

        //run every test case in class
        //result is either pass or fail
        Result result = JUnitCore.runClasses(JUnitTest.class);

        //print this message if it fails
        for(Failure failure: result.getFailures()){
            System.out.println(failure.toString());
        }

        //print out whether the test passed (true) or failed (false)
        System.out.println(result.wasSuccessful());

    }
}
