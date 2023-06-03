package metodosunidad1;

public class NúmeroAmstrong {
/**
* Método main
*/
public static void main(String args[]) {
int númeroOriginal, últimoDigito; /* Variables para el número
original y su último dígito */
double dígitos; // Cantidad de dígitos que tiene el número
double suma = 0; /* Variable que sumará los dígitos elevados a su
cantidad de dígitos */
int número = 34; /* Número a determinar si es un número de
Amstrong */
númeroOriginal = número; /* Copia el valor del número para su
procesamiento */
dígitos = Math.floor(Math.log10(número)) + 1; /* Calcula el total
de dígitos del número */
// Calcula la suma de potencia de digitos
while (número > 0) {
últimoDigito = número % 10; // Extrae el último dígito
// Calcula la suma de potencias del último dígito
suma = suma + Math.pow(últimoDigito, dígitos);
número = número / 10; // Elimina el último dígito
}

if (númeroOriginal == suma) {
System.out.println(númeroOriginal +"Es un numero Amstrong");
} else {
System.out.println(númeroOriginal + "No es un número Amstrong");
}}}