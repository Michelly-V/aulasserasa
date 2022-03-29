package mdvcbank;

public class PessoaFisica extends PessoaHeranca {

	private String cpf;
	private String rg;
	private String profissao;
	
	
	public PessoaFisica() {//ctrl3 + gcfs
		super();
	}

	
	public PessoaFisica(String cpf, String rg, String profissao) {//ctrl3 + gcuf
		super();
		this.cpf = cpf;
		this.rg = rg;
		this.profissao = profissao;
	}
	
	
	public String getCpf() {//ctrl3 + ggas
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getProfissao() {
		return profissao;
	}
	public void setProfissao(String profissao) {
		this.profissao = profissao;
	}
	
	
	
	
}
