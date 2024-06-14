//Абстрактный класс Actor,
//который хранит в себе
//        параметры актора, включая
//состояние готовности сделать
//заказ и факт получения
//заказа.

public abstract class Actor implements ActorBehavoir {
        protected  String name;
        protected  boolean isMakeOrder;
        protected boolean isTakeOrder;

        public Actor(String name){
                this.name = name;
        }

        public abstract String getName();


        @Override
        public String toString(){
                return"\nПокупатель:{ "+name+
", сделал заказ: "+isMakeOrder+", забрал заказ: "+isTakeOrder+"}";
        }
}
