package sk.upjs.ics.paz1c.citaty;

import java.util.List;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;


public class SqlCitatDao implements CitatDao {
    private JdbcTemplate jdbcTemplate = JdbcTemplateFactory.INSTANCE.getJdbcTemplate();

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
        
        String sql = "INSERT INTO citat VALUES (?, ?, ?)";
        jdbcTemplate.update(sql, null, citat.getText(), citat.getAutor());
    }

    @Override
    public List<Citat> vratVsetky() {
        BeanPropertyRowMapper<Citat> mapper =
                BeanPropertyRowMapper.newInstance(Citat.class);
        
        return jdbcTemplate.query("SELECT * FROM citat", mapper);
    }

    @Override
    public List<Citat> najdiPodlaKlucovehoSlova(String dopyt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
