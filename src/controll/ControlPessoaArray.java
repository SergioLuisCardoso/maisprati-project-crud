package controll;

import entity.Pessoa;

public class ControlPessoaArray {

	private Pessoa[] pessoas;

	public Pessoa[] getPessoas() {
		return pessoas;
	}

	public void setPessoas(Pessoa[] pessoas) {
		this.pessoas = pessoas;
	}

	public Boolean vetorVazio() {
		if (this.pessoas.length == 0) {
			System.out.println("Array Vazio!");
			return true;
		} else {
			return false;
		}
	}

	public void adicionarPessoaVazio(Integer n, Pessoa... p) {
		if (n == 0) {
			System.out.println("Inclusão Inválida");
		} else {
			this.pessoas = new Pessoa[n];
			int i = 0;
			for (Pessoa x : p) {
				if (i > (this.pessoas.length - 1)) {
					throw new ArrayIndexOutOfBoundsException("Número de registros excede o tamanho da Array!");
				} else {
					this.pessoas[i] = new Pessoa(x.getId(), x.getNome(), x.getTelefone(), x.getDataNasc(),
							x.getDataCad(), x.getDataUltAlt(), x.getNotaFinalCurso());
					i++;
				}
			}
		}
	}

	public void adicionarPessoa(Integer n, Pessoa... p) {
		if (this.pessoas.length == 0) {
			System.out.println("É necessário criar o Array primeiro!");
		} else {
			int i = 0;
			while ((1 < this.pessoas.length) && (this.pessoas != null)) {
				i++;
			}
			if (i > (this.pessoas.length - 1)) {
				System.out.println("Array Completo!");
			} else {
				if ((this.pessoas.length - i) < n) {
					System.out.println("Número de registros excede o tamanho do Array!");
				} else {
					for (Pessoa x : p) {
						this.pessoas[i] = new Pessoa(x.getId(), x.getNome(), x.getTelefone(), x.getDataNasc(),
								x.getDataCad(), x.getDataUltAlt(), x.getNotaFinalCurso());
						i++;

					}
				}
			}

		}
	}

	public void listarPessoa() {

		if (!vetorVazio()) {
			for (int i = 0; i < this.pessoas.length; i++) {
				if (pessoas[i] != null) {
					System.out.println(i + " : " + pessoas[i]);
				} else {
					System.out.println("Cadastro Vazio");
				}

			}
		}
	}

	public void atualizarPessoas(Pessoa p) {
		int achado = 0;
		if (!vetorVazio()) {
			for (int i = 0; i < this.pessoas.length; i++) {
				if ((this.pessoas[i] != null) && (this.pessoas[i].getId().equals(p.getId()))) {
					this.pessoas[i] = p;
					achado++;
				}
			}
		}

		if (achado == 0) {
			System.out.println("Cadastro não Localizado!");

		}

	}

	public void removerPessoas(Pessoa p) {
		int achado = 0;
		if (!vetorVazio()) {
			for (int i = 0; i < this.pessoas.length; i++) {
				if ((this.pessoas[i] != null) && (this.pessoas[i].getId().equals(p.getId()))) {
					achado++;
					for (int j = i; j < this.pessoas.length; j++) {
						if (this.pessoas[j] != null) {
							pessoas[j] = pessoas[j + 1];
						}
					}
				}
			}

		}
		if (achado == 0) {
			System.out.println("Cadastro não Localizado!");
		}
	}

	
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa(27, "Marcelo Souza ", 997822359, "10/01/1995 \n", "01/01/2021 ", "05/01/2022 ", 8);
		Pessoa p2 = new Pessoa(22, "Eloá Giácomo  ", 997325698, "15/04/2000 \n", "01/06/2020 ", "05/01/2022 ", 9);
		Pessoa p3 = new Pessoa(19, "João Carlos   ", 997025249, "18/05/2003 \n", "12/07/2018 ", "27/11/2021 ", 5);
		
		ControlPessoaArray cp = new ControlPessoaArray();
		
		cp.adicionarPessoaVazio(10, p1, p2, p3);
		//cp.adicionarPessoa(2, p1, p2);
		
		//cp.atualizarPessoas(new Pessoa(27, "Alexandre Souza", 997822359, "10/01/1995", "01/01/2021", "05/01/2022", 8));
		
		//cp.listarPessoa();
		
				System.out.println(p1 + "\n");
				System.out.println(p2 + "\n");
				System.out.println(p3 + "\n");
		
		
	}
}



