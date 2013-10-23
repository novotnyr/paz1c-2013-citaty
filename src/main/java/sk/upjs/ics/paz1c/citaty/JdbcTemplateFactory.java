package sk.upjs.ics.paz1c.citaty;

import org.hsqldb.jdbc.JDBCDataSource;
import org.springframework.jdbc.core.JdbcTemplate;

public enum JdbcTemplateFactory {

    INSTANCE;
    private JdbcTemplate jdbcTemplate;

    private JdbcTemplateFactory() {
        /*
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setDatabaseName("citaty");
        dataSource.setUser("citat");
        dataSource.setPassword("citat");
        */
        JDBCDataSource dataSource = new JDBCDataSource();
        dataSource.setDatabaseName("citaty");
        dataSource.setUser("SA");
        dataSource.setPassword("");
        jdbcTemplate = new JdbcTemplate(dataSource);
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }
}
