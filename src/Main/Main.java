package Main;

import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        int op;
        Tree tree = new Tree(10);

        do{
            System.out.print("\n\n1 - Insert value \n" +
                            "2 - Remove value\n" +
                            "3 - Print Pre Order\n" +
                            "4 - Print InOrdem\n" +
                            "5 - print PosOrder\n" +
                            "6 - isStrictBinaryTree\n" +
                            "7 - getRoot\n" +
                            "0 - Exit\n-> ");
            op = input();
            System.out.println(); // espaçamento

            switch(op){
                case 1:
                    System.out.print("\t\t\t\tInsert a new value\n-> ");
                    int value = input();
                    tree.insert(value);
                    System.out.println("\n\n\n");
                    break;

                case 2:
                    break;

                case 3:
                    tree.printPreorder();
                    break;

                case 4:
                    tree.printInordem();
                    break;

                case 5:
                    tree.printPosordem();
                    break;

                case 6:
                    System.out.println(tree.isStrictBinaryTree());
                    break;

                case 7:
                    Node newNode = tree.getRoot();
                    System.out.println("The value of root is " + newNode.getValue());
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