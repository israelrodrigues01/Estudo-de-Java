package myTasks;

public class Conta {
	
	double numero, saldo;
	
	public Conta(double valor) {
		this.numero = valor;
	}
	
	double getSaldo() {
		return this.saldo;
	}

	double getNumero() {
		return this.numero;
	}
	
	void creditar(double valor){
		this.saldo += valor;
	}
	
	void sacar(double valor) {
		if(!(this.saldo < valor)) {
			this.saldo -= valor;
		}else {
			System.out.println(
					"Por favor, nao pode adicionar um valor maior que o saldo "
					+ "\nEntao sua operaçao nao foi sucedida"
			);
		}
	}
}
