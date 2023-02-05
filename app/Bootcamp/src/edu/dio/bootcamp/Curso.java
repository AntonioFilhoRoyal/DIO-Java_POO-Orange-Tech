package edu.dio.bootcamp;

public class Curso extends Conteudo{
	
	@Override
	public double calcularXp() {
		return getCargaHoraria() * XP_PADRAO;
	}

	@Override
	public String toString() {
		return "Cursos> Titulo: " + getTitulo() + ", Descricao: " + 
				getDescricao() + ", Carga Horaria: " + getCargaHoraria();
	}

}


