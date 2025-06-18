package questao_tres;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Agenda {
    private Contato[] contatos;
    private int quantidadeContatos;

    public Agenda(int tamanho) {
        contatos = new Contato[tamanho];
        quantidadeContatos = 0;
    }

    // Adiciona um contato à agenda
    public void adicionarContato(Contato contato) {
        if (quantidadeContatos < contatos.length) {
            contatos[quantidadeContatos] = contato;
            quantidadeContatos++;
        } else {
            System.out.println("Agenda cheia!");
        }
    }

    // Remove um contato pelo nome
    public void removerContato(String nome) {
        for (int i = 0; i < quantidadeContatos; i++) {
            if (contatos[i].getNome().equals(nome)) {
                for (int j = i; j < quantidadeContatos - 1; j++) {
                    contatos[j] = contatos[j + 1];
                }
                contatos[quantidadeContatos - 1] = null; // Remove a referência do último elemento
                quantidadeContatos--;
                break;
            }
        }
    }

    // Pesquisa um contato pelo nome
    public Contato pesquisarPorNome(String nome) {
        for (int i = 0; i < quantidadeContatos; i++) {
            if (contatos[i].getNome().equals(nome)) {
                return contatos[i];
            }
        }
        return null;
    }

    // Pesquisa um contato pelo CPF ou CNPJ
    public Contato pesquisarPorCpfCnpj(String cpfCnpj) {
        for (int i = 0; i < quantidadeContatos; i++) {
            if (contatos[i] instanceof PessoaFisica) {
                PessoaFisica pf = (PessoaFisica) contatos[i];
                if (pf.cpf.equals(cpfCnpj)) {
                    return pf;
                }
            } else if (contatos[i] instanceof PessoaJuridica) {
                PessoaJuridica pj = (PessoaJuridica) contatos[i];
                if (pj.cnpj.equals(cpfCnpj)) {
                    return pj;
                }
            }
        }
        return null;
    }

    // Visualiza todos os contatos da agenda
    public void visualizarContatos() {
        for (int i = 0; i < quantidadeContatos; i++) {
            System.out.println(contatos[i]);
        }
    }

    // Ordena os contatos por CPF/CNPJ e coloca as pessoas físicas antes das jurídicas
    public void ordenarContatos() {
        for (int i = 0; i < quantidadeContatos - 1; i++) {
            for (int j = i + 1; j < quantidadeContatos; j++) {
                if (contatos[i] instanceof PessoaFisica && contatos[j] instanceof PessoaJuridica) {
                    // Pessoa física deve vir antes de pessoa jurídica
                    Contato temp = contatos[i];
                    contatos[i] = contatos[j];
                    contatos[j] = temp;
                } else if (contatos[i] instanceof PessoaFisica && contatos[j] instanceof PessoaFisica) {
                    // Ordena por CPF
                    PessoaFisica pf1 = (PessoaFisica) contatos[i];
                    PessoaFisica pf2 = (PessoaFisica) contatos[j];
                    if (pf1.cpf.compareTo(pf2.cpf) > 0) {
                        Contato temp = contatos[i];
                        contatos[i] = contatos[j];
                        contatos[j] = temp;
                    }
                } else if (contatos[i] instanceof PessoaJuridica && contatos[j] instanceof PessoaJuridica) {
                    // Ordena por CNPJ
                    PessoaJuridica pj1 = (PessoaJuridica) contatos[i];
                    PessoaJuridica pj2 = (PessoaJuridica) contatos[j];
                    if (pj1.cnpj.compareTo(pj2.cnpj) > 0) {
                        Contato temp = contatos[i];
                        contatos[i] = contatos[j];
                        contatos[j] = temp;
                    }
                }
            }
        }
    }
    public void salvarAgenda(String nomeArquivo) {
    ordenarContatos(); // ordena a agenda antes de salvar

    try (BufferedWriter writer = new BufferedWriter(new FileWriter(nomeArquivo))) {
        for (int i = 0; i < quantidadeContatos; i++) {
            Contato c = contatos[i];
            String linha = "";

            if (c instanceof PessoaFisica) {
                PessoaFisica pf = (PessoaFisica) c;
                linha = "PessoaFisica#" + pf.nome + "#" + pf.email + "#" + pf.endereco + "#" + pf.cpf + "#" + pf.dataNascimento + "#" + pf.estadoCivil;
            } else if (c instanceof PessoaJuridica) {
                PessoaJuridica pj = (PessoaJuridica) c;
                linha = "PessoaJuridica#" + pj.nome + "#" + pj.email + "#" + pj.endereco + "#" + pj.cnpj + "#" + pj.inscricaoEstadual + "#" + pj.razaoSocial;
            }

            writer.write(linha);
            writer.newLine();
        }

        System.out.println("Agenda salva com sucesso no arquivo: " + nomeArquivo);

    } catch (IOException e) {
        System.out.println("Erro ao salvar a agenda: " + e.getMessage());
    }
}
}
