package com.campusdual.classroom;

public class Exercise18 {

    public static void main(String[] args) {
        //se invocan los métodos
        createAndInitializeArray(5);

        //utilizo este array commo ejemplo
        int[] array = {40, 50, 60, 80, 100};
        showInlineArray(array);

    }

    //Crear un metodo llamado createAndInitializeArray() que reciba por parámetro un número entero
    // y devuelva un array de tipo int. En el cuerpo de este metodo se creará el array
    // y se inicializará con tantos elementos como indique el parámetro (usar un for).
    public static int[] createAndInitializeArray(int tamaño) {//creamos un metodo que recibe por parametro un int


        int[] array = new int[tamaño]; //creo array de enteros co tamaño que lle paso por parámetro

        for (int i = 0; i < tamaño; i++) {//recorremos  todas as posicions do array
            array[i] = i + 1;
        }
        return array;//devolve o array creado e iniciaizado

    }

    //Crear un metodo llamado showInlineArray() que reciba por parámetro un array de tipo entero
    // y dentro del cuerpo lo recorra elemento a elemento y los muestre por pantalla.
    // El formato de presentación debe ser "secuencial", así: numero1 numero2 numero3 ... numeroN
    public static void showInlineArray(int[] array) {

        for (int i = 0; i < array.length; i++) {//recorro o array cun for

            System.out.print("numero" + array[i]);//imprimo os resultados nunha sola linea

            if (i < array.length - 1) {//verifico que o indice i é menor que o índice do ultimo elemento do array.
                //if true, non estamos no último elemento

                System.out.print(" ");// con este string imprimo espacios entre os diferentes elementos do array
            }
        }

    }

}
