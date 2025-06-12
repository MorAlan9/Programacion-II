import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        //Ejercicio 1
        saludo();

        // Ejercicio 2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = scanner.nextLine();

        saludar(nombre);

        //Ejercicio 3
        double base = 5.0;
        double altura = 10.0;
        double area = calcularAreaRectangulo(base, altura);
        System.out.println(" El area es : " + area);

        //Ejercicio 4
        String texto = "Hola Java";
        String textoMayus = convertirAMayusculas(texto);
        System.out.println("Mayúsculas: " + textoMayus);

        // Ejercicio 5
        mostrarMenu();

        //Ejercicio 6
        System.out.println("¿5 es par? " + esPar(5));
        System.out.println("8 es par?" + esPar(8));

        // Ejercicio 7

        System.out.println("el cuadrado de 16 es : " + numeroCuadrado(16));
        System.out.println("el cuadrado de 64 es : " + numeroCuadrado(64));

        // Ejercicio 8
        int numFactorial = 5;
        System.out.println("El factorial de " + numFactorial + " es: " + factorial(numFactorial));
        System.out.println("El factorial de 0 es: " + factorial(0));

        //Ejercicio 9

        System.out.println("Suma de 1, 2, 3: " + sumarNumeros(1, 2, 3));
        System.out.println("Suma de 10, 20: " + sumarNumeros(10, 20));
        System.out.println("Suma de un solo número (7): " + sumarNumeros(7));

        //Ejercicio 10
        double[] notas = {8.5, 9.0, 7.5, 10.0};
        System.out.println("Promedio de notas: " + calcularPromedioArray(notas));
        double[] vacio = {};
        System.out.println("Promedio de array vacío: " + calcularPromedioArray(vacio));

        //Ejercicio 11
        int[] numerosBusqueda = {10, 20, 30, 40, 50};
        System.out.println("¿Está 30 en el array? " + buscarEnArray(numerosBusqueda, 30));
        System.out.println("¿Está 15 en el array? " + buscarEnArray(numerosBusqueda, 15));

        //Ejercicio 12
        String[] frutas = {"manzana", "banana", "manzana", "pera", "manzana"};
        System.out.println("Ocurrencias de 'manzana': " + contarOcurrencias(frutas, "manzana"));
        System.out.println("Ocurrencias de 'uva': " + contarOcurrencias(frutas, "uva"));


        //Ejercicio 13
        int[] miArray = {1, 2, 3, 4, 5};
        imprimirArrayFormateado(miArray);
        int[] arrayVacio = {};
        imprimirArrayFormateado(arrayVacio);

        //Ejercicio 14
        int[] original = {1, 2, 3, 4};
        int[] invertido = invertirArray(original);
        System.out.print("Array original: ");
        imprimirArrayFormateado(original);
        System.out.print("Array invertido: ");
        imprimirArrayFormateado(invertido);

        //Ejercicio 15
        String[] nombresEstudiantes = {"Juan", "Ana", "Luis", "Sofía"};
        double[] notasEstudiantes = {7.8, 9.2, 8.5, 9.9};
        System.out.println("Estudiante con mejor nota: " + estudianteMejorNota(nombresEstudiantes, notasEstudiantes));


    } // FIN DEL METODO MAIN

    //-------------------------------------------------------------------------------------------------------------------------------------

    // 1#
    public static void saludo() {
        System.out.println("Hola Mundo!");
    }

    //2#
    public static void saludar(String nombre) {
        System.out.println("¡Hola, " + nombre + "!");
    }

    //3#
    public static double calcularAreaRectangulo(double base, double altura) {
        return base * altura;
    }

    //4#
    public static String convertirAMayusculas(String texto) {
        return texto.toUpperCase();

    }

    //5#
    public static void mostrarMenu() {
        System.out.println("--- MENÚ PRINCIPAL ---");
        System.out.println("1. Opción Uno");
        System.out.println("2. Opción Dos");
        System.out.println("3. Opción Tres");
        System.out.println("0. Salir");
        System.out.println("----------------------");
    }

    //6#
    public static boolean esPar(int numero) {
        return numero % 2 == 0;

    }

    //7#
    public static int numeroCuadrado(int numero) {
        return numero * numero;
    }

    //8#
    public static long factorial(int n) {
        if (n == 0) {
            return 1;
        }
        //paso recursivo : n * factorial (n-1)
        return n * factorial(n - 1);
    }

    // 9#
    public static int sumarNumeros(int... numeros) {
        int suma = 0;

        for (int num : numeros) {
            suma += num;
        }
        return suma;
    }

    //10#
    public static double calcularPromedioArray(double[] numeros) {
        if (numeros.length == 0) {
            return 0.0;
        }
        double suma = 0;
        for (double num : numeros) {
            suma += num;
        }
        return suma / numeros.length;
    }

    //11#
    public static boolean buscarEnArray(int[] array, int valorBuscar) {
        for (int num : array) {
            if (num == valorBuscar) {
                return true;
            }
        }
        return false;
    }

    // 12#
    public static int contarOcurrencias(String[] array, String clave) {
        int contador = 0;
        for (String s : array) {
            if (s.equals(clave)) { // Uso equals() para comparar Strings
                contador++;
            }
        }
        return contador;
    }


    // 13#
    public static void imprimirArrayFormateado(int[] array) {
        if (array.length == 0) {
            System.out.println("[]");
            return;
        }
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    // 14#

    public static int[] invertirArray(int[] original) {
        int[] invertido = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            invertido[i] = original[original.length - 1 - i];
        }
        return invertido;
    }

    // 15#

    public static String estudianteMejorNota(String[] nombres, double[] notas) {
        if (nombres.length == 0 || notas.length == 0 || nombres.length != notas.length) {
            return "Datos inválidos o arrays vacíos.";

            double mejorNota = notas[0];
            String nombreMejorEstudiante = nombres[0];

            for (int i = 1; i < notas.length; i++) {
                if (notas[i] > mejorNota) {
                    mejorNota = notas[i];
                    nombreMejorEstudiante = nombres[i];
                }
            }
            return nombreMejorEstudiante;
        }
    }
}
