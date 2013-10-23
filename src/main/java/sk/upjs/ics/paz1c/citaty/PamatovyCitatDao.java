package sk.upjs.ics.paz1c.citaty;


import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PamatovyCitatDao implements CitatDao {

    private List<Citat> citaty = new ArrayList<Citat>();

    public PamatovyCitatDao() {
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
        List<Citat> najdeneCitaty = new ArrayList<Citat>();
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
        for (Citat c : citaty) {
            if(c.getId().equals(citat.getId())) {
                throw new DuplicitnyCitatException(citat);
            }
        }
        this.citaty.add(citat);
    }

    public List<Citat> vratVsetky() {
        return new ArrayList<Citat>(this.citaty);
    }

    public List<Citat> najdiPodlaKlucovehoSlova(String dopyt) {
        
        List<Citat> najdeneCitaty = new ArrayList<Citat>();
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
