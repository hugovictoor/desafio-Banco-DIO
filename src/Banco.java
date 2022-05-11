import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	List<String> clientes = new ArrayList<String>();

	public String nome;
	
	

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	public void mostrarClientes() {
		System.out.println(clientes);		
	}
	

		
	}
	



