public interface QueueBehaviour {
    void takeInQueue(Actor  actor);


    void takeOrders();

    void giveOrders();

    void releaseFromQueue(); //ПОКИНУТЬ ОЧЕРЕДЬ

}
