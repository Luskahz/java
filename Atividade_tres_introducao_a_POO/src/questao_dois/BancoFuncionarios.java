/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao_dois;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author lucas
 */
public class BancoFuncionarios {
    private String caminho;

    public BancoFuncionarios(String caminho) {
        this.caminho = caminho;
    }
   
    
    
    public void salvarFuncionario(Funcionario f) throws IOException{
        File funcionario = new File(caminho);
        FileWriter writer = new FileWriter(funcionario, true);
        writer.write( 
                "Nome:" + f.getNome() +
                "\nDepartamento: " + f.getDepartamento()+
                "\nSalario: "+ f.getSalario()+
                "\nData Entrada: "+ f.getDataEntrada()+ 
                "\nRG: " + f.getRg()
                +"\n\n"
        );
        writer.close();
}
}
