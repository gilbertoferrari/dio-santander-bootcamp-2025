package mypackage.domain.model;

import jakarta.persistence.*;

import java.util.List;

@Entity(name = "tb_usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    @OneToOne(cascade = CascadeType.ALL)
    private Conta conta;

    @OneToOne(cascade = CascadeType.ALL)
    private Cartao cartao;

    @OneToMany(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    private List<Recursos> recursos;

    @OneToMany(cascade = CascadeType.ALL , fetch = FetchType.EAGER)
    private List<Noticias> noticias;

    // getters and setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Conta getConta() {
        return conta;
    }

    public void setConta(Conta conta) {
        this.conta = conta;
    }

    public Cartao getCartao() {
        return cartao;
    }

    public void setCartao(Cartao cartao) {
        this.cartao = cartao;
    }

    public List<Recursos> getRecursos() {
        return recursos;
    }

    public void setRecursos(List<Recursos> recursos) {
        this.recursos = recursos;
    }

    public List<Noticias> getNoticias() {
        return noticias;
    }

    public void setNoticias(List<Noticias> noticias) {
        this.noticias = noticias;
    }
}
