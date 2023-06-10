package br.com.cep;

import java.io.IOException;
import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        consultaCep Consultacep = new consultaCep();

        System.out.println("Digite um numero de Cep para consulta: ");
        var cep  = leitura.nextLine();

        try {
        Endereco novoEndereco = consultaCep.buscaEndereco(cep);
            System.out.println(novoEndereco);
        GeradorDeArquivo gerador = new GeradorDeArquivo();
        gerador.salvaJson(novoEndereco);
    }catch (RuntimeException | IOException e){
        System.out.println(e.getMessage());
        System.out.println("Finalizando a aplicação");
    }
    }
}