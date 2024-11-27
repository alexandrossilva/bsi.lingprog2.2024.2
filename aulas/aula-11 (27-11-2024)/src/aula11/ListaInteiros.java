package aula11;

import java.util.ArrayList;
import java.util.Collection;

public class ListaInteiros {

	public static void main(String[] args) {
		Collection<Integer> lista = new ArrayList<Integer>();
		System.out.println(lista.isEmpty());
		lista.add(1);
		System.out.println(lista.isEmpty());
		lista.add(7);
		System.out.println(lista.size());
		lista.add(3);
		System.out.println(lista.size());
		System.out.println(lista.contains(7));
		System.out.println(lista.contains("7"));
	}

}
