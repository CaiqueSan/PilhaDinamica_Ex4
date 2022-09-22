package controller;

import pilhaInt.Pilha;

public class NPRController {
	//Pilha p = new Pilha();


	public Pilha insereValor(Pilha p, int a) {
		p.push(a);
		return p;
	}
	
	public int npr(Pilha p, String op) throws Exception{
		int r = 0;
		if (op == "+") {
			if (p.tamanho() <= 2) {
				r = p.pop();
				r = r + p.pop();
				p.push(r);
				return r;
			}
				throw new Exception("pilha não tem dois elementos");
		}
		if (op == "*") {
			if (p.tamanho() <= 2) {
				r = p.pop();
				r = r * p.pop();
				p.push(r);
			}
				throw new Exception("pilha não tem dois elementos");
		}
		if (op == "-") {
			if (p.tamanho() <= 2) {
				r = p.pop();
				r = p.pop() - r;
				p.push(r);
			}
				throw new Exception("pilha não tem dois elementos");
		}
		if (op == "/") {
			if (p.tamanho() <= 2) {
				r = p.pop();
				r = p.pop() / r;
				p.push(r);
			}
				throw new Exception("pilha não tem dois elementos");
		}
		else {
			System.out.println("Operação inválida");
		}
		return r;
	}
}