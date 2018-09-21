package br.com.fiap.beans;

public class Votacao extends Evento {
	private int idVotacao;
	private String dtTermino;

	public void setAll(int idEvento, Usuario idUsuario, Topico idTopico, String dtAbertura, String dsEvento,
			String dsNome, int idVotacao, String dtTermino) {
		super.setAll(idEvento, idUsuario, idTopico, dtAbertura, dsEvento, dsNome);
		setIdVotacao(idVotacao);
		setDtTermino(dtTermino);
	}

	public Votacao() {
		super();
	}

	public Votacao(int idEvento, Usuario idUsuario, Topico idTopico, String dtAbertura, String dsEvento, String dsNome,
			int idVotacao, String dtTermino) {
		super(idEvento, idUsuario, idTopico, dtAbertura, dsEvento, dsNome);
		this.idVotacao = idVotacao;
		this.dtTermino = dtTermino;
	}

	public int getIdVotacao() {
		return idVotacao;
	}

	public void setIdVotacao(int idVotacao) {
		this.idVotacao = idVotacao;
	}

	public String getDtTermino() {
		return dtTermino;
	}

	public void setDtTermino(String dtTermino) {
		this.dtTermino = dtTermino;
	}

}
