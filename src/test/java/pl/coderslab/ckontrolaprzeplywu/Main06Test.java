package pl.coderslab.ckontrolaprzeplywu;

import com.google.common.base.CharMatcher;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import pl.coderslab.bzmienneioperatory.Main05;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

public class Main06Test {

    private static final String EXPECTED_OUTPUT = "0 - parzysta" + System.lineSeparator() +
            "1 - nieparzysta" + System.lineSeparator() +
            "2 - parzysta" + System.lineSeparator() +
            "3 - nieparzysta" + System.lineSeparator() +
            "4 - parzysta" + System.lineSeparator() +
            "5 - nieparzysta" + System.lineSeparator() +
            "6 - parzysta" + System.lineSeparator() +
            "0 - parzysta" + System.lineSeparator() +
            "1 - nieparzysta" + System.lineSeparator() +
            "2 - parzysta" + System.lineSeparator() +
            "3 - nieparzysta" + System.lineSeparator() +
            "4 - parzysta" + System.lineSeparator() +
            "5 - nieparzysta" + System.lineSeparator() +
            "6 - parzysta";

    private String output;

    @Rule
    public final SystemOutRule systemOutRule = new SystemOutRule().enableLog();

    @Before
    public void setUp() {
        Main06.main(null);
        output = systemOutRule.getLog();
    }

    @Test
    public void whenRun_thenSystemOut_OddEvenMessage() {
       assertThat(CharMatcher.whitespace().removeFrom(output.trim()).contains(EXPECTED_OUTPUT));
    }
}
