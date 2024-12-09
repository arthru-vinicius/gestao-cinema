package com.gestaocinema.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import java.util.List;

class FilmeTest {

    @Test
    void testAdicionarElenco_Valido() {
        Filme filme = new Filme(1, "Filme Teste", "Sinopse do filme", "12", 120);
        boolean resultado = filme.adicionarElenco("Ator Teste");
        assertTrue(resultado, "Deveria ser possível adicionar um ator ao elenco");
        assertEquals(1, filme.getElenco().size(), "O elenco deveria ter 1 ator");
    }

    @Test
    void testAdicionarElenco_Invalido() {
        Filme filme = new Filme(1, "Filme Teste", "Sinopse do filme", "12", 120);
        boolean resultado = filme.adicionarElenco("");
        assertFalse(resultado, "Não deveria ser possível adicionar um ator vazio");
    }

    @Test
    void testRemoverElenco_Existente() {
        Filme filme = new Filme(1, "Filme Teste", "Sinopse do filme", "12", 120);
        filme.adicionarElenco("Ator Teste");
        boolean resultado = filme.removerElenco("Ator Teste");
        assertTrue(resultado, "Deveria ser possível remover um ator do elenco");
        assertTrue(filme.getElenco().isEmpty(), "O elenco deveria estar vazio");
    }

    @Test
    void testRemoverElenco_Inexistente() {
        Filme filme = new Filme(1, "Filme Teste", "Sinopse do filme", "12", 120);
        boolean resultado = filme.removerElenco("Ator Inexistente");
        assertFalse(resultado, "Não deveria ser possível remover um ator inexistente do elenco");
    }
    
    // TODO: Implementar testes abaixo:
    
    @Test
    void testAtualizarFilme_Valido() {
        // Criar um filme
        // Atualizar o filme com dados válidos
        // Verificar se a atualização foi bem-sucedida
    }

    @Test
    void testAtualizarFilme_Invalido() {
        // Tentar atualizar um filme inexistente
        // Verificar se o retorno é falso
    }


    @Test
    void testRemoverFilme_Existente() {
        // Adicionar um filme e removê-lo
        // Verificar se o filme foi removido corretamente
    }

    @Test
    void testRemoverFilme_Inexistente() {
        // Tentar remover um filme inexistente
        // Verificar se o retorno é falso
    }

}
