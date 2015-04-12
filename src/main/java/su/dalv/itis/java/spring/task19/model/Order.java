package su.dalv.itis.java.spring.task19.model;

public class Order {

    private long id;
    private Event event;

    public Order(Event event, Guest guest, long id) {
        this.event = event;
        this.guest = guest;
        this.id = id;
    }

    public Order() {
    }

    public Event getEvent() {

        return event;
    }

    public void setEvent(Event event) {
        this.event = event;
    }

    public Guest getGuest() {
        return guest;
    }

    public void setGuest(Guest guest) {
        this.guest = guest;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    private Guest guest;

}
