import java.util.Scanner;

public class Professor {

    private String nome;
    private String especialidade;
    private Seminario[] seminarios = new Seminario[1000];


    public Professor() {
        enterNome();
        enterEspecialidade();
    }


    Scanner input = new Scanner(System.in);


    @Override
    public String toString() {
        System.out.println(
            "------------------------------------------------------"+"\n"+
            "Nome: "+getNome()+"\n"+
            "Especialidade: "+getEspecialidade()+"\n\n"
        );

        for (int i = 0; i < getSeminarios().length; i++) {

            if (getSeminarios()[i] != null) {

                if (i == 0){
                    System.out.println(
                            "\n"+"Seminários:"+"\n\n"
                    );
                }
                getSeminarios()[i].toString();
            }
        }

        return "";
    }


    public void enterNome() {

        String nomeTest;

        while (true) {
            System.out.println("\n"+"Digite o nome completo do professor: "+"\n\n");
            nomeTest = input.nextLine();

            if (nomeTest.isEmpty()) System.out.println("ERRO: não pode ser vazio"+"\n\n");

            else {
                setNome(nomeTest);
                break;
            }
        }
    }

    public void enterEspecialidade() {

        String especialidadeTest;

        while (true) {
            System.out.println("\n"+"Digite sua especialidade: "+"\n\n");
            especialidadeTest = input.next();

            if (especialidadeTest.isEmpty()) System.out.println("ERRO: não pode ser vazia"+"\n\n");

            else {
                setEspecialidade(especialidadeTest);
                break;
            }
        }
    }

    public void enterSeminarios(Seminario[] seminarios) {

        input.nextLine();

        String tituloTest;

        while (true) {
            System.out.println("\n"+"Digite o nome do seminário a ser ministrado: "+"\n\n");
            tituloTest = input.nextLine();


            if (tituloTest.isEmpty()) {
                System.out.println("ERRO: o nome não pode ser vazio"+"\n\n");
                continue;
            }


            for (int i = 0; i < seminarios.length; i++) {

                if ((seminarios[i] != null) && (seminarios[i].getTitulo().equals(tituloTest))) {

                    for (int i2 = 0; i2 < getSeminarios().length; i2++) {

                        if (getSeminarios()[i2] == null){
                            getSeminarios()[i2] = seminarios[i];
                            System.out.println("Novo Seminário inserido na adminstração com sucesso"+"\n\n");
                            break;
                        }

                        if (i2 == getSeminarios().length - 1) {
                            System.out.println("Não há mais espaço para a administração de seminários"+"\n\n");
                        }
                    }
                    break;
                }

                if (i == seminarios.length - 1) {
                    System.out.println("Não há Seminário com esse nome:"+"\n\n");
                }
            }

            break;
        }
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome.trim();
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade.trim();
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

}
