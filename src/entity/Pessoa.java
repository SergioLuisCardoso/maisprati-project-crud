package entity;

public class Pessoa {

	private Integer id;
	private String nome;
	private Integer telefone;
	private String dataNasc;
	private String dataCad;
	private String dataUltAlt;
	private Integer notaFinalCurso;

	public Pessoa() {

	}

	public Pessoa(Integer id, String nome, Integer telefone, String dataNasc, String dataCad, String dataUltAlt,
			Integer notaFinalCurso) {

		this.nome = nome;
		this.telefone = telefone;
		this.dataNasc = dataNasc;
		this.dataCad = dataCad;
		this.dataUltAlt = dataUltAlt;
		this.notaFinalCurso = notaFinalCurso;

	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Pessoa Id = " + id + ", Nome: " + nome + "Telefone: " + telefone + "Data Nasc: " + dataNasc
				+ "Data Cadastro: " + dataCad + "Data Atualização: " + dataUltAlt + "Nota Final: " + notaFinalCurso;
	}

	
	public Integer getId() {
		return id;
	}

	
	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getTelefone() {
		return telefone;
	}

	public void setTelefone(Integer telefone) {
		this.telefone = telefone;
	}

	public String getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(String dataNasc) {
		this.dataNasc = dataNasc;
	}

	public String getDataCad() {
		return dataCad;
	}

	public void setDataCad(String dataCad) {
		this.dataCad = dataCad;
	}

	public String getDataUltAlt() {
		return dataUltAlt;
	}

	public void setDataUltAlt(String dataUltAlt) {
		this.dataUltAlt = dataUltAlt;
	}

	public Integer getNotaFinalCurso() {
		return notaFinalCurso;
	}

	public void setNotaFinalCurso(Integer notaFinalCurso) {
		this.notaFinalCurso = notaFinalCurso;
	}

}
