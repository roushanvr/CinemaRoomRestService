package cinema;

import java.util.UUID;

public class OrderedSeat {


    private UUID token;
    private SeatInfo ticket;

    public OrderedSeat() {
    }
    public OrderedSeat(UUID token, SeatInfo ticket) {
        this.token = token;
        this.ticket = ticket;
    }

    public UUID getToken() {
        return token;
    }

    public void setToken(UUID token) {
        this.token = token;
    }

    public SeatInfo getTicket() {
        return ticket;
    }

    public void setTicket(SeatInfo ticket) {
        this.ticket = ticket;
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
