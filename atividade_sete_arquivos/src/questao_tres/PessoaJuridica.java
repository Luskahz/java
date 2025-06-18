package questao_tres;

public class PessoaJuridica extends Contato {
    String cnpj;
    String inscricaoEstadual;
    String razaoSocial;

    public PessoaJuridica(String nome, String endereco, String email, String cnpj, String inscricaoEstadual, String razaoSocial) {
        super(nome, endereco, email);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
        this.razaoSocial = razaoSocial;
    }

    @Override
    public String toString() {
        return "Pessoa Jurídica - Nome: " + nome + ", CNPJ: " + cnpj + ", Razão Social: " + razaoSocial + ", Inscrição Estadual: " + inscricaoEstadual + ", Endereço: " + endereco + ", Email: " + email;
    }
}
