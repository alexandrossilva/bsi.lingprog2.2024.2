package aula08;

import java.util.ArrayList;
import java.util.Collection;

public class ListaGenericaUtil {
    
    public static void main(String[] args) {
        Collection<Integer> c = new ArrayList<Integer>();
        c.add(1);
        System.out.println(c);
        c.add(7);
        System.out.println(c);
        c.add(1);
        System.out.println(c);
    }
    
}