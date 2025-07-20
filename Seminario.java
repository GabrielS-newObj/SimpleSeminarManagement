import java.util.Scanner;


public class Seminario {

    private String titulo;
    private Local local;
    private Aluno[] alunos = new Aluno[1000];


    public Seminario() {
        enterTitulo();
        local = new Local();
    }


    Scanner input = new Scanner(System.in);


    @Override
    public String toString() {
        System.out.println(
            "------------------------------------------------------"+"\n"+
            "Título: "+getTitulo()+"\n"+
            "Local: "+getLocal()+"\n\n"
        );

        for (int i = 0; i < getAlunos().length; i++) {

            if (getAlunos()[i] != null) {

                if (i == 0){
                    System.out.println(
                            "\n"+"Alunos:"+"\n\n"
                    );
                }

                getAlunos()[i].toString();
            }

        }


        return "";
    }


    public void enterTitulo() {

        String tituloTest;

        while (true) {
            System.out.println("\n"+"Digite o título do seminário: "+"\n\n");
            tituloTest = input.nextLine();

            if (tituloTest.isEmpty()) System.out.println("ERRO: não pode ser vazio"+"\n\n");

            else {
                setTitulo(tituloTest);
                break;
            }
        }
    }

    public void enterAluno(Aluno[] alunos, Seminario[] seminarios){

        String nomeTest;

        while (true) {
            System.out.println("\n"+"Digite o nome do aluno a ser inserido: "+"\n\n");
            nomeTest = input.nextLine();

            if (nomeTest.isEmpty()) {
                System.out.println("ERRO: não pode ser vazio"+"\n\n");
                continue;
            }

            int verifyAcessVariable = 0;

            for (int i = 0; i < alunos.length; i++) {
                if ((alunos[i] != null) && (alunos[i].getNome().equals(nomeTest))) {
                    verifyAcessVariable = 1;
                    break;
                }
            }

            if (verifyAcessVariable == 0){
                System.out.println("Não há alunos cadastrados com esse nome"+"\n"+"Tente novamente após cadastrá-lo"+"\n\n");
                break;
            }

            int verifyAcessVariable2 = 0;

            for (int i = 0; i < seminarios.length; i++) {

                if (seminarios[i] != null) {

                    for (int i2 = 0; i2 < seminarios[i].getAlunos().length; i2++) {

                            if ((seminarios[i].getAlunos()[i2] != null) && (seminarios[i].getAlunos()[i2].getNome().equals(nomeTest))) {
                                verifyAcessVariable2 = 2;
                                i = seminarios.length - 1;
                                break;
                            }
                    }
                }
            }

            if (verifyAcessVariable2 == 2) {
                System.out.println("ERRO: esse aluno já está cadastrado em um Seminário" + "\n\n");
                break;
            }


            for (int i = 0; i < getAlunos().length; i++) {

                if (getAlunos()[i] == null){

                    for (int i2 = 0; i2 < alunos.length; i2++) {
                        if ((alunos[i2] != null) && (alunos[i2].getNome().equals(nomeTest))) {
                            getAlunos()[i] = alunos[i2];
                        }
                    }
                    System.out.println("Aluno inserido com sucesso!"+"\n\n");
                    break;
                }
                if (i == getAlunos().length - 1){
                    System.out.println("Não há mais vagas no Seminário"+"\n\n");
                }
            }


            break;

        }
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo.trim();
    }

    public Aluno[] getAlunos() {
        return alunos;
    }


    public Local getLocal() {
        return local;
    }

}
