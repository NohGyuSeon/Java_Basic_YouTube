package third;

public class ToyStory {
    
    public static void main(String[] args) {
        CowboyDoll woody = new CowboyDoll("woody");
        SpaceRanger buzz = new SpaceRanger("buzz");
        SpaceRanger buzz2 = new SpaceRanger("buzz2");
        woody.Say(buzz, "Hello!");

    }
}

abstract class Doll {
    String name;
    
    public Doll() {}

    public Doll(String name) {
        this.name = name;
    }

    public void say(String words) {
        System.out.println(words);
    }

    public void Say(Doll doll, String words) {
        System.out.println(this.name + "이" + doll.name + "에게 ");
        System.out.println(words + "라고 말했습니다.");
    }

}

class CowboyDoll extends Doll {
    String hat;

    public CowboyDoll(String name) {
        super(name);
    }
    
}

class SpaceRanger extends Doll {

    public SpaceRanger(String name) {
        super(name);
    }
    
}
