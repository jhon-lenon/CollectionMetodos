		/**TIPOS DE LIST*/
		//List notas = new ArrayList();
		//List<double> notas = new ArrayList<>();
		//ArrayList<double> notas = new ArrayList<>();
		//List<double> notas = new ArrayList<>(Array.asList(7d, 8.5, 9.3, 5d, 7d, 0d, 3.6))		
		/**List<double> notas = Arrays.asList(7, 8.5, 9.3, 5, 7, 0, 3.6);
		notas.add(10d);
		System.out.println(notas);*/		
		/*List<double> notas = List.of(7, 8.5, 9.3, 5, 7, 0, 3.6);
		notas.add(1d);
		notas.remove(o: 5d);
		System.out.println(notas);*/

package List;

import java.util.*;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExercicioExemploLists {
	public static void main(String[] args) {
		/**Dada uma lista com 7 NOTAS de um aluno [7, 8.5, 9.3, 5, 7, 0, 3.6], faça:*/
		
		/** 1º Crie uma lista e adicione as 7 notas*/
		System.out.println("Crie uma lista e adicione as 7 notas: ");
		List<Double> notas = new ArrayList<Double>(); /* Método List */
		notas.add(7.0); /* Para adicionar elemento */
		notas.add(8.5);
		notas.add(9.3);
		notas.add(5.0);
		notas.add(7.0);
		notas.add(0.0);
		notas.add(3.6);
		System.out.println(notas);/* PODE SER FEITO TAMBEM *//**System.out.println(notas.toString());*/
		
		/** 2º Exiba a posição da nota 5.0*/
		System.out.println("Exiba a posição da nota 5.0: " + notas.indexOf(5d));
		
		/** 3º Adicione na lista a nota 8.0 na posição 4*/
		System.out.println("Adicione na lista a nota 8.0 na posição 4: ");
		notas.add(4, 8.0);
		System.out.println(notas);
		
		/** 4º Subestitua a nota 5.0 pela nota 6.0*/
		System.out.println("Subestitua a nota 5.0 pela nota 6.0: ");
		notas.set(notas.indexOf(5d), 6.0);
		System.out.println(notas);
		
		/** 5º Confira se a nota 5.0 está na lista */
		System.out.println("Confira se a nota 5.0 está na lista: " + notas.contains(5.0));
		
		/** 6º Exba todas as notas na ordem em que foram informados */
		System.out.println("Exba todas as notas na ordem em que foram informados: ");
		for(Double nota : notas) System.out.println(nota);
		
		/** 7º Exba a aterceira nota adicionada */
		System.out.println("Exba a aterceira nota adicionada: " + notas.get(2));
		System.out.println(notas);
		
		/** 8º Exba a menor nota */
		System.out.println("Exba a menor nota: " + Collections.min(notas));
		
		/** 9º Exba a maior nota */
		System.out.println("Exba a maior nota: " + Collections.max(notas));
		
		/** 10º Exba a soma dos valores */
		Iterator<Double> iterator = notas.iterator();
		double soma = 0d;
		while(iterator.hasNext()) {
			double next = iterator.next();
			soma+= next;			
		}
		System.out.println("Exba a soma dos valores: " + soma);
		
		/** 11º Exba a media das notas */
		System.out.println("Exiba a média das notas: " + (soma/notas.size()));
		
		/** 12º Remova a nota 0.0 */
		notas.remove(0.0);
		System.out.println("Remova a nota 0.0: " + notas);
		
		/** 13º Remova a nota da posição 0: */
		notas.remove(0);
		System.out.println("Remova a nota da posição 0: " + notas);
		
		/** 14º Remova as notas menos que 7 e exiba a lista: */
		Iterator<Double> iterator1 = notas.iterator(); 
		while(iterator1.hasNext()) {
			double next = iterator1.next();
			if(next < 7) iterator1.remove();
		}
		System.out.println(notas);
		
		/** 15º Apague toda a lista */
		notas.clear();
		System.out.println("Apague toda a lista: " + notas);
		
		/** 16º Confira se a lista está vazia */
		System.out.println("Confira se a lista está vazia: " + notas.isEmpty());
		
		
		
	}
	
}

