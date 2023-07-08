package br.com.dio.leandro.entities;

public class Curso extends Conteudo{
    private double cargoHoraria;

    public Curso(String titulo, String descricao, double cargoHoraria) {
        super(titulo, descricao);
        this.cargoHoraria = cargoHoraria;
    }

    public double getCargoHoraria() {
        return cargoHoraria;
    }

    public void setCargoHoraria(double cargoHoraria) {
        this.cargoHoraria = cargoHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargoHoraria=" + cargoHoraria +
                '}';
    }

    @Override
    public double calcularXp() {
        return 80.0;
    }
}
