package su.dalv.itis.java.spring.task19.services;

import org.junit.Before;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:lab2Context.xml"})
public class CommonTest {
    protected JdbcTemplate jdbcTemplate;
    @Autowired
    private DataSource dataSource;

    @Before
    public void setup(){
        jdbcTemplate = new JdbcTemplate(dataSource);
    }
}
