//8) Efetuar o c�lculo da quantidade de litros de combust�vel gasta em uma viagem, utilizando um 
//autom�vel
//que faz de 12 Km por litro. Para obter o c�lculo, o usu�rio deve fornecer o tempo gasto (TEMPO) 
//e a velocidade m�dia (VELOCIDADE) durante a viagem. Desta forma, ser� poss�vel obter a dist�ncia percorrida
//com a f�rmula DISTANCIA=TEMPO * VELOCIDADE. Possuindo o valor da dist�ncia, basta calcular a quantidade 
//de litros de combust�vel utilizada na viagem com a f�rmula LITROS_USADOS=DIST�NCIA/12. Ao final, o programa 
//deve apresentar os valores da velocidade m�dia (VELOCIDADE), tempo gasto na viagem (TEMPO), a dist�ncia 
//percorrida (DIST�NCIA) e a quantidade de litros (LITROS_USADOS) utilizada na viagem. 

import java.util.Scanner;

public class Exercicio08 {

public static void main(String[] args) {
	
Scanner entrada = new Scanner(System.in);

double vm, Tempo, Autonomia = 12;

double Distancia, LitrosUsados;		

System.out.print("Digite o tempo que voc� gastou em sua viagem em H: ");

Tempo = entrada.nextDouble();

System.out.print("Digite o Velocidade M�dia em KM/H : ");

vm = entrada.nextDouble();

Distancia = vm * Tempo;
LitrosUsados = Distancia / Autonomia;
System.out.print("A Velocidade m�dia foi de = " + vm + " Km/h");//velocidade m�dia (VELOCIDADE)
System.out.print("O Tempo gastona viagem foi de = " + Tempo + " horas");// tempo gasto na viagem (TEMPO)
System.out.print("A Distancia Percorrida no percurso foi de = " + Distancia + " Km");//a dist�ncia percorrida (DIST�NCIA)
System.out.print("Quantidade de Combust�vel utilizado foi de : " + LitrosUsados + " litros");// quantidade de litros (LITROS_USADOS)
}
}
