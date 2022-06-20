
public class Main {

	public static void main(String[] args) {
		Card myCard = new Card("N Bank","1234567898765432","AL HOLDER", "12/25");
		myCard.pagar(2);
		myCard.activar();
		myCard.consultarSaldo();
		myCard.pagar(500);
		myCard.consultarSaldo();
		myCard.pagar(1000);
		myCard.anular();
		myCard.pagar(2);
	}

}
