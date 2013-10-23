package sk.upjs.ics.paz1c.citaty;

import sk.upjs.ics.paz1c.citaty.Citat;
import java.util.Date;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class SuborovyCitatDaoTest {
    private CitatDao citatDao;
    
    @Before
    public void setUp() {
        citatDao = new SuborovyCitatDao();
    }
            
    @Test
    public void testVratVsetkych() {
        List<Citat> citaty = citatDao.vratVsetky();
        assertEquals(3, citaty.size());
        
    }
            
}