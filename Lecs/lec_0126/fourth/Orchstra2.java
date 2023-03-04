package fourth;

public class Orchstra2 {
    public static void main(String[] args) {
        Musician[] musicians = {new Guitarist(), new TrumpetPlayer(), new Guitarist()};
        for(Musician m : musicians) {
            m.play();
        }
    }
}

abstract class Musician {
    public void play() {
        System.out.println("악기를 연주합니다");
    }
}

class Guitarist extends Musician {
    public void play() {
        System.out.println("기타를 칩니다");
    }
}

class TrumpetPlayer extends Musician {
    public void play() {
        System.out.println("트럼펫을 붑니다");
    }
}
