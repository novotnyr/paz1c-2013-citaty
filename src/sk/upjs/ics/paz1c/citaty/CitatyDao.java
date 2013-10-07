package sk.upjs.ics.paz1c.citaty;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

public class CitatyDao {

    private List<Citat> citaty = new ArrayList<>();

    public CitatyDao() {
        Citat citat1 = new Citat();
        citat1.setId(1);
        citat1.setAutor("J. D. Salinger");
        citat1.setText("Zijem!");
        citat1.setZdroj("Kto chyta v zite");
        citat1.setDatum(new Date());
        
        citaty.add(citat1);

        Citat citat2 = new Citat();
        citat2.setId(2);
        citat2.setAutor("Shakespeare");
        citat2.setText("Byt ci nebyt!");
        citat2.setZdroj("Hamlet");
        citat2.setDatum(new Date());
        
        citaty.add(citat2);
    }
    
    

    public Citat najdiPodlaId(Integer id) {
        for (Citat citat : this.citaty) {
            if (citat.getId().equals(id)) {
                return citat;
            }
        }
        return null;
    }

    public List<Citat> najdiPodlaAutora(String autor) {
        List<Citat> najdeneCitaty = new ArrayList<>();
        for(Citat citat : this.citaty) {
            if(citat.getAutor().equals(autor)) {
                najdeneCitaty.add(citat);
            }
        }
        return najdeneCitaty;
    }

    /*
    public List<Citat> listPodlaDatumu() {
        List<Citat> zotriedeneCitaty = new ArrayList<>(this.citaty);
        Collections.sort(zotriedeneCitaty);
        return zotriedeneCitaty;
    }
    */

    public void pridaj(Citat citat) {
        this.citaty.add(citat);
    }

    public List<Citat> vratVsetky() {
        return new ArrayList<>(this.citaty);
    }

    public List<Citat> najdiPodlaKlucovehoSlova(String dopyt) {
        
        List<Citat> najdeneCitaty = new ArrayList<>();
        for (Citat citat : citaty) {
            if(citat.getText().contains(dopyt)
                    || citat.getAutor().contains(dopyt)
                    ) 
            {
                najdeneCitaty.add(citat);
            }
                            
        }
        return najdeneCitaty;
     
    }
}
