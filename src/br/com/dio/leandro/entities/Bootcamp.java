package br.com.dio.leandro.entities;

import java.time.LocalDate;
import java.util.*;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Conteudo> conteudosList = new LinkedHashSet<>();
    private Set<Dev> devsList = new HashSet<>();

    public Bootcamp(String nome, String descricao) {
        this.nome = nome;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Conteudo> getConteudosList() {
        return conteudosList;
    }

    public void setConteudosList(Set<Conteudo> conteudosList) {
        this.conteudosList = conteudosList;
    }

    public Set<Dev> getDevsList() {
        return devsList;
    }

    public void setDevsList(Set<Dev> devsList) {
        this.devsList = devsList;
    }
}
