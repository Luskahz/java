package atividade_avaliativa_um;

public class exercicio_um {
    public static int calcularDuracao(int horaInicio, int minutoInicio, int horaTermino, int minutoTermino) {
        int inicioEmMinutos = horaInicio * 60 + minutoInicio;
        int terminoEmMinutos = horaTermino * 60 + minutoTermino;
        return terminoEmMinutos - inicioEmMinutos;
    }

    public static void main(String[] args) {
        // Exemplo de teste
        System.out.println(calcularDuracao(14, 30, 16, 10)); // Saída: 100 minutos
    }
}
