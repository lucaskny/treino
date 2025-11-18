public class Cliente extends Atendimento {
    private String nome;
    private String cpf;
    private String telefone;
    private String nomePet;
    private String tipoPet;

    public Cliente(String n, String c, String t, String nPet, String tPet) {
        this.nome = n;
        this.cpf = c;
        this.telefone = t;
        this.nomePet = nPet;
        this.tipoPet = tPet;
    }
}