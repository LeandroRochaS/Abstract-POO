package br.com.dio.leandro.entities;

public class Curso {

    private String titulo;
    private String descricao;
    private double cargoHoraria;

    public Curso() {
    }

    public Curso(String titulo, String descricao, double cargoHoraria) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.cargoHoraria = cargoHoraria;
    }



    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargoHoraria=" + cargoHoraria +
                '}';
    }
}
