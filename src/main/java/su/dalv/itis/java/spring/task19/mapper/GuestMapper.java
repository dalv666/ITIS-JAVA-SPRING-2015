package su.dalv.itis.java.spring.task19.mapper;

import org.springframework.jdbc.core.RowMapper;
import su.dalv.itis.java.spring.task19.model.Guest;

import java.sql.ResultSet;
import java.sql.SQLException;

public class GuestMapper implements RowMapper<Guest> {
    public Guest mapRow(ResultSet resultSet, int i) throws SQLException {
        long id = resultSet.getLong(1);
        String firstName = resultSet.getString(2);
        String secondName = resultSet.getString(3);
        long cardNum = resultSet.getLong(4);
        Guest guest = new Guest(id,firstName,cardNum,secondName);
        return guest;
    }

}
