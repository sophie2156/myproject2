package ticket;

public class Discountold extends Ticket {
    float ooff =0.5f;
    public Discountold(Station start, Station destination) {
        super(start, destination);
        price = (int) (price*ooff);

    }
}
