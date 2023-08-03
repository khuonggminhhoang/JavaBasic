interface Eat{
    // trong đây có thể có các biến nhưng là biến hằng
    void jump();
    abstract void eat();
    public abstract void eatDragonFruit();
}

interface Walk {
    public abstract void walk();
}

interface Sleep {
    public abstract void sleep();
}

// abstract class , cta ko thể tạo ra 1 new Object từ class này 
abstract class Carbon{
    // các attribute đc khai báo như ở các class thông thường
    private String material;

    // contructor như class thông thường, thường để protected vì nó ko thể tạo ra 1 Object ngoài phạm vi các lớp con của nó;
    protected Carbon(){};
    
    protected Carbon(String material){
        this.material = material;
    }
    
    // các method cũng được khai báo thông thường, chú ý abstract method
    public void Hi(){
        System.out.println("Hi!!!");
    }
    //abstract method :
    public abstract void Hello(); // method này không thể cài đặt trong abstract class, phải cài trong class con

    @Override
    public String toString(){
        return this.material;
    }
}

class Diamond extends Carbon{
    private String color;

    Diamond(){};

    public Diamond(String material, String color) {
        super(material);
        this.color = color;
    }

    @Override
    public void Hello() {
        System.out.println("HELLO!!!");
    }

    public String toString(){
        return super.toString() + " " + this.color; 
    }
}



class Person implements Eat, Walk, Sleep {
    @Override
    public void sleep() {
        System.out.println("Sleeping...");
    }

    @Override
    public void walk() {
        System.out.println("Walking...");
    }

    @Override
    public void eat() {
        System.out.println("Eating...");
    }

    @Override
    public void eatDragonFruit() {
        System.out.println("Eating DragonFruit...");
    }

    @Override
    public void jump() {
        System.out.println("Jumping...");
    }
}

public class interface_learn {
    public static void main(String[] args) {
        Diamond d = new Diamond("carbon", "blue");
        d.Hello();
        d.Hi();
        System.out.println(d);
        Person p = new Person();
        p.walk();
        p.sleep();
        p.eat();
        p.eatDragonFruit();
        p.jump();
    }    
}
