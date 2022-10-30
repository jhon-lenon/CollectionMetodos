package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
Crie uma list e execute as seguintes operações:
*/

public class Exercicio1 {
	public static void main(String[] args) {
		
/** ----------- Crie uma List com 5 Nomes; -------------*/
		
		List<String> nomes = new ArrayList<>();
		nomes.add("Juliana");
		nomes.add("Pedro");
		nomes.add("Carlos");
		nomes.add("Larissa");
		nomes.add("João");
	
		System.out.print(nomes);
		System.out.println("");
		
/** ----- Subestitua o nome Carlos por Roberto; ---------*/
		
		nomes.set(nomes.indexOf("Carlos"), "Roberto");
		System.out.print(nomes);
		System.out.println("");

/** ----- Retorne o nome da primeira Posição; -----------*/	
		
		System.out.println(nomes.get(1));
		System.out.println("");
		
/** ------------ Remova o nome da posição 4; -------------*/
		
		nomes.remove(3);
		System.out.print(nomes);
		System.out.println("");
		
/** --------------- Remova o nome João; ------------------*/	
		
		nomes.remove("João");
		System.out.println(nomes);
		System.out.println();
		
/** ----- Verifique se o nome Juliana exeste na lista -----*/
		
		System.out.println(nomes.contains("Juliana"));
		System.out.println();
		
/** -- Crie uma nova lista com os nomes Ismael e Rodrigo --*/		
		
		List<String> nomes2 = new ArrayList<>();
		nomes2.add("Ismaes");
		nomes2.add("Rodrigo");
		
		System.out.println(nomes2);
		System.out.println();
		
/** Adicione todos os itens da nova lista na primeira lista*/		
		
		nomes.addAll(nomes2);
		System.out.println(nomes);
		System.out.println();
		
/**--- Odene todos os nomes da lista em ordem alfabética ---*/
		
		Collections.sort(nomes);
		System.out.println(nomes);
		
/**------------- Verifique se a lista está vazia -----------*/
		
		System.out.println(nomes.isEmpty());
		
		
	}

}
