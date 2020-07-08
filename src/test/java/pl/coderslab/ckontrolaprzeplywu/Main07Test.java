package pl.coderslab.ckontrolaprzeplywu;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.contrib.java.lang.system.SystemOutRule;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


import static org.assertj.core.api.AssertionsForClassTypes.assertThat;
import static org.junit.Assert.assertEquals;

public class Main07Test {

    private static final String EXPECTED_OUTPUT ="i=0j=0" +
            "i=0j=1" +
            "i=0j=2" +
            "i=1j=0" +
            "i=1j=1" +
            "i=1j=2" +
            "i=2j=0" +
            "i=2j=1" +
            "i=2j=2";

    private String output;

    @Rule
    public final SystemOutRule systemOutRule =new SystemOutRule().enableLog();

    @Before
    public void setUp() {
        Main07.main(null);
        output =systemOutRule.getLog();
    }

    @Test
    public void whenRun_thenSystemOut_IandJ() {
        assertThat(output.replaceAll("\\s+","")).contains(EXPECTED_OUTPUT);

    }
}