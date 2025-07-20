import java.util.InputMismatchException;
import java.util.Scanner;


public class Local {

    private String endereco = "";


    public Local() {
        enterEndereco();
    }

    Scanner input = new Scanner(System.in);


    @Override
    public String toString() {
        return "Endereco: "+getEndereco();
    }


    public void enterEndereco() {

        System.out.println("-----------------------------------------------------------------------------");

        System.out.println("Digite um dos números correspondentes ao Estado do local:"+"\n"+"\n");
        int numeroEstado = 0;

        System.out.print(
            "\t"+"1-RS"+"\n"+
            "\t"+"2-RJ"+"\n"+
            "\t"+"3-SC"+"\n"+
            "\t"+"4-MG"+"\n"+
            "\t"+"5-ES"+"\n");


        try {
            numeroEstado = input.nextInt();
        }catch(InputMismatchException ime){
            System.out.println("Entrada inválida");
            return;
        }

        while (true) {

            if (numeroEstado < 1 || numeroEstado > 5) {
                System.out.println("Digite um valor entre 1 e 5: "+"\n");
                numeroEstado = input.nextInt();
            }
            else if (numeroEstado == 1) {setEndereco("RS"); break;}
            else if (numeroEstado == 2) {setEndereco("RJ"); break;}
            else if (numeroEstado == 3) {setEndereco("SC"); break;}
            else if (numeroEstado == 4) {setEndereco("MG"); break;}
            else {setEndereco("RS"); break;}

        }


        System.out.println("-----------------------------------------------------------------------------");

        System.out.println("Agora digite um número correspondente a cidade e bairro do Estado:"+"\n"+"\n");
        int numeroCidadeBairro = 0;

        while (true) {


            if (getEndereco().equals("RS")){
                System.out.print(
                    "\t"+"1-Viamão, Vila Elza"+"\n"+
                    "\t"+"2-Porto Alegre, Partenom"+"\n"+"\n");

                numeroCidadeBairro = input.nextInt();

                if (numeroCidadeBairro != 1 && numeroCidadeBairro != 2) {
                    System.out.println("Digite um valor entre 1 e 2: "+"\n");
                }
                else if (numeroCidadeBairro == 1) {
                    setEndereco(", Viamão, Vila Elza");
                    break;
                }
                else {
                    setEndereco(", Porto Alegre, Partenom");
                    break;
                }

            }
            else if (getEndereco().equals("RJ")){
                System.out.print(
                    "\t"+"1-Paraty, Caborê"+"\n"+
                    "\t"+"2-Angra dos Reis, Ilha Grande"+"\n"+"\n");

                numeroCidadeBairro = input.nextInt();

                if (numeroCidadeBairro != 1 && numeroCidadeBairro != 2) {
                    System.out.println("Digite um valor entre 1 e 2: "+"\n");
                }
                else if (numeroCidadeBairro == 1) {
                    setEndereco(", Paraty, Caborê");
                    break;
                }
                else {
                    setEndereco(", Angra dos Reis, Ilha Grande");
                    break;
                }

            }
            else if (getEndereco().equals("SC")) {
                System.out.print(
                    "\t"+"1-Florianópolis, Capivari"+"\n"+
                    "\t"+"2-Blumenau, Ribeirão Fresco"+"\n"+"\n");

                numeroCidadeBairro = input.nextInt();

                if (numeroCidadeBairro != 1 && numeroCidadeBairro != 2) {
                    System.out.println("Digite um valor entre 1 e 2: " + "\n");
                }
                else if (numeroCidadeBairro == 1) {
                    setEndereco(", Florianópolis, Capivari");
                    break;
                }
                else {
                    setEndereco(", Blumenau, Ribeirão Fresco");
                    break;
                }

            }
            else if (getEndereco().equals("MG")) {
                System.out.print(
                    "\t"+"1-Belo Horizonte, Boa Viagem"+"\n"+
                    "\t"+"2-Ouro Preto, São Bartolomeu"+"\n"+"\n");

                numeroCidadeBairro = input.nextInt();

                if (numeroCidadeBairro != 1 && numeroCidadeBairro != 2) {
                    System.out.println("Digite um valor entre 1 e 2: " + "\n");
                }
                else if (numeroCidadeBairro == 1) {
                    setEndereco(", Belo Horizonte, Boa Viagem");
                    break;
                }
                else {
                    setEndereco(", Ouro Preto, São Bartolomeu");
                    break;
                }

            }
            else if (getEndereco().equals("ES")) {
                System.out.print(
                    "\t"+"1-Vitória, Andorinhas"+"\n"+
                    "\t"+"2-Vila Velha, Prainha"+"\n"+"\n");

                numeroCidadeBairro = input.nextInt();

                if (numeroCidadeBairro != 1 && numeroCidadeBairro != 2) {
                    System.out.println("Digite um valor entre 1 e 2: " + "\n");
                }
                else if (numeroCidadeBairro == 1) {
                    setEndereco(", Vitória, Andorinhas");
                    break;
                }
                else {
                    setEndereco(", Vila Velha, Prainha");
                    break;
                }

            }

        }
        System.out.println("-----------------------------------------------------------------------------");

    }


    public String getEndereco() {
        return this.endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco += endereco;
    }


}
