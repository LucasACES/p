package prova;

public class Loja_moveis {
	
	private String modelo;
	private String avaliacao;
	private Double valor;
	
	public Loja_moveis(String modelo, String avaliacao, Double valor) {
		
	}
	
	public String getModelo(){
		return modelo;
	}
	public String getAvaliacao(){
		return avaliacao;
	}
	public Double getValor(){
		return valor;
	}
	
	public void setModelo(String modelo) {
		this.modelo = modelo;
		
	}
	public void setAvaliacao(String avaliacao) {
		this.avaliacao = avaliacao;
		
	}
	public void setValor(Double valor) {
		this.valor = valor;
		
	}
	
	public static void Compra() {
		System.out.println("Produto adquirido com sucesso.");
	}
	
	public static void Anuncio() {
		System.out.println("Modelo: "+ modelo+"\nAvaliação: "+avaliacao+"\nValor: "+valor);
	}
	
	

	
	

	public static void main(String[] args) {
		
		Loja_moveis Sofa1 = new Loja_moveis("4 lugares", "4 estrelas", 1000.00);
		Anuncio();
		Compra();
		

	}

}
