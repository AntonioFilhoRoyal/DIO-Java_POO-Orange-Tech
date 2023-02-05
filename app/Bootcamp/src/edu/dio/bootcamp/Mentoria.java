package edu.dio.bootcamp;

public class Mentoria extends Conteudo{
	
	@Override
	public double calcularXp() {
		return 10 + XP_PADRAO;
	}

	@Override
	public String toString() {
		return "Mentoria> Titulo: " + getTitulo() + ", Descricao; " + 
					getDescricao() + ", Data: " + getData();
	}
	
	

}
