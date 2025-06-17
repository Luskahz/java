/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package questao_dois;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author lucas
 */
public class BancoFuncionarios {
    private final String caminho;

    public BancoFuncionarios(String caminho) {
        this.caminho = caminho;
    }
    
    public boolean consultaFuncionario(String rg)throws IOException{
        BufferedReader leitor = new BufferedReader(new FileReader(caminho));
        String linha;
        while((linha = leitor.readLine()) != null){
            if(linha.contains("RG: " + rg)){
                return true;
            }
        }
        leitor.close();
        return false;
    }
   
    
    
    public void salvarFuncionario(Funcionario f) throws IOException{
        
        if(!consultaFuncionario(f.getRg())){
            File funcionario = new File(caminho);
            FileWriter writer = new FileWriter(funcionario, true);
            writer.write(
                    "Nome:" + f.getNome()
                    + "\nDepartamento: " + f.getDepartamento()
                    + "\nSalario: " + f.getSalario()
                    + "\nData Entrada: " + f.getDataEntrada()
                    + "\nRG: " + f.getRg()
                    + "\n#\n"
            );
            writer.close();
        } else{
            System.out.println("Funcionario já adcionado");
        }
        
}
}
