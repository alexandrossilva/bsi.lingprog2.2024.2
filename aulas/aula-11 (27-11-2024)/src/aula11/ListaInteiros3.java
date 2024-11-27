package aula11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class ListaInteiros3 {

	public static void main(String[] args) {
		Collection<Integer> lista = new HashSet<Integer>();
		System.out.println(lista.isEmpty());
		lista.add(1);
		System.out.println(lista.isEmpty());
		lista.add(7);
		System.out.println(lista.size());
		lista.add(1);
		System.out.println(lista.size());
		System.out.println(lista.contains(7));
		System.out.println(lista.contains("7"));
	}

}
