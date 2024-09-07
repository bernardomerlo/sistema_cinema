package entidades;

import java.util.Date;

public class Sessao {
    private String nomeFilme;
    private Date horario;
    private Assento assentos;
    private Double valor = 50.00;

    public Sessao() {
    }

    public Sessao(String nomeFilme, Date horario, Assento assentos) {
        this.nomeFilme = nomeFilme;
        this.horario = horario;
        this.assentos = assentos;
    }

    public boolean venda(int fila, int assento){
        return this.assentos.venda(fila, assento);
    }

    
}
