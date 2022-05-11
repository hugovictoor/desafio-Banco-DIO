
public class Main {

	public static void main(String[] args) {
		
		Banco primeiroBanco = new Banco();
		

		Cliente venilton = new Cliente("Venilton", primeiroBanco);
		Conta cc = new ContaCorrente(venilton);
		cc.depositar(100);

		Cliente amanda = new Cliente("Amanda", primeiroBanco);
		amanda.setNome("Amanda");
		Conta poupanca = new ContaPoupanca(amanda);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();

		cc.transferir(75, poupanca);

		cc.imprimirExtrato();
		poupanca.imprimirExtrato();
		
		primeiroBanco.mostrarClientes();
		
		

	}

}
