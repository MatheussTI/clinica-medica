package entidades;

public class Paciente {
	
	private String nome;
	private String CPF;
	private String DataNascimento;
	private String Historico;
	
	public Paciente(String nome, String CPF, String DataNascimento, String Historico) {
		this.nome = nome;
		this.CPF = CPF;
		this.DataNascimento = DataNascimento;
		this.Historico = Historico;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome; 
	}	
	public String getCPF() {
		return CPF;
	}
	public void setCPF(String cPF) {
		CPF = cPF;
	}
	public String getDataNascimento() {
		return DataNascimento;
	}
	public void setDataNascimento(String dataNascimento) {
		DataNascimento = dataNascimento;
	}
	public String getHistorico() {
		return Historico;
	}
	public void setHistorico(String historico) {
		Historico = historico;
	}
	
	@Override
	public String toString() {
		return "Paciente [nome=" + nome + ", CPF=" + CPF + ", DataNascimento=" + DataNascimento + ", Historico="
				+ Historico + "]";
	}
	
}
