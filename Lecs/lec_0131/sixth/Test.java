package sixth;

import java.util.ArrayList;
import java.util.List;

public class Test {
    
}

class ACollection<T> {
    List<T> collection;
    
    public ACollection() {
        this.collection = new ArrayList<T>();
    };
}

class Utilities {
    static void sort(ACollection collection, Comparable com) {
        
    }

    public static void main(String[] args) {
        ACollection coll = new ACollection();
        Utilities.sort(coll, x -> (int)x);

        String str = "z";
        
        System.out.println(str.compareTo("a"));

        
    }

}
