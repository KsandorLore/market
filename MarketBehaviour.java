public interface MarketBehaviour {

    void addOrder(Order order);
    Order takeOrder();
    boolean hasOrder();
    void update();

}
