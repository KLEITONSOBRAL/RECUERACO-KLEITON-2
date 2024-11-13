package com.mycompany.recuperacao.kleiton;

import java.util.Scanner;

public class RECUPERACAOKLEITON {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        int idade; int meses; int dias;
                       
        System.out.println("Digite sua idade:");
        idade = scanner.nextInt();
        
        meses = idade * 12;
        dias = idade * 365;
        
        System.out.println("Voce tem " + idade +" anos," + meses + " meses e " + dias + " dias");
        
        //1 ano tem 12 meses e 365 dias
        
        
        
        
        scanner.close();
    }
}
