package pl.coderslab.ckontrolaprzeplywu;

import com.google.common.base.CharMatcher;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;

import static org.junit.Assert.assertEquals;

public class Main08Test {

    private static final String EXPECTED_OUTPUT = "*2345" + System.lineSeparator() +
            "**345" + System.lineSeparator() +
            "***45" + System.lineSeparator() +
            "****5" + System.lineSeparator() +
            "*****";

    private String output;

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Before
    public void setUp() {
        Main08.main(null);
        output = systemOutRule.getLog();
    }

    @Test
    public void whenRun_thenSystemOut_StarsAndNumbers() {
        assertEquals(EXPECTED_OUTPUT, CharMatcher.is(' ').removeFrom(EXPECTED_OUTPUT));
    }
}
