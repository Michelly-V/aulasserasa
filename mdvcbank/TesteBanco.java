package mdvcbank;

public class TesteBanco {
	public static void main(String[] args) {
//		
//		Pessoa pessoaNumero1 = new Pessoa();  //criar uma instancia = copia
//		pessoaNumero1.nome = "Jose das Couves";
//		pessoaNumero1.profissao = "Agricultor";
//		pessoaNumero1.cpf = "643.829.641-48";
//		
//		System.out.println("Nome: "+pessoaNumero1.nome);
//		System.out.println("Profiss�o: "+pessoaNumero1.profissao);
//		System.out.println("CPF: "+pessoaNumero1.cpf);
//		
//		Pessoa pessoaNumero2 = pessoaNumero1;
//		pessoaNumero2.nome = "Jo�o dos Tomates";
//		
//		System.out.println("==============================");
//		
//		System.out.println("Nome: " + pessoaNumero2.nome);
//		System.out.println("Nome: " + pessoaNumero1.nome);
//				
//		
//	}
//
//	


Conta conta1 = new Conta();
conta1.setAgencia(1234);
conta1.setNumeroConta(7889);
//conta1.setSaldo(1000000.5); >> n�o se deve alterar diretamente essa informa��o.
//Ela apenas pode ser exibida. Por isso, precisa apenas do encapsulamento get e n�o do set.
conta1.setTitular("Flavia Almeida");

conta1.depositar(100000.0);


System.out.println("Agencia:"+conta1.getAgencia());
System.out.println("Conta:"+conta1.getNumeroConta());
System.out.println("Titular:"+conta1.getTitular());
System.out.println("Saldo Atual: "+conta1.getSaldo());

conta1.sacar(20.0);

if (conta1.sacar(20.0)) {
	System.out.println("Saque efetuado com sucesso!");
}else {
	System.out.printf("Saldo atual: R$ %.2f \n",conta1.getSaldo());
}


Conta conta2 = new Conta();
	conta2.setAgencia(5582);
	conta2.setNumeroConta(2234);
	
	conta1.transferir(10000.0, conta2);
	
	System.out.printf("Saldo atual Flavia: R$ %.2f \n",conta1.getSaldo());
	System.out.printf("Saldo atual Babakuxy: R$ %.2f \n",conta2.getSaldo());

	}
}
