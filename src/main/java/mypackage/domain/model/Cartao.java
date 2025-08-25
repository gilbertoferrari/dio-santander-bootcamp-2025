package mypackage.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_cartao")
public class Cartao {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Id;

    @Column(unique = true)
    private String numero;

    @Column(name = "limite_disponivel" , precision = 13 , scale = 2)
    private BigDecimal limite;

    // getters and setters
    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public BigDecimal getLimite() {
        return limite;
    }

    public void setLimite(BigDecimal limite) {
        this.limite = limite;
    }
}
