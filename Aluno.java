import java.util.Scanner;


public class Aluno {

    private String nome;
    private int idade;


    public Aluno() {
        enterNome();
        enterIdade();
    }


    Scanner input = new Scanner(System.in);


    @Override
    public String toString() {
        System.out.println(
            "------------------------------------------------------"+"\n"+
            "Nome: "+getNome()+"\n"+
            "Idade: "+getIdade()+"\n\n"
        );

        return "";
    }


    public void enterNome(){

        String nomeTest;

        while (true) {
            System.out.println("\n"+"Digite o nome completo do aluno: "+"\n\n");
            nomeTest = input.nextLine();

            if (nomeTest.isEmpty()) {
                System.out.println("ERRO: não pode ser vazio"+"\n\n");
                continue;
            }
            else {
                setNome(nomeTest);
                break;
            }
        }
    }

    public void enterIdade(){

        int idadeTest;

        while (true) {
            System.out.println("\n"+"Digite a idade do aluno: "+"\n\n");
            idadeTest = input.nextInt();

            if (idadeTest < 10 || idadeTest > 30) {
                System.out.println("ERRO: não pode ser menor que 10 nem maior que 30"+"\n\n");
                continue;
            }
            else {
                setIdade(idadeTest);
                break;
            }
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.trim();
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

}
