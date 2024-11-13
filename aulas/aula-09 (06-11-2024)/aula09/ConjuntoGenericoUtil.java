package aula09;

import java.util.Collection;
import java.util.HashSet;

public class ConjuntoGenericoUtil {
    
    public static void main(String[] args) {
        Collection<Integer> c = new HashSet<Integer>();
        System.out.println(c.add(1));
        System.out.println(c);
        System.out.println(c.add(7));
        System.out.println(c);
        System.out.println(c.add(1));
        System.out.println(c);
    }
    
}