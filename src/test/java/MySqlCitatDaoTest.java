/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import sk.upjs.ics.paz1c.citaty.Citat;
import sk.upjs.ics.paz1c.citaty.CitatDao;
import sk.upjs.ics.paz1c.citaty.CitatDaoFactory;
import sk.upjs.ics.paz1c.citaty.SqlCitatDao;

/**
 *
 * @author rn
 */
public class MySqlCitatDaoTest {
    private CitatDao citatDao = CitatDaoFactory.INSTANCE.getCitatDao();
    
    @Test
    public void testPridajCitat() {
        Citat citat = new Citat();
        citat.setAutor("E = m . c^2");
        citat.setText("Albert Einstein");
        
        citatDao.pridaj(citat);
        //TODO dokoncit unit test
        
    }
}