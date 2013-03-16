package br.com.camilolopes;

public class Chicletao implements Competidor {
	private Chicleteiro chicleteiroMusica;
	@Override
	public void apresentar() {
		chicleteiroMusica.cantar();
	}
	public void setChicleteiroMusica(Chicleteiro chicleteiroMusica) {
		this.chicleteiroMusica = chicleteiroMusica;
	}

}
