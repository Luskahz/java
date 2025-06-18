package questao_tres;

public class PessoaFisica extends Contato {
    String cpf;
    String dataNascimento;
    String estadoCivil;

    public PessoaFisica(String nome, String endereco, String email, String cpf, String dataNascimento, String estadoCivil) {
        super(nome, endereco, email);
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.estadoCivil = estadoCivil;
    }

    @Override
    public String toString() {
        return "Pessoa Física - Nome: " + nome + ", CPF: " + cpf + ", Endereço: " + endereco + ", Email: " + email + ", Nascimento: " + dataNascimento + ", Estado Civil: " + estadoCivil;
    }
}
