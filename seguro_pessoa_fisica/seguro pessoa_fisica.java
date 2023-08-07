package seguros;

import contas.Contas;

public class Segurospessoa_fisica extends Contas {

	public static void main(String[] args) {
		Segurospessoa_fisica cc3 = new Segurospessoa_fisica ();
		cc3.Cliente = "Bob Esponja";
		cc3.Saldo = 110000;
		System.out.println("Cliente:" + cc3.Cliente);
		cc3.exibirsaldo();

	}

}
