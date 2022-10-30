package Map;

import java.util.*;

/*Dado os modelo de carro e seus respectivos consumos, faça:]*//**		
modelo = gol - 	consumo = 14,4km/l
modelo = uno - 	consumo = 15,6km/l
modelo = mobi - consumo = 16,1km/l
modelo = hb20 - consumo = 14,5km/l
modelo = kwid - consumo = 15,6km/l

		
		map carrosPopulares2020 = new HashMap();
		Map<String, Double> carrosPoupares = new HashMap<>();
		HashMap<String, Double> carrosPopulares = new HashMap<>();
		Map<String, Double> carros populares2020 = Map.of("gol", 14.4, "uno", 15.6, "mobi", 16.1, "hb20", 14.5, "kwid", 15.6);
*/

public class ExemploMap {
	@SuppressWarnings("serial")
	public static void main(String[] args) {
		
/** 1º Crie um dicionário que relacione os modelos e seus respectivos consumos: */
        System.out.println("Crie um dicionário que relacione os modelos e seus respectivos consumos: ");
        Map<String, Double> carrosPopulares = new HashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares.toString());

/** 2º Substitua o consumo do gol por 15,2 km/l: */
        System.out.println("Substitua o consumo do gol por 15,2 km/l: ");
        carrosPopulares.put("gol", 15.2);
        System.out.println(carrosPopulares);

/** 3º Confira se o modelo tucson está no dicionário: */
        System.out.println("Confira se o modelo tucson está no dicionário: " + carrosPopulares.containsKey("tucson"));

/** 4º Exiba o consumo do uno: */
        System.out.println("Exiba o consumo do uno: " + carrosPopulares.get("uno"));

/** 5º Exiba o terceiro modelo adicionado: */
//      System.out.println("Exiba o terceiro modelo adicionado: ");	<<<<<<<NÃO TEM COMO FAZER;

/** 6º Exiba os modelos: */
        System.out.println("Exiba os modelos: ");
        Set<String> modelos = carrosPopulares.keySet();
        System.out.println(modelos);

/** 7º Exiba os consumos dos carros: */        
        System.out.println("Exiba os consumos dos carros: ");
        Collection<Double> consumos = carrosPopulares.values();
        System.out.println(consumos);

/** 8º Exiba o modelo mais econômico e seu consumo: */
        System.out.println("Exiba o modelo mais econômico e seu consumo: ");

        Double consumoMaisEficiente = Collections.max(carrosPopulares.values());
        Set<Map.Entry<String, Double>> entries = carrosPopulares.entrySet();
        String modeloMaisEficiente = "";

/** 9º Modelo mais eficiente: */
        for (Map.Entry<String, Double> entry : entries) {
            if (entry.getValue().equals(consumoMaisEficiente)) {
                modeloMaisEficiente = entry.getKey();
                System.out.println("Modelo mais eficiente: " + modeloMaisEficiente + " - " + consumoMaisEficiente);
            }
        }

/** 10º Exiba o modelo menos econômico e seu consumo: */
        System.out.println("Exiba o modelo menos econômico e seu consumo: " );

        
/** 11º Modelo menos eficiente: */        
        Double consumoMenosEficiente = Collections.min(carrosPopulares.values());
        String modeloMenosEficiente = "";
        for (Map.Entry<String, Double> entry: carrosPopulares.entrySet()) {
            if(entry.getValue().equals(consumoMenosEficiente)) {
                modeloMenosEficiente = entry.getKey();
                System.out.println("Modelo menos eficiente: " + modeloMenosEficiente + " - " + consumoMenosEficiente);
            }
        }

/** 12º Exiba a soma dos consumos: */
        Iterator<Double> iterator = carrosPopulares.values().iterator();
        Double soma = 0d;
        while(iterator.hasNext()){
            soma += iterator.next();
        }
        System.out.println("Exiba a soma dos consumos: " + soma);

/** 13º Exiba a média dos consumos deste dicionário de carros: */ 
        System.out.println("Exiba a média dos consumos deste dicionário de carros: " + (soma/carrosPopulares.size()));

/** 14º Remova os modelos com o consumo igual a 15,6 km/l: */       
        System.out.println(carrosPopulares);
        System.out.println("Remova os modelos com o consumo igual a 15,6 km/l: ");
        Iterator<Double> iterator1 = carrosPopulares.values().iterator();
        while(iterator1.hasNext()){
            if(iterator1.next().equals(15.6)) iterator1.remove();
        }
        System.out.println(carrosPopulares);

/** 15º Exiba todos os carros na ordem em que foram informados: */
        System.out.println("Exiba todos os carros na ordem em que foram informados: ");
		Map<String, Double> carrosPopulares1 = new LinkedHashMap<>() {{
            put("gol", 14.4);
            put("uno", 15.6);
            put("mobi", 16.1);
            put("hb20", 14.5);
            put("kwid", 15.6);
        }};
        System.out.println(carrosPopulares1.toString());

/** 16º Exiba o dicionário ordenado pelo modelo: */
        System.out.println("Exiba o dicionário ordenado pelo modelo: ");
        Map<String, Double> carrosPopulares2 = new TreeMap<>(carrosPopulares1);
        System.out.println(carrosPopulares2.toString());

/** 17º Apague o dicionario de carros: */
        System.out.println("Apague o dicionario de carros: ");
        carrosPopulares.clear();

/** 18º Confira se o dicionário está vazio: */       
        System.out.println("Confira se o dicionário está vazio: " + carrosPopulares.isEmpty());
	}

}
