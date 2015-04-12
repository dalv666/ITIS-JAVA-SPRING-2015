package su.dalv.itis.java.spring.task19.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.transaction.annotation.Transactional;
import su.dalv.itis.java.spring.task19.mapper.EventMapper;
import su.dalv.itis.java.spring.task19.model.Event;

import java.util.List;

public class EventDao extends JdbcDaoSupport implements Dao<Event> {

    @Transactional
    public Event findByid(long id) {
        String sql = "SELECT * FROM EVENT WHERE EVENT_ID = ?";
        List<Event> query = getJdbcTemplate().query(sql, new Object[]{id}, new EventMapper());
        return query.get(0);
    }

    public void insert(Event event) {
        String sql = "INSERT INTO EVENT (EVENT_ID, EVENT_NAME) VALUES (?, ?)";
        getJdbcTemplate().update(sql, new Object[]{event.getId(), event.getTitle()});
    }

    public void delete(Event event) {

    }
}
