package comparadorDePreco;

public class Cliente { //CLASSE "JOGO" - fps, terro, rpg//

	private String nome_cliente;
	private String email;
	
	
	public Cliente(String nome_cliente, String email) {
		this.nome_cliente = nome_cliente;
		this.email = email;
	}
	
	
	public String getNome_cliente() {
		return nome_cliente;
	}
	public void setNome_cliente(String nome_cliente) {
		this.nome_cliente = nome_cliente;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}