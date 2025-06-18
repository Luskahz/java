package questao_tres;

public class Main_tres {
    public static void main(String[] args) {
        Agenda agenda = new Agenda(10);  // Cria uma agenda com capacidade para 10 contatos

        // Adicionando contatos
        agenda.adicionarContato(new PessoaFisica("João Silva", "Rua A, 123", "joao@gmail.com", "123.456.789-00", "01/01/1980", "Solteiro"));
        agenda.adicionarContato(new PessoaJuridica("Empresa X", "Av. B, 456", "contato@empresax.com", "12.345.678/0001-90", "123456789", "Empresa X Ltda"));

        // Visualizando todos os contatos
        System.out.println("Contatos antes da ordenação:");
        agenda.visualizarContatos();

        // Ordenando contatos
        agenda.ordenarContatos();
        System.out.println("\nContatos após a ordenação:");
        agenda.visualizarContatos();

        // Pesquisando um contato
        System.out.println("\nPesquisa por nome:");
        Contato contato = agenda.pesquisarPorNome("João Silva");
        if (contato != null) {
            System.out.println(contato);
        } else {
            System.out.println("Contato não encontrado.");
        }

        // Removendo um contato
        agenda.removerContato("João Silva");
        System.out.println("\nContatos após remoção:");
        agenda.visualizarContatos();
        agenda.salvarAgenda("C:\\Users\\lucas\\OneDrive\\Documentos\\NetBeansProjects\\atividade_sete_arquivos\\src\\questao_tres\\agenda_contatos.txt");
    }
}
