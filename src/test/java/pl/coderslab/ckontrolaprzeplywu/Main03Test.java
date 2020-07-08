package pl.coderslab.ckontrolaprzeplywu;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.coderslab.bzmienneioperatory.Main04;

import static org.junit.Assert.assertEquals;

public class Main03Test {

    private static final String EXPECTED_OUTPUT = "Java" + System.lineSeparator() +
            "Java" + System.lineSeparator() +
            "Java" + System.lineSeparator() +
            "Java" + System.lineSeparator() +
            "Java" + System.lineSeparator() +
            "Java";

    private String output;

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Before
    public void setUp() {
        Main03.main(null);
        output = systemOutRule.getLog();
    }

    @Test
    public void whenRun_thenSystemOut_LikeJava6Times() {
        assertEquals(EXPECTED_OUTPUT, output.trim());
    }
}
