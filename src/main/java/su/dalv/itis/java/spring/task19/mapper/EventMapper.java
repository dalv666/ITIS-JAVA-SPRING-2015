package su.dalv.itis.java.spring.task19.mapper;

import org.springframework.jdbc.core.RowMapper;
import su.dalv.itis.java.spring.task19.model.Event;

import java.sql.ResultSet;
import java.sql.SQLException;

public class EventMapper implements RowMapper<Event> {
    public Event mapRow(ResultSet resultSet, int i) throws SQLException {
        long id = resultSet.getLong(1);
        String name = resultSet.getString(2);
        Event event = new Event(id,name);
        return event;
    }

}
