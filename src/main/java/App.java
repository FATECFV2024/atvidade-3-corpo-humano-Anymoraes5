package main.java;
import java.util.Scanner;

public class App {
        //Comentário

    public static void main(String[] args) throws Exception {

        CorpoHumano humano = new CorpoHumano(61,0.70,2500,1.9);
        System.out.println("Seu IMC é:"+humano.calcularIMC());

        


    }
}
