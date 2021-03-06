package desafio;

import static java.lang.System.in;
import java.util.Scanner;

public class Elevador {
	private int andar = 0;
	private int totalAndares;
	private int capacidade;
	private int pessoasPresentes;
	private int tempo = 1;

	public Elevador(int andar, int limite, int capacidade, int pessoas, int tempo) {
		this.andar = andar;
		this.totalAndares = limite;
		this.capacidade = capacidade;
		this.pessoasPresentes = pessoas;
		this.tempo = tempo;
	}

	Elevador() {
	}

	public int getAndar() {
		return andar;
	}

	public void setAndar(int andar) {
		this.andar = andar;
	}

	public int getLim() {
		return totalAndares;
	}

	public void setLim(int limite) {
		this.totalAndares = limite;
	}

	public int getCapacidade() {
		return capacidade;
	}

	public void setCapacidade(int max) {
		this.capacidade = max;
	}

	public int getPessoas() {
		return pessoasPresentes;
	}

	public void setPessoas(int pessoas) {
		this.pessoasPresentes = pessoas;
	}

	public int getTempo() {
		return tempo;
	}

	public void setTempo(int tempo) {
		this.tempo = tempo;
	}

	public void subir() {
		if (andar <= totalAndares) {
			andar++;
			tempo++;
			System.out.println("voc� est� subindo, andar atual:" + andar);
			System.out.println("Tempo em minutos:" + tempo);
		} else
			System.out.println("voc� est� no ultimo andar");
	}

	public void descer() {
		if (andar > 0) {
			andar--;
			tempo++;
			System.out.println("voc� est� descendo, andar atual:" + andar);
			System.out.println("Tempo em minutos:" + tempo);
		} else
			System.out.println("ja est� no primeiro andar");

	}

	public void entra() {
		if (this.pessoasPresentes < capacidade) {
			this.pessoasPresentes++;
		} else
			System.out.println("Capacidade limite atingidida");

	}

	public void sai() {
		if (pessoasPresentes > 0) {
			this.pessoasPresentes--;
		} else
			System.out.println("O elevador est� vazio");

	}

	public void exibirPessoas() {
		System.out.println("Numero de pessoas:" + this.pessoasPresentes);

	}

	public void exibirAndar() {
		System.out.println("Andar atual:" + this.andar);
	}

	/**
	 *
	 */
	public void menu() { // menu principal
		int opcao = 0;
		do {

			System.out.println("\n                  =========================");
			System.out.println("                  |     1 - Subir andar         |");
			System.out.println("                  |     2 - Descer andar      |");
			System.out.println("                  |     3 - Exibir andar atual      |");
			System.out.println("                  |     4 - Entrar Pessoa    |");
			System.out.println("                  |     5 - Sair Pessoa      |");
			System.out.println("                  |     6 - Exibir numero de pessoas atuais |");
			System.out.println("                  |     0 - Sair          |");
			System.out.println("                  =========================\n");
			Scanner scan = new Scanner(System.in);
			opcao = Integer.parseInt(scan.nextLine());
			switch (opcao) {
			case 1:
				subir();
				break;
			case 2:
				descer();
				break;

			case 3:
				exibirAndar();
				break;

			case 4:
				entra();
				break;

			case 5:
				sai();
				break;

			case 6:
				exibirPessoas();
				break;

			case 0:
				break;

			default:
				System.out.println("Op��o Inv�lida!");
				break;
			}
		} while (opcao != 0);
	}

}