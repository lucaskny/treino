public abstract class Servico extends Atendimento {
    private String descricao;
    private float valorBase;

    public Servico(String descricao, float valor) {
        this.descricao = descricao;
        this.valorBase = valor;
    }
}