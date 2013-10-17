package sk.upjs.ics.paz1c.citaty;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public enum JdbcTemplateFactory {

    INSTANCE;
    private JdbcTemplate jdbcTemplate;

    private JdbcTemplateFactory() {
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setDatabaseName("citaty");
        dataSource.setUser("citat");
        dataSource.setPassword("citat");
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
}
