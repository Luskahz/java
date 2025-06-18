package questao_um;

public class Main_um {
    public static void main(String[] args) {
        Tecnico tecnico = new Tecnico("Carlos", 3000, "T123", 500);
        Administrativo administrativo = new Administrativo("Fernanda", 2800, "A456", "noite", 300);

        System.out.println("Técnico:");
        tecnico.exibeDados();
        System.out.println("Matrícula: " + tecnico.getMatricula());
        System.out.println();

        System.out.println("Administrativo:");
        administrativo.exibeDados();
        System.out.println("Matrícula: " + administrativo.getMatricula());
    }
}
