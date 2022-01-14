package entitites;

public class Product_03 {

	public String nome;
	public double nota;
	public double nota2;
	public double nota3;

	public double NotaDoAno() {
		return nota + nota2 + nota3;
	}

	public double PontosQueFaltam() {
		return 60 - NotaDoAno();
	}

	public String toString() {
		if (NotaDoAno() > 60) {
			return String.format("FINAL GRADE = %.2f%n", NotaDoAno()) + "PASS";
		} else {
			return String.format("FINAL GRADE = %.2f%n", NotaDoAno()) + "FAILED\n"
					+ String.format("MISSING %.2f POINTS", PontosQueFaltam());
		}

	}
}
