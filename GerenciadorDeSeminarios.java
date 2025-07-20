import java.util.Scanner;


public class GerenciadorDeSeminarios {
    public static void main(String[] args) {

        Aluno[] alunos = new Aluno[1000];
        Professor[] professores = new Professor[100];
        Seminario[] seminarios = new Seminario[1000];


        Scanner input = new Scanner(System.in);

        System.out.println("Bem-vindo(a)!"+"\n"+"\n");

        System.out.println("O que deseja fazer?"+"\n"+"\n");

        String opcMenu;

        while (true){

            System.out.println(
                "\t"+"--------------------------------------------------"+"\n"+
                "\t"+"[A] - Cadastrar um aluno"+"\n\n"+
                "\t"+"[A.1] - Acessar um aluno"+"\n\n"+
                "\t"+"[B] - Cadastrar um professor"+"\n\n"+
                "\t"+"[B.1] - Acessar um professor"+"\n\n"+
                "\t"+"[B.2] - Colocar um seminário para um professor ministrar"+"\n\n"+
                "\t"+"[C] - Cadastrar um seminário"+"\n\n"+
                "\t"+"[C.1] - Acessar um seminário"+"\n\n"+
                "\t"+"[C.2] - Colocar um aluno em um seminário"+"\n\n"+
                "\t"+"[D] - Sair do programa"+"\n"+
                "\t"+"--------------------------------------------------"+"\n\n"
            );

            opcMenu = input.nextLine();


            if (opcMenu.equalsIgnoreCase("D")) break;



            else if (opcMenu.equalsIgnoreCase("A")){

                for (int i = 0; i < alunos.length; i++){

                    if (alunos[i] == null) {
                        alunos[i] = new Aluno();
                        break;
                    }
                    if (i == alunos.length - 1){
                        System.out.println("Não há mais espaço para cadastrar um aluno"+"\n\n");
                    }
                }
            }

            else if (opcMenu.equalsIgnoreCase("A.1")){

                String nomeAluno;
                System.out.println("Qual o nome do aluno?"+"\n\n");
                nomeAluno = input.nextLine();

                if (nomeAluno.isEmpty()) System.out.println("ERRO: o nome está vazio"+"\n\n");

                else {

                    byte verifyAcessCondition = 0;

                    for (int i = 0; i < alunos.length; i++) {
                        if ((alunos[i] != null) && (alunos[i].getNome().equals(nomeAluno))) {
                            alunos[i].toString();
                            verifyAcessCondition = 1;
                        }
                        if ((i == alunos.length - 1) && (verifyAcessCondition != 1)) {
                            System.out.println("Não há alunos com esse nome"+"\n\n");
                        }
                    }
                }
            }

            else if (opcMenu.equalsIgnoreCase("B")){

                for (int i = 0; i < professores.length; i++){

                    if (professores[i] == null) {
                        professores[i] = new Professor();
                        break;
                    }
                    if (i == professores.length - 1){
                        System.out.println("Não há mais espaço para cadastrar um professor"+"\n\n");
                    }
                }
            }

            else if (opcMenu.equalsIgnoreCase("B.1")){

                String nomeProfessor;
                System.out.println("Qual o nome do professor?"+"\n\n");
                nomeProfessor = input.nextLine();

                if (nomeProfessor.isEmpty()) System.out.println("ERRO: o nome está vazio"+"\n\n");

                else {

                    byte verifyAcessCondition = 0;

                    for (int i = 0; i < professores.length; i++) {
                        if ((professores[i] != null) && (professores[i].getNome().equals(nomeProfessor))) {
                            professores[i].toString();
                            verifyAcessCondition = 1;
                        }
                        if ((i == professores.length - 1) && (verifyAcessCondition != 1)) {
                            System.out.println("Não há professores com esse nome"+"\n\n");
                        }
                    }
                }
            }

            else if (opcMenu.equalsIgnoreCase("B.2")) {

                String nomeTest;

                while (true){

                    System.out.println("\n"+"Digite o nome do professor a ministrar: "+"\n\n");
                    nomeTest = input.nextLine();

                    if (nomeTest.isEmpty()) {
                        System.out.println("ERRO: o nome não pode estar vazio"+"\n\n");
                    }
                    else {

                        for (int i = 0; i < professores.length; i++) {

                            if ((professores[i] != null) && (professores[i].getNome().equals(nomeTest))) {
                                professores[i].enterSeminarios(seminarios);
                                break;
                            }
                            if (i == professores.length - 1){
                                System.out.println("Não há professor com esse nome"+"\n\n");
                            }
                        }

                        break;
                    }
                }
            }

            else if (opcMenu.equalsIgnoreCase("C")) {

                for (int i = 0; i < seminarios.length; i++){

                    if (seminarios[i] == null) {
                        seminarios[i] = new Seminario();
                        break;
                    }
                    if (i == seminarios.length - 1){
                        System.out.println("Não há mais espaço para cadastrar um seminário"+"\n\n");
                    }
                }
            }

            else if (opcMenu.equalsIgnoreCase("C.1")){

                String tituloSeminario;
                System.out.println("Qual o nome do Seminário?"+"\n\n");
                tituloSeminario = input.nextLine();

                if (tituloSeminario.isEmpty()) System.out.println("ERRO: o nome está vazio"+"\n\n");

                else {

                    byte verifyAcessCondition = 0;

                    for (int i = 0; i < seminarios.length; i++) {
                        if ((seminarios[i] != null) && (seminarios[i].getTitulo().equals(tituloSeminario))) {
                            seminarios[i].toString();
                            verifyAcessCondition = 1;
                        }
                        if ((i == seminarios.length - 1) && (verifyAcessCondition != 1)) {
                            System.out.println("Não há Seminários com esse nome"+"\n\n");
                        }
                    }
                }
            }

            else if (opcMenu.equalsIgnoreCase("C.2")){

                String tituloTest;

                while (true){

                    System.out.println("\n"+"Digite o nome do Seminário onde o aluno será inscrito: "+"\n\n");
                    tituloTest = input.nextLine();

                    if (tituloTest.isEmpty()) {
                        System.out.println("ERRO: o nome não pode estar vazio"+"\n\n");
                    }
                    else {

                        for (int i = 0; i < seminarios.length; i++) {

                            if ((seminarios[i] != null) && (seminarios[i].getTitulo().equals(tituloTest))) {
                                seminarios[i].enterAluno(alunos, seminarios);
                                break;
                            }
                            if (i == seminarios.length - 1){
                                System.out.println("Não há Seminário com esse nome"+"\n\n");
                            }
                        }

                        break;
                    }
                }
            }

            else {

                System.out.println(
                    "\n"+"ERRO: opção inexistente no menu"+"\n"+
                    "Tente novamente"+"\n\n\n"
                );
            }

        }

        input.close();
        System.out.println("Até uma outra hora :)");
    }
}
