package sk.upjs.ics.paz1c.citaty;

import java.util.List;

public interface CitatDao {
  Citat najdiPodlaId(Integer id);
  List<Citat> najdiPodlaAutora(String autor);
  void pridaj(Citat citat);
  List<Citat> vratVsetky();
  List<Citat> najdiPodlaKlucovehoSlova(String dopyt);
    
}
