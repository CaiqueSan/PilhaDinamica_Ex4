package view;

import javax.swing.JOptionPane;
import controller.NPRController;
import pilhaInt.Pilha;

public class Principal {

	public static void main(String[] args) throws Exception {
		int a;
		String op;
		NPRController c = new NPRController();
		Pilha p = new Pilha();
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número"));
		c.insereValor(p, a);
		a = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira um número"));
		c.insereValor(p, a);
		op = JOptionPane.showInputDialog(null, "Insira a operação (+, -, *, /):");
		System.out.println(c.npr(p, op));
	}
}
