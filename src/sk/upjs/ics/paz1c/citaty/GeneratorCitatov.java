package sk.upjs.ics.paz1c.citaty;

import java.util.List;
import java.util.Random;

public class GeneratorCitatov {
    private CitatyDao citatyDao = new CitatyDao();
    
    public Citat vygenerujCitat() {
        List<Citat> vsetkyCitaty = citatyDao.vratVsetky();
        
        Random random = new Random();
        int nahodnyIndex 
                = random.nextInt(vsetkyCitaty.size());
        return vsetkyCitaty.get(nahodnyIndex);
    }
}
