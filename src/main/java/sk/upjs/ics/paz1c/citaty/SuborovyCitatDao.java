package sk.upjs.ics.paz1c.citaty;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SuborovyCitatDao implements CitatDao {
    public static final String SUBOR_S_CITATMI = "citaty.txt";

    @Override
    public Citat najdiPodlaId(Integer id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Citat> najdiPodlaAutora(String autor) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void pridaj(Citat citat) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Citat> vratVsetky() {
        List<Citat> citaty = new ArrayList<Citat>();
        try {
            Scanner scanner = new Scanner(new File(SUBOR_S_CITATMI), "windows-1250");
            while(scanner.hasNextLine()) {
                String riadok = scanner.nextLine();
                Citat citat = new Citat();
                String[] zlozky = riadok.split("\t");
                // FIXME opravit parsovanie IDciek
                //citat.setId(Integer.parseInt(zlozky[0]));
                citat.setText(zlozky[1]);
                citat.setAutor(zlozky[2]);
                citat.setZdroj(zlozky[3]);
                
                citaty.add(citat);
            }
            return citaty;
        } catch (FileNotFoundException ex) {
            ex.printStackTrace(System.err);
            return citaty;
        }
    }

    @Override
    public List<Citat> najdiPodlaKlucovehoSlova(String dopyt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
