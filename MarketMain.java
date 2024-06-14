public class MarketMain {
    public static void main(String[] args) {

        Human hum1 = new Human("Mark"); //
        Human hum2 = new Human("Olga");
        Human hum3 = new Human("Владимир");

        Market market = new Market();

        market.acceptToMarket(hum1); //вошли в магазин
        market.acceptToMarket(hum2);
        market.acceptToMarket(hum3);
        System.out.println("Посетители магазина:" +market.toString());


        //втали в очередь
        market.takeInQueue(hum1);
        market.takeInQueue(hum2);



        market.giveOrders();//сделал заказ
        market.takeOrders();//получил заказ
        market.releaseFromQueue();//вышел из очереди
        market.releaseFromMarket(hum1);
        market.update();
        System.out.println(market.toString());
    }
}
