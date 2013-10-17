package sk.upjs.ics.paz1c.citaty;

import java.util.List;
import java.util.Random;

public class DefaultGeneratorCitatov implements GeneratorCitatov {
    private CitatDao citatyDao = CitatDaoFactory.INSTANCE.getCitatDao();
    
    @Override
    public Citat vygenerujCitat() {
        List<Citat> vsetkyCitaty = citatyDao.vratVsetky();
        
        Random random = new Random();
        int nahodnyIndex 
                = random.nextInt(vsetkyCitaty.size());
        return vsetkyCitaty.get(nahodnyIndex);
    }
}
