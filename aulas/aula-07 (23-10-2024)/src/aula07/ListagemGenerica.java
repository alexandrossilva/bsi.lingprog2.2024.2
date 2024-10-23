package aula07;

public class ListagemGenerica {
 
    public static <T> void listarArray(T[] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println("}");
    }

    public static void main(String[] args) {
        Integer[] array1 = new Integer[] {7, 2, 9, 1, 10};
        listarArray(array1);
        Double[] array2 = new Double[] {7.2, 2.7, 9.1, 1.9, 10.7};
        listarArray(array2);
    }

}
