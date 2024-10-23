package aula07;

public class Listagem {
 
    public static void listarArray(int[] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println("}");
    }

    public static void listarArray(double[] array) {
        System.out.print("{ ");
        for (int i = 0; i < array.length; i++)
            System.out.print(array[i] + " ");
        System.out.println("}");
    }

    public static void main(String[] args) {
        int[] array1 = new int[] {7, 2, 9, 1, 10};
        listarArray(array1);
        double[] array2 = new int[] {7.2, 2.7, 9.1, 1.9, 10.7};
        listarArray(array2);
    }

}
