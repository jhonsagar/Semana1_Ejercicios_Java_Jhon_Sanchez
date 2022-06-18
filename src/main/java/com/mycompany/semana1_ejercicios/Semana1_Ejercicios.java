/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.semana1_ejercicios;

/**
 *
 * @author jhon sanchez
 */
public class Semana1_Ejercicios {
    public static void main(String[] args) {
        // 6.SALIDA DE DATOS 
        // MOSTRAR UN NUMERO POR CONSOLA
        System.out.println("6");
        System.out.println("====================================================");
        // MOSTRAR LA SUMA DE 4 NUMEROS
        System.out.println(4+2+1+5);
        System.out.println("====================================================");
        //8. VARIABLES EN JAVA + SALIDA DE DATOS 
        //Mostrar por consola la suma de 3 números enteros creando 3 variables
        int Numero1  = 2;
        int Numero2 = 5;
        int Numero3 = 7;
        int resultado = Numero1 + Numero2 + Numero3 ;
        System.out.println(resultado);
        System.out.println("====================================================");
        //Mostrar por consola tus nombres completos creando más de 2 variables
        String PrimerNombre = "Jhon";
        String SegundoNombre = " Jairo";
        String Apellidos = " Sanchez Garcia";
        System.out.println(PrimerNombre+SegundoNombre+Apellidos);
        System.out.println("====================================================");
        //Mostrar por consola tu Nombre solo utilizando variables CHAR;
        //no entendi la forma de hacerlo en una sola cadena
        char Letra1 = 'j';
        char Letra2 = 'h';
        char Letra3 = 'o';
        char Letra4 = 'n';
        System.out.println(Letra1);System.out.println(Letra2);System.out.println(Letra3);System.out.println(Letra4);
        System.out.println("====================================================");
        //Mostrar por consola la suma de 2 números flotantes creando 2 variables
        float PrimerN = (float) 5.982 ;
        float SegundoN =(float) 74.2;
        float suma = PrimerN+SegundoN;
        System.out.println(suma);
        System.out.println("====================================================");
        //10.CONVERSIONES EN JAVA
        //Definir 1 variable tipo Int y una variable de tipo Double, sumarlo, convertirlo a Int y mostrarlo por Consola
        int Var = 8;
        double Var2 = (double) 11.55;
        int resultS = (int) (Var+Var2);
        System.out.println(resultS);
        System.out.println("====================================================");
        //11.OPERADORES JAVA
        /*Realizar las siguientes operaciones con 4 
        números y mostrarlo por consola (Utilizar una 
        variable para cada número a calcular*/
        int Num1 = 100;
        int Num2 = 5;
        int Num3 = 3;
        int Num4 = 2;
        // Suma de números
        int ProSuma = (Num1+Num2+Num3+Num4);
        System.out.println("SUMA :"+ProSuma);
	// Resta de números
        int ProResta = (Num1-Num2-Num3-Num4);
        System.out.println("RESTA :"+ProResta);
	// Multiplicación de números
        int ProMultiplicacion = (Num1*Num2*Num3*Num4);
        System.out.println("MULTIPLICACION :"+ProMultiplicacion);
	// División de números
        float ProDivision = (float)((Num1)/(Num2)/(Num3)/(Num4));
        System.out.println("DIVISION :"+ProDivision);
	// Incremento en 1 de la multiplicación
        int IncrementoM = ProMultiplicacion++;
        System.out.println("INCREMENTO :"+IncrementoM);
	// Decremento en 1 de división
        float decrementoD = (float )ProDivision--;
        System.out.println("DECREMENTO :"+decrementoD);
        System.out.println("====================================================");
        //12.REALIZAR LOS SIGUIENTES EJERCICIOS DE CADENAS DE TEXTO Y MOSTRARLOS POR CONSOLA 
        //crear una variable con tu nombre en minúscula y mostrarlo en mayúscula
        String NombreM = "jhon";
        System.out.println(NombreM.toUpperCase());
        //Crear 3 variables con tu nombre completo en mayúscula y mostrarlo en minúscula
        String PrimerNom = "JHON";
        String SegundoNom = " JAIRO";
        String Apellido = " SANCHEZ";
        System.out.println((PrimerNom+SegundoNom+Apellido).toLowerCase());
        /*Crear una variable con la siguiente frase “Java no es tan complicado”
        y encontrar la posición de la palabra “no”*/
        String Frase = "Java no es tan complicado";
        System.out.println(Frase.indexOf("no"));
        System.out.println("====================================================");
        //13.CONCATENACIÓN DE CADENAS DE TEXTOS
        /*Crear las variables que consideres correspondientes
        y muestra el siguiente resultado,
        concatenando las variables “nombre(espacio)
        apellido(espacio)está(espacio) aprendiendo(espacio)Java”*/
        String NombreCon = "Jhon";
        String Espa1 = "";
        String ApellidoCon = " Sanchez";
        String Espa2 = "";
        String Frase1 = " Aprendiendo";
        String Espa3 = "";
        String Frase2 = " Java";
        System.out.println(NombreCon.concat(Espa1).concat(ApellidoCon).concat(Espa2)
                .concat(Frase1).concat(Espa3).concat(Frase2));
        //14. CARACTERES ESPECIALES EN JAVA
        //Mostrar por consola los siguientes enunciados
        //Java es un “Lenguaje de Programación”
        String Enunciado =(" Java es un \"Lenguajes de programacion\" ");
        System.out.println(Enunciado);
        System.out.println("====================================================");
        //16. SECUENCIAS EXTRAS EN JAVA
	//Mostrar los siguientes enunciados por consola
	/*-Hoy inicia mi camino 
           En JAVA */
        String CadenaUna = "Hoy inicia mi camino";
        String CadenaDos = "en JAVA";
        System.out.println(CadenaUna+ "\n" + CadenaDos);
        //-Hoy inicia	mi camino en Java
        String CadenaU = "Hoy inicia";
        String CadenaD = " mi camino en JAVA";
        System.out.println(CadenaU+ "\t" + CadenaD);
        //17.FUNCIONES MATEMATICAS EN JAVA
        //Mostrar por consola los siguientes resultados
        //Hallar el número mayor entre 99 y 200
        System.out.println(Math.max(99,200));
        //Hallar el número menor entre 10 y 20
        System.out.println(Math.min(10,20));
        //Hallar la raíz cuadra de 25
        System.out.println(Math.sqrt(25));
        //Hallar el valor absoluto de -6.2
        System.out.println(Math.abs(-6.2));
        //Mostrar un número aleatorio entre 10-50
        int NumRam = (int)(Math.random()*(10*50)); 
        System.out.println(NumRam);
        System.out.println("====================================================");
        //18.EXPRESSIONES BOOLEANAS
        //Mostrar el resultado por consola las siguientes expresiones Booleanas de las siguientes operaciones
	//30 >10
        int VUno = 30;
        int VDos = 10;
        System.out.println(VUno > VDos);
	//30<10
        System.out.println(VUno < VDos);
	//10=10
        System.out.println(VDos == VDos);
        
        
    }
}