import com.intuit.karate.Results;
import com.intuit.karate.Runner;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ApiIT {

    @Test
    public void testParallel(){
        Results results = Runner.path("classpath:.").tags("~@ignore").parallel(5);
        assertEquals(results.getErrorMessages(), 0, results.getFailCount());
    }
}