package fourth;

public class Orchstra {
    public static void main(String[] args) {
        Musician player1 = new ViolinPlayer();
        Musician player2 = new Cello();
        player1.play();
        player2.play();
    }
    
}

interface Player {
    public void play();
}

abstract class Musician {
    String instrument;

    public void play() {}
}

class StringPlayer extends Musician {
    String stringInstrument;

    public void play() {
        System.out.println("현악기를 연주합니다");
    }

}

class ViolinPlayer extends StringPlayer implements Player {
    String violin;

    public void play() {
        System.out.println("바이올린을 연주합니다");
    }
    
}

class Cello extends StringPlayer {
    String cello;

    public void play() {
        System.out.println("첼로를 연주합니다");
    }
    
}