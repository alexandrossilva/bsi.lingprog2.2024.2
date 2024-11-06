package aula07;

public class ListaGenericaUtil {
    
    public static void main(String[] args) {
        ListaGenerica<Integer> lg = new ListaGenerica<Integer>(2);
        lg.adicionar(1);
        lg.listar();
        lg.adicionar(7);
        lg.listar();
        lg.adicionar(3);
        lg.listar();
        lg.listar();
    }
    
}