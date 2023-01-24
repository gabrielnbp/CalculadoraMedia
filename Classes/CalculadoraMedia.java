package Classes;

import javax.swing.JOptionPane;

public class CalculadoraMedia {
	
	public static void main(String[] args) {
		calculadoraMedia();
	}
	
	public static void calculadoraMedia() {
		Aluno aluno = new Aluno();
		String resp;
		
		do {
			resp = JOptionPane.showInputDialog("Informe o nome do aluno:");
			aluno.setNome(resp);
			
			resp = JOptionPane.showInputDialog("Informe o RA do aluno:");
			aluno.setRA(Integer.parseInt(resp));
			
			resp = JOptionPane.showInputDialog("Informe o valor da Nota 01:");
			aluno.setN1(Double.parseDouble(resp));
			
			resp = JOptionPane.showInputDialog("Informe o valor da Nota 02:");
			aluno.setN2(Double.parseDouble(resp));
			
			resp = JOptionPane.showInputDialog("Informe o valor da Nota 03:");
			aluno.setN3(Double.parseDouble(resp));
			
			aluno.calcMedia();
			
			resp = "Aluno: " + aluno.getNome() + " - RA: "+ aluno.getRA() + "\n\n";
			resp += "Nota 1 = " + aluno.getN1() + "\n";
			resp += "Nota 2 = " + aluno.getN2() + "\n";
			resp += "Nota 3 = " + aluno.getN3() + "\n\n";
			resp += "Media = " + aluno.getMedia() + "\n\n";
			resp += "O status desse aluno é: " + aluno.getStatus();
			
			JOptionPane.showMessageDialog(null, resp);
			
			resp = JOptionPane.showInputDialog("Deseja verificar um outro aluno? (sim/nao)");
			
		} while (resp.equalsIgnoreCase("sim"));
		
		
		System.exit(0);
		
	}
}
