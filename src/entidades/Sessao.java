package entidades;

public class Sessao {
    private String nomeFilme;
    private String horario;
    private Assento assentos;
    private static final double VALOR = 50.00;

    public Sessao() {
    }

    public Sessao(String nomeFilme, String horario) {
        this.nomeFilme = nomeFilme;
        this.horario = horario;
        this.assentos = new Assento();
    }

    public boolean venda(int fila, int assento) {
        return this.assentos.venda(fila, assento);
    }

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Assento getAssentos() {
        return assentos;
    }

    public void setAssentos(Assento assentos) {
        this.assentos = assentos;
    }

    public double getValor() {
        return VALOR;
    }
}
