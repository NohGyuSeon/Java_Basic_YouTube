package fourth;

public class Starcraft {

    public static void main(String[] args) {
        Attackable a = new Zealot();
        Attackable b = new Zealot();
        a.Attack(null);
        b.Attack(null);
    }
    
}

interface Attackable {
    void Attack(Unit unit);
}

abstract class Unit {
    void move() {
        System.out.println("이동");
    }
}

class Zealot extends Unit implements Attackable {
    public void Attack(Unit unit) {
        System.out.println(unit + "을 공격합니다.");
    }

}
