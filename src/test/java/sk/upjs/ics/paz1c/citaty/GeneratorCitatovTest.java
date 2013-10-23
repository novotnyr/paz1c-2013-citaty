package sk.upjs.ics.paz1c.citaty;

import org.junit.Test;
import static org.junit.Assert.*;

public class GeneratorCitatovTest {

    @Test
    public void testVygenerujCitat() {
        DefaultGeneratorCitatov generatorCitatov = new DefaultGeneratorCitatov();
        Citat citat = generatorCitatov.vygenerujCitat();
        System.out.println(citat);
        assertNotNull(citat);
    }
}