package Main;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int op;
        do{
            System.out.print("1 - Add value \n" +
                            "2 - Remove value\n" +
                            "3 - Print All\n" +
                            "4 - \n" +
                            "5 - \n" +
                            "0 - Exit\n-> ");
            op = input();

            switch(op){
                case 1:
                    break;

                case 2:
                    break;

                case 3:
                    break;

                case 4:
                    break;

                case 5:
                    break;

                case 0:
                    break;

                default:
                    System.out.println("Opção inválida.");
            }
        }while(!(op == 0));
    }

    public static final int input(){ // Tratamento de exceção para a entrada de dados do usuário
        while(true){
            try{ // se o valor digitado não for um int, ele pede de novo até a entrada ser válida
                Scanner sc = new Scanner(System.in);
                int value = sc.nextInt();
                return value;
            }
            catch (Exception e) {
                System.out.println("Invalid value, enter an integer.");
                System.out.print("-> ");
            }
        }
    }
}