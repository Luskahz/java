package questao_um;

public class Administrativo extends Assistente {
    private String turno; // "dia" ou "noite"
    private double adicionalNoturno;

    public Administrativo(String nome, double salario, String matricula, String turno, double adicionalNoturno) {
        super(nome, salario, matricula);
        this.turno = turno;
        this.adicionalNoturno = adicionalNoturno;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getAdicionalNoturno() {
        return adicionalNoturno;
    }

    public void setAdicionalNoturno(double adicionalNoturno) {
        this.adicionalNoturno = adicionalNoturno;
    }

    @Override
    public double ganhoAnual() {
        double salarioMensal = getSalario();
        if ("noite".equalsIgnoreCase(turno)) {
            salarioMensal += adicionalNoturno;
        }
        return salarioMensal * 12;
    }
}
