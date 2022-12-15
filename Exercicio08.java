//8) Efetuar o cálculo da quantidade de litros de combustível gasta em uma viagem, utilizando um 
//automóvel
//que faz de 12 Km por litro. Para obter o cálculo, o usuário deve fornecer o tempo gasto (TEMPO) 
//e a velocidade média (VELOCIDADE) durante a viagem. Desta forma, será possível obter a distância percorrida
//com a fórmula DISTANCIA=TEMPO * VELOCIDADE. Possuindo o valor da distância, basta calcular a quantidade 
//de litros de combustível utilizada na viagem com a fórmula LITROS_USADOS=DISTÂNCIA/12. Ao final, o programa 
//deve apresentar os valores da velocidade média (VELOCIDADE), tempo gasto na viagem (TEMPO), a distância 
//percorrida (DISTÂNCIA) e a quantidade de litros (LITROS_USADOS) utilizada na viagem. 

import java.util.Scanner;

public class Exercicio08 {

public static void main(String[] args) {
	
Scanner entrada = new Scanner(System.in);

double vm, Tempo, Autonomia = 12;

double Distancia, LitrosUsados;		

System.out.print("Digite o tempo que você gastou em sua viagem em H: ");

Tempo = entrada.nextDouble();

System.out.print("Digite o Velocidade Média em KM/H : ");

vm = entrada.nextDouble();

Distancia = vm * Tempo;
LitrosUsados = Distancia / Autonomia;
System.out.print("A Velocidade média foi de = " + vm + " Km/h");//velocidade média (VELOCIDADE)
System.out.print("O Tempo gastona viagem foi de = " + Tempo + " horas");// tempo gasto na viagem (TEMPO)
System.out.print("A Distancia Percorrida no percurso foi de = " + Distancia + " Km");//a distância percorrida (DISTÂNCIA)
System.out.print("Quantidade de Combustível utilizado foi de : " + LitrosUsados + " litros");// quantidade de litros (LITROS_USADOS)
}
}
