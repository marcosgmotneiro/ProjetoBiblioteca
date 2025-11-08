package com.example.demo.entities;

import java.time.Instant;

public class Multa {
    private long id;
    private double valor;
    private Instant dataGeração;
    private String motivo;
    private boolean pago;
}
