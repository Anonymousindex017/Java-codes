abstract class animal{
    void legs(){
        System.out.println("animals have  4 legs");
    }
    abstract void sound();
    abstract void eat();
}
class dog extends animal{
    @Override
    void sound(){
        System.err.println("bow bow");
    }
    void eat(){
        System.out.println("meat eat");
    }
}

class cow extends animal{
    @Override
    void sound(){
        System.out.println("moo moo");
    }
    void eat(){
        System.out.println("grass eat");
    }
}

class absclass {
    public static void main(String[] args)
    {
        dog d = new dog();
        cow c = new cow();
        d.legs(); d.sound(); d.eat();

        c.legs();
        c.sound();
        c.eat();

    }
    
}
