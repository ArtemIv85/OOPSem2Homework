import java.util.*;

public class Market implements MarketBehaviour, QueueBehaviour{

    private List<Actor> actors = new ArrayList<>(); //список посетителей магазина
    public Queue<Actor> queue = new LinkedList<>(); // очередь у стойки заказа
//    private Queue<String> Order = new LinkedList<>(); //очередт заказов
    @Override
    public void acceptToMarket(Actor actor) { //вошел в магазин
        actors.add(actor);

    }

    @Override
    public void releaseFromMarket(Actor actor) { // покинул магазин
        for (int i=0; i<actors.size();i++) {
            if (actors.get(i).isMakeOrder){
                System.out.println("Магазин покинул: "+actors.get(i).name);
                actors.remove(i);
            }
        }
    }

    @Override
    public void update() {  // обновление магазина

        giveOrders();
        takeOrders();

    }

    @Override
    public void takeInQueue(Actor actor) {  //встал в очередь на заказ
        queue.add(actor);
        System.out.println("Покупатель:"+actor.name+" встал в очередь");

    }

    @Override
    public void takeOrders() {  //получил заказ
        assert queue.peek() != null;
        queue.peek().setTakeOrder(true);
        assert queue.peek() != null;
        System.out.println("Заказ получил:"+queue.peek());
    }

    @Override
    public void giveOrders() { //сделал заказ
        assert queue.peek() != null;
        queue.peek().setMakeOrder(true);
        assert queue.peek() != null;
        System.out.println("Заказ сделал:"+queue.peek());
    }

    @Override
    public void releaseFromQueue() { //покинул очередь
        System.out.println("Покинул очередь:"+queue.peek());
        queue.remove();

    }

    @Override
    public String toString(){
        return actors.toString();
    }
}
