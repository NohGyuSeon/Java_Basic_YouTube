package first;

public class Icaran {
    Location location;
    
    public Location fly(Location location) {
        this.location = location;
        return this.location;
    }

}

class Toruk extends Icaran {
    public void bark(Object o) {

    }
    
}

class Location {
    int x, y;
}

class Avatar {
    
    public static void main(String[] args) {
        Icaran icaran = new Icaran();
        icaran.fly(null);
        System.out.println(icaran.fly(null));        
        
    }

}
