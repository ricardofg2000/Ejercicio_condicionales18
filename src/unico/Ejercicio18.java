package unico;

import java.util.Scanner;

public class Ejercicio18 {

	public static void main(String[] args) {
		/*Escribe un programa que genere la nómina (bien desglosada) de un 
		  empleado según las siguientes condiciones:

Se pregunta el cargo del empleado (1 - Prog. junior, 2 - Prog. senior, 3 - Jefe de proyecto), 
los días que ha estado de viaje visitando clientes durante el mes y su estado civil 
(1 - Soltero, 2 - Casado).
El sueldo base según el cargo es de 950, 1200 y 1600 euros según si se trata de un prog. junior, 
un prog. senior o un jefe de proyecto respectivamente.
Por cada día de viaje visitando clientes se pagan 30 euros extra en concepto de dietas. 
Al sueldo neto hay que restarle el IRPF, que será de un 25% en caso de estar soltero y 
un 20% en caso de estar casado.

Ejemplo:

1 - Programador junior
2 - Prog. senior
3 - Jefe de proyecto
Introduzca el cargo del empleado (1 - 3): 2
Introduzca el número de días de viaje: : 5
Introduzca su estado civil (1 - Soltero, 2 - Casado): 2

----------------------------------
| Sueldo base 1200,00            |
| Dietas ( 5 viajes) 150,00      |
|--------------------------------|
| Sueldo bruto 1350,00           |
| Retención IRPF (20%) 270,00    |
|--------------------------------|
| Sueldo neto 1080,00            |
----------------------------------
 */

		Scanner leer = new Scanner(System.in);
		
		int n_cargo;
		int n_viaje;
		int n_civil;
		double sueldoBase = 0;
		double paga_viaje;
		double sueldoBruto;
		double irpf = 0;
		double valor_irpf;
		double sueldoNeto;
		
		System.out.println("1 - Programador junior");
		System.out.println("2 - Prog. senior");
		System.out.println("3 - Jefe de proyecto");
		System.out.print("Introduzca el cargo del empleado (1 - 3): ");
		n_cargo = Integer.parseInt(leer.nextLine());
		System.out.print("Introduzca el número de días de viaje: ");
		n_viaje = Integer.parseInt(leer.nextLine());
		System.out.print("Introduzca su estado civil (1 - Soltero, 2 - Casado): ");
		n_civil = Integer.parseInt(leer.nextLine());
		
		switch (n_cargo) {
		case 1:sueldoBase = 950;break;
		case 2:sueldoBase = 1200;break;
		case 3:sueldoBase = 1600;break;
		}
		
		paga_viaje = n_viaje * 30.00;
		sueldoBruto = sueldoBase + paga_viaje;
		
		switch (n_civil) {
		case 1:irpf = 25.00;break;
		case 2:irpf = 20.00;break;		
		}
		
		valor_irpf = sueldoBruto*irpf/100.00;
		sueldoNeto = sueldoBruto - valor_irpf;
		
		System.out.println("---------------------------------");
		System.out.println("| Sueldo base " + sueldoBase + "            |");
		System.out.println("| Dietas ( " + n_viaje + " viajes) " + paga_viaje + "      |");
		System.out.println("|-------------------------------|");
		System.out.println("| Sueldo bruto " + sueldoBruto + "           |");
		System.out.println("| Retención IRPF (" + irpf + "%) " + valor_irpf + "  |");
		System.out.println("|-------------------------------|");
		System.out.println("| Sueldo neto " + sueldoNeto + "            |");
		System.out.println("---------------------------------");
	}

}
