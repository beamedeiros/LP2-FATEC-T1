package tarefaAdriana;

public class TesteMetodoCarro {

	public static void main(String[] args) {

		Corrida corrida = new Corrida();
		corrida.setPais("Jap�o");
		corrida.setData("10 de Julho de 2010");
		corrida.setEdicao(9);
		corrida.setCopa("Copa Pist�o");

		Piloto piloto = new Piloto();
		piloto.setNome("McQueen");
		piloto.setIdade(24);
		piloto.setRank("Ouro");
		piloto.setVitorias(7);

		Carro carro = new Carro();
		carro.setNome("RX 8");
		carro.setMarca("Mazda");
		carro.setCor("vermelho");
		carro.setPreco(138.672);
		carro.setAno(2015);

		System.out.println("O nome do carro � " + carro.nome + " da marca " + carro.marca + ". Sua cor � "
				+ carro.cor + ", � do ano de " + carro.ano + " " + " e seu pre�o � " + carro.preco + " reais."
				+ " O seu piloto se chama " + piloto.nome + " de " + piloto.idade + " anos de idade " + " do rank "
				+ piloto.rank + " com " + piloto.vitorias + " vit�rias, " + " competindo na " +corrida.copa + " na " + corrida.edicao
				+ "� Corrida do pa�s " + corrida.pais + " na data de " + corrida.data + ".");
	}

}
