package aula08;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class ConjuntoGenericoUtil {
    
    public static void main(String[] args) {
        Collection<Integer> c = new HashSet<Integer>();
        c.add(1);
        System.out.println(c);
        c.add(7);
        System.out.println(c);
        c.add(1);
        System.out.println(c);
    }
    
}