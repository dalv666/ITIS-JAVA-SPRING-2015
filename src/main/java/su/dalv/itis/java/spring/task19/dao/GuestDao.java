package su.dalv.itis.java.spring.task19.dao;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import su.dalv.itis.java.spring.task19.mapper.GuestMapper;
import su.dalv.itis.java.spring.task19.model.Guest;

import java.util.List;

public class GuestDao extends JdbcDaoSupport implements Dao<Guest> {

    public Guest findByid(long id) {
        String sql = "SELECT * FROM GUEST WHERE ID_GUEST = ?";
        List<Guest> query = getJdbcTemplate().query(sql, new Object[]{id}, new GuestMapper());
        return query.get(0);
    }

    public void insert(Guest guest) {
        String sql = "INSERT INTO GUEST (GUEST_ID, GUEST_FIRST_NAME,GUEST_SECOND_NAME,GUEST_CARD_NUMBER) VALUES (?, ?,?,?)";
        getJdbcTemplate().update(sql, new Object[]{guest.getId(),guest.getFirstName(),guest.getSecondName(),guest.getCreditCardNumber()});
    }




    public void delete(Guest guest) {

    }
}
