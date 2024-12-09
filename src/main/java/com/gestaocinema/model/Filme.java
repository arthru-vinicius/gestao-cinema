package com.gestaocinema.model;

import java.util.List;
import java.util.ArrayList;

public class Filme {
    private int id;
    private String titulo;
    private String sinopse;
    private String classificacao;
    private int duracaoEmMinutos;
    private List<String> elenco;
    
    // Construtor
    public Filme(int id, String titulo, String sinopse, String classificacao, int duracaoEmMinutos) {
        this.id = id;
        this.titulo = titulo;
        this.sinopse = sinopse;
        this.classificacao = classificacao;
        this.duracaoEmMinutos = duracaoEmMinutos;
        this.elenco = new ArrayList<>();
    }

    // Método 1: Adicionar um membro ao elenco
    public boolean adicionarElenco(String ator) {
        if (ator == null || ator.trim().isEmpty()) {
            return false;
        }
        return elenco.add(ator);
    }

    // Método 2: Remover um membro do elenco
    public boolean removerElenco(String ator) {
        return elenco.remove(ator);
    }

    // Método 3: Atualizar a duração do filme
    public boolean atualizarDuracao(int novaDuracao) {
        if (novaDuracao <= 0) {
            return false;
        }
        this.duracaoEmMinutos = novaDuracao;
        return true;
    }

    // Método 4: Verificar se o filme está classificado para maiores de 18 anos
    public boolean isClassificadoParaMaiorDe18() {
        return "18".equals(this.classificacao);
    }

    // Método 5: Listar os membros do elenco
    public List<String> listarElenco() {
        return new ArrayList<>(elenco);
    }

    // Getters e Setters
    public int getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getSinopse() {
        return sinopse;
    }

    public String getClassificacao() {
        return classificacao;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public List<String> getElenco() {
        return elenco;
    }
}
