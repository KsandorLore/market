
import java.util.LinkedList;
import java.util.Queue;

public class Market implements QueueBehaviour, MarketBehaviour {

    private  Queue queue;
    private Queue orders;

    public Market(){
        queue = new LinkedList();
        orders = new LinkedList();
    }

    @Override
    public void addOrder(Order order) {
        orders.add(order);
        
    }

    @Override
    public Order takeOrder() {
        return (Order) orders.poll();        
    }

    @Override
    public boolean hasOrder() {
        return !orders.isEmpty();
    }

    @Override
    public void takeInQueue(Actor actor) {
        queue.add(actor);
    }

    @Override
    public Actor releaseFromQueue() {
        return (Actor) queue.poll();
    }

    @Override
    public boolean isEmpty() {
        return queue.isEmpty();    
    }

    @Override
    public int size() {
        return queue.size();
    
    }

    @Override
    public void update() {
        if(hasOrder()){
            Order order = takeOrder();
            System.out.println("Order accept: " + order.toString());
        }
        else {
            System.out.println("No orders.");
        }
    }

}