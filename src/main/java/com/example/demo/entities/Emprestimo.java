package com.example.demo.entities;

import java.time.Instant;

public class Emprestimo {
    private long id;
    private Instant dataEmprestimo;
    private Instant dataDevolucaoPrevista;
    private Instant dataDevolucaoReal;
    private String status;
}
