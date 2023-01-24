package Classes;

public class Aluno {
	
	private int RA;
	private String nome;
	private double n1;
	private double n2;
	private double n3;
	private double media;
	private String status;
	
	public Aluno() {}
	
	public Aluno(int RA, String nome, double n1, double n2, double n3, double media, String status) {
		this.RA = RA;
		this.nome = nome;
		this.n1 = n1;
		this.n2 = n2;
		this.n3 = n3;
		this.media = media;
		this.status = status;
	}

	public int getRA() {
		return RA;
	}

	public void setRA(int rA) {
		RA = rA;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getN1() {
		return n1;
	}

	public void setN1(double n1) {
		this.n1 = n1;
	}

	public double getN2() {
		return n2;
	}

	public void setN2(double n2) {
		this.n2 = n2;
	}

	public double getN3() {
		return n3;
	}

	public void setN3(double n3) {
		this.n3 = n3;
	}

	public double getMedia() {
		return media;
	}

	public void setMedia(double media) {
		this.media = media;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public double calcMedia() {
		media = (n1 + n2 + n3) / 3;
		if(media >= 6) {
			status = "APROVADO";
		} else {
			status = "REPROVADO";
		}
		return media;
	}
}
