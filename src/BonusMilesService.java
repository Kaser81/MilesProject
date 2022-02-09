public class BonusMilesService {
    public int calculate(int price) {
        int partTicket = 20;
        int miles = price / partTicket;
        return miles;

    }
}
