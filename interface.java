interface vehical {
    String Name="TVS";
    int speed = 100;

    void start();
    void stop();
    default void display(){
        System.out.println("vehical colour");
    }
}

class customer implements vehical{

    public void  start(){
        System.out.println("start(): insert the key  & key on the engine"+Name);
    }
    public void stop(){
        System.out.println("stop(): remove the key & key off the engine");
    }

    public static void main(String[] args) {
        customer c = new customer();
        c.start();
        c.stop();
        System.out.println(speed);
    }
}