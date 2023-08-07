package contas;

public class pessoa_física {

	public static void main(String[] args) {
		Contas cc1 = new Contas();
		cc1.Cliente = "Darth vader";
		cc1.Saldo = 10000;
		System.out.println("Cliente:" + cc1.Cliente);
		cc1.exibirsaldo();
		System.out.println("--------------------------");
		Contas cc2 = new Contas();
		cc2.Cliente = "Vegeta ";
		cc2.Saldo = 8000;
		System.out.println("Cliente:" + cc2.Cliente);
		cc2.exibirsaldo();
		

	}

}
