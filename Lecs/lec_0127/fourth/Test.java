package fourth;

public class Test {

    public static void main(String[] args) {
        Hero[] heros = {new Thor(), new IronMan()};
        for (Hero h: heros) {
            h.superPower();
        }
    }
    
}

class Thor implements Hero {
    public void drinkBeer() {

    }

    @Override
    public void superPower() {
        System.out.println("번개 발사");
    } 
}

class IronMan implements Hero {

    @Override
    public void superPower() {
        System.out.println("하늘을 날아요");        
    }

}
