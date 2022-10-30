package List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**Dadas as seguintes informações sobre meus gatos, crie uma lista
e ordene esta lista exibindo:
(nome - idade - cor);

Gato 1 = nome: Jon, idade: 18, cor: preto
Gato 2 = nome: Simba, idade: 6, cor: tigrado
Gato 3 = nome: Jon, idade: 12, cor: amarelo
*/

public class ExemploOrndenacaoList {
	
	public static void main(String[] args) {
		
		List<Gato> meusGatos = new ArrayList<>() {{
			add(new Gato("jon", 18, "preto"));
			add(new Gato("Simba", 6, "tigrado"));
			add(new Gato("jon", 12, "amarelo"));
		}};
		System.out.println("--\tOrdem de Inserção\t---");
		System.out.println(meusGatos);
	
		System.out.println("--\tOrdem Aleatória\t---");
		Collections.shuffle(meusGatos);
		System.out.println(meusGatos);
		
		System.out.println("--\tOrdem Natural (Nome)\t---");
		Collections.sort(meusGatos);
		System.out.println(meusGatos);
		
		System.out.println("--\tOrdem Idade\t---");
		Collections.sort(meusGatos, );
		meusGatos.sort();
	}

}


class Gato implements Comparable<Gato> {
	private String nome;
	private Integer idade;
	private String cor;
	
	public Gato(String nome, Integer idade, String cor) {
		this.nome = nome;
		this.idade = idade;
		this.cor = cor;
		
		public String getNome() {
			return nome;
		}
		
		public void setNome(String nome) {
			this.nome = nome;
		}
		
		public Integer getIdade() {
			return idade;
		}
		
		public void setIdade(Integer idade) {
			this.idade = idade;
		}
		
		public String getCor() {
			return cor;
		}
		
		public void setCor(String cor) {
			this.cor = cor;	
		}
		
		@Override
		public String toString() {
			return "{" + 
					"nome'"  + nome + '\'' +
					", idade=" + idade +
					", cor='" + cor + '\'' +
					'}';
		}
		
		@Override
		public int compareTo(Gato gato) {
			return this.getNome().compareToIgnoreCase(gato.getNome());
		}	
	}	
}

class ComparatorIdade implements Comparator<Gato>{

	@Override
	public int compare(Gato g1, Gato g2) {
		return intger.compare(g1.getIdade(), g2.getIdade());
	}
}
