package br.com.camilolopes;

public class Cantor implements Competidor{

	private AtireioPauNoGato musica;
	public Cantor() {
//		aqui é o problema estou dizendo que o cantor vai cantar sempre essa musica
//	this.musica = new AtireioPauNoGato();
	}
	@Override
	public void apresentar() {
		musica.cantar();
	}
	public void setMusica(AtireioPauNoGato musica) {
		this.musica = musica;
	}
}
