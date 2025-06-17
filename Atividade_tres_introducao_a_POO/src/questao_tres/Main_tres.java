package questao_tres;

public class Main_tres {
    public static void main(String[] args) {
        ContaBancaria conta = null;     
        String caminho = "C:\\Users\\lucas\\OneDrive\\Documentos\\NetBeansProjects\\Atividade_tres_introducao_a_POO\\src\\questao_tres\\extrato.dat";
        String Numconta = "12345-6";
        try {
            conta = new ContaBancaria(Numconta, 1000.00, caminho);
            conta.deposito(250.00);
            conta.deposito(250.00);
            conta.saque(100.00);
            conta.deposito(250.00);
            conta.saque(100.00);
            conta.deposito(250.00);
            conta.saque(100.00);
            conta.saque(10000.00);
            
            conta.extrato();
            
        } catch(SaldoInsuficienteException e){
            System.out.println("Error saldo:"+ e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro generico: " + e.getMessage());;
        } finally{
            try{
                conta.extrato();
                
            } catch (Exception e){
                 System.out.println("Erro generico: " + e.getMessage());;
            }
        }
    }
}
