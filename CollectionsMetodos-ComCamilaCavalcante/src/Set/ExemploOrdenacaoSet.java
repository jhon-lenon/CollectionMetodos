package Set;

import java.util.*;

/** Dadas as seguintes informações sobre minhas series favoritas;
crie um conjunto e ordene esse conjunto exibindo:
(Nome; Genero; Tempo de Episódio);

serie1 = nome: got, genenero: fantasia, tempoDeEpisodio: 60
serie2 = nome: dark, genenero: drama, tempoDeEpisodio: 60
serie3 = nome: that '70s show, comedia: fantasia, tempoDeEpisodio: 25
*/

public class ExemploOrdenacaoSet {
	@SuppressWarnings("serial")
	public static void main(String[] args) {
		
		/* 1º Ordem aleatória */
		System.out.println("--\tOrdem aleatória\t---");
		Set<Series> minhasSeries1 = new HashSet<>() {{
			add(new Series("got", "fantasia", 60));
			add(new Series("dark", "drama", 60));
			add(new Series("that '70s show", "fantasia", 25));
		}};
	
		for (Series series : minhasSeries1) {
			System.out.println(series.getNome() + " - " + series.getGenero() + " - " + series.getTempoEpisodio());
		}

		
		/* 2º Ordem de Inserção */
        System.out.println("--\tOrdem de Inserção\t---");
		Set<Series> minhasSeries2 = new LinkedHashSet<>() {{
			add(new Series("got", "fantasia", 60));
			add(new Series("dark", "drama", 60));
			add(new Series("that '70s show", "fantasia", 25));
		}};
		
		for (Series series : minhasSeries2) {
			System.out.println(series.getNome() + " - " + series.getGenero() + " - " + series.getTempoEpisodio());
		}
		
		
		/* 3º Ordem Natural (Tempo de Episódio) */
		System.out.println("--\tOrdem Natural (Tempo de Episódio)\t---");
		Set<Series> minhasSeries3 = new TreeSet<>(minhasSeries2);
		for (Series series : minhasSeries3) {
			System.out.println(series.getNome() + " - " + series.getGenero() + " - " + series.getTempoEpisodio());
		}
		
		
		/* 4º Ordem Nome/Genero/tempoEpisodio */
		System.out.println("--\tOrdem Nome/Genero/tempoEpisodio\t---");
		Set<Series> minhasSeries4 = new TreeSet<>(new ComparatorNomeGeneroTempoEpisodio());
		minhasSeries4.addAll(minhasSeries1);
		
		for (Series series : minhasSeries4) {
			System.out.println(series.getNome() + " - " + series.getGenero() + " - " + series.getTempoEpisodio());
		}
		
		
		
		/*		FALTA FAZER!	*/
		/** 5º Ordem Genero */
//		System.out.println("--\tOrdem Genero\t---");
//		Set<Series> minhasSeries5 = new TreeSet<>(minhasSeries4);
//		
//		for (Series series : minhasSeries5) {
//			System.out.println(series.getNome() + " - " + series.getGenero() + " - " + series.getTempoEpisodio());
//		}
//		
//		
//		
//		
//		
		/** 6º Ordem Ordem tempoEpisodio */
////		System.out.println("--\tOrdem tempoEpisodio\t---");
		
		
				
	}
}


/**_________________________________________________________________________________________________________________________________________*/		

class Series implements Comparable<Series>{
	private String nome;
	private String genero;
	private Integer tempoEpisodio;
	
	public Series(String nome, String genero, Integer tempoEpisodio) {		
		this.nome = nome;
		this.genero = genero;
		this.tempoEpisodio = tempoEpisodio;
	}

	public String getNome() {
		return nome;
	}

	public String getGenero() {
		return genero;
	}

	public Integer getTempoEpisodio() {
		return tempoEpisodio;
	}

	@Override
	public String toString() {
		return "[" +
				"nome=" + nome + 
				", genero=" + genero + 
				", tempoEpisodio=" + tempoEpisodio + 
				"]";
	}
 
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Series serie = (Series) obj;
		return Objects.equals(nome, serie.nome) && Objects.equals(genero, serie.genero)
				&& Objects.equals(tempoEpisodio, serie.tempoEpisodio);
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(nome, genero, tempoEpisodio);
	}

	@Override
	public int compareTo(Series serie) {
		int tempoEpisodio = Integer.compare(this.getTempoEpisodio(), serie.getTempoEpisodio());
		if (tempoEpisodio != 0) return tempoEpisodio;
		
		return this.getGenero().compareTo(serie.getGenero());
	}

}


/**_________________________________________________________________________________________________________________________________________*/		


class ComparatorNomeGeneroTempoEpisodio implements Comparator<Series>{

	@Override
	public int compare(Series s1, Series s2) {
		int nome = s1.getNome().compareTo(s2.getNome());
		if (nome != 0) return nome;
		
		int genero = s1.getGenero().compareTo(s2.getGenero());
		if (genero != 0) return genero;
		
		return Integer.compare(s1.getTempoEpisodio(), s2.getTempoEpisodio());
	}
	
	
}