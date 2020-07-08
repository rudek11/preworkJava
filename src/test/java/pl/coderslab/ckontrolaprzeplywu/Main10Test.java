package pl.coderslab.ckontrolaprzeplywu;

import com.google.common.base.CharMatcher;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class Main10Test {

    private static final Logger log = LoggerFactory.getLogger(Main10Test.class);
    private static final String EXPECTED_OUTPUT = "*2345" + System.lineSeparator() +
            "**345" + System.lineSeparator() +
            "***45" + System.lineSeparator() +
            "****5" + System.lineSeparator() +
            "*****" + System.lineSeparator() +
            "*****" + System.lineSeparator() +
            "****5" + System.lineSeparator() +
            "***45" + System.lineSeparator() +
            "**345" + System.lineSeparator() +
            "*2345";

    private String output;

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Before
    public void setUp() {
        Main10.main(null);
        output = systemOutRule.getLog();
    }

    @Test
    public void whenRun_thenSystemOut_Stars() {
         assertThat(CharMatcher.whitespace().removeFrom(output.trim()).contains(EXPECTED_OUTPUT));
    }
}
