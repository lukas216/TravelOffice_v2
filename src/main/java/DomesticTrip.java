public class DomesticTrip extends Trip {

    private int ownArrivalDiscount;

    public DomesticTrip(){
        super();
        this.ownArrivalDiscount = 20;
    }

    public DomesticTrip(String description) {
        super(description);
    }

    public DomesticTrip(LocalDate start, LocalDate end, String destination, int price) {
        super(start, end, destination, price);
    }

    public void setOwnArrivalDiscount(int ownArrivalDiscount) {
        this.ownArrivalDiscount = ownArrivalDiscount;
    }

    @Override
    public int getPrice(){
        return super.getPrice() - this.ownArrivalDiscount;
    }
}
