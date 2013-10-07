package sk.upjs.ics.paz1c.citaty;

import sk.upjs.ics.paz1c.citaty.Citat;
import java.util.Date;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

public class CitatyDaoTest {
    private int ukazkoveId = 3;
    
    private String ukazkovyAutor = "J. D. Salinger";
    
    private CitatDao citatyDao;
    
    private Citat citat1;
    
    @Before
    public void setUp() {
        citatyDao = new PamatovyCitatDao();
        
        citat1 = new Citat();
        citat1.setId(ukazkoveId);
        citat1.setAutor(ukazkovyAutor);
        citat1.setText("Kto chyta v zite?");
        citat1.setZdroj("Kto chyta v zite");
        citat1.setDatum(new Date());
        
        citatyDao.pridaj(citat1);        
    }
    
    @Test
    public void testNajdiPodlaId() {
        //-------------------
        
        Citat citat = citatyDao.najdiPodlaId(ukazkoveId);
        assertEquals(citat1, citat);
        
    }
    
    @Test
    public void testNajdiPodlaAutora() {
        List<Citat> citaty = citatyDao.najdiPodlaAutora(ukazkovyAutor);
        assertTrue(!citaty.isEmpty());
        for(Citat citat : citaty) {
            if(!citat.getAutor().equals(ukazkovyAutor)) {
                fail("Nasiel sa nespravny autor " + citat.getAutor());
            }
        }
    }
            
            
            
}