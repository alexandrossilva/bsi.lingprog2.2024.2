package aula07;

public class ListaGenerica<T> {
    
    private T[] valores = null;
    private int qtd = 0;

    public ListaGenerica(int tam) {
        valores = (T[]) new Object[tam];
    }

    public void adicionar(T item) {
        if (qtd < valores.length) {
            valores[qtd] = item;
            qtd++;    
        }
    }
    
    public void listar() {
        System.out.print("{ ");
        for (int i = 0; i < qtd; i++)
            System.out.print(valores[i] + " ");
        System.out.println("}");
    }

    
}
