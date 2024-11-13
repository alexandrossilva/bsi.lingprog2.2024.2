package aula09;

import java.util.ArrayList;
import java.util.Collection;

public class ListaGenericaUtil {
    
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>();
        System.out.println(c.add(1));
        System.out.println(c);
        System.out.println(c.add(7));
        System.out.println(c);
        System.out.println(c.add(1));
        System.out.println(c);
    }
    
}