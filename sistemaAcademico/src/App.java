import java.util.ArrayList;
import java.util.Scanner;

public class App {
    public static void main(String[] args){
        Menu menu = new Menu();
        System.out.println(menu.getMenu());
        Scanner ler = new Scanner(System.in);
        int opcao;
        opcao = ler.nextInt();

        ArrayList<Aluno> listaAlunos = new ArrayList<>();
        ArrayList<Professor> listaProfessor = new ArrayList<>();
        ArrayList<Psicologo> listaPsicologo = new ArrayList<>();
        ArrayList<Pedagogo> listaPedagogo = new ArrayList<>();
        ArrayList<Tecnico> listaTecnico = new ArrayList<>();
        ArrayList<Responsavel> listaResponsavel = new ArrayList<>();
        ArrayList<Candidato> listaCandidato = new ArrayList<>();
        ArrayList<Coordenador> listaCoordenador = new ArrayList<>();
        ArrayList<AssistenteSocial> listaAssistenteSocial = new ArrayList<>();
        ArrayList<Egresso> listaEgresso = new ArrayList<>();

        String nome;
        char sex;
        String localNascimento;
        String dataNascimento;
        String cpf;
        int codConcurso;
        int pontuacao;
        float nota1;
        float nota2;
        double renda;
        String formacao;
        byte qntDisciplina;
        String especialidade;
        String crp;
        String registro;
        String cargo;
        String funcao;
        String anoEntrada;
        String parentesco;
        String dataConcurso;
        String cress;
        int numAlunos;
        String anoSaida;
        int qntAno;
        String anoInicio;
        String anoConclusao;
        int anosGraduacao;
        String nomeCurso;

        while(opcao != 0){
            switch (opcao){
                case 1:
                    Aluno aluno = new Aluno();
                    System.out.println("Nome do aluno: ");
                    nome = ler.next();
                    aluno.setNome(nome);

                    System.out.println("Qual o seu sexo (digite M - Mulher / H - Homem)? ");
                    sex = ler.next().charAt(0);
                    aluno.setSex(sex);

                    System.out.println("Digite o local de nascimento: ");
                    localNascimento = ler.next();
                    aluno.setNomeNascimento(localNascimento);

                    System.out.println("Digite a data de nascimento: ");
                    dataNascimento = ler.next();
                    aluno.setDataNascimento(dataNascimento);

                    System.out.println("Digite o CPF: ");
                    cpf = ler.next();
                    aluno.setCpf(cpf);

                    System.out.println("Digite a nota 1: ");
                    nota1 = ler.nextFloat();
                    aluno.setNota1(nota1);

                    System.out.println("Digite a nota 2: ");
                    nota2 = ler.nextFloat();
                    aluno.setNota2(nota2);

                    listaAlunos.add(aluno);
                    System.out.println("Aluno cadastrado com sucesso");
                    break;
                case 2:
                    System.out.println("********************LISTA DE ALUNOS********************");
                    System.out.println(listaAlunos);
                    break;
                case 3:
                    Professor professor = new Professor();
                    System.out.println("Nome do aluno: ");
                    nome = ler.next();
                    professor.setNome(nome);

                    System.out.println("Qual o seu sexo (digite M - Mulher / H - Homem)? ");
                    sex = ler.next().charAt(0);
                    professor.setSex(sex);

                    System.out.println("Digite o local de nascimento: ");
                    localNascimento = ler.next();
                    professor.setNomeNascimento(localNascimento);

                    System.out.println("Digite a data de nascimento: ");
                    dataNascimento = ler.next();
                    professor.setDataNascimento(dataNascimento);

                    System.out.println("Digite o CPF: ");
                    cpf = ler.next();
                    professor.setCpf(cpf);

                    System.out.println("Digite a formação: ");
                    formacao = ler.next();
                    professor.setFormacao(formacao);

                    System.out.println("Digite a quantidade de disciplinas: ");
                    qntDisciplina = ler.nextByte();
                    professor.setQntDisciplina(qntDisciplina);

                    listaProfessor.add(professor);
                    System.out.println("Professor cadastrado com sucesso");
                    System.out.println("Professor >>>"+professor);
                    break;
                case 4:
                    System.out.println("********************LISTA DE PROFESSORES********************");
                    System.out.println(listaProfessor);
                    break;
                case 5:
                    Psicologo psicologo = new Psicologo();
                    System.out.println("Nome do psicologo: ");
                    nome = ler.next();
                    psicologo.setNome(nome);

                    System.out.println("Qual o seu sexo (digite M - Mulher / H - Homem)? ");
                    sex = ler.next().charAt(0);
                    psicologo.setSex(sex);

                    System.out.println("Digite o local de nascimento: ");
                    localNascimento = ler.next();
                    psicologo.setNomeNascimento(localNascimento);

                    System.out.println("Digite a data de nascimento: ");
                    dataNascimento = ler.next();
                    psicologo.setDataNascimento(dataNascimento);

                    System.out.println("Digite o CPF: ");
                    cpf = ler.next();
                    psicologo.setCpf(cpf);

                    System.out.println("Digite a especialidade: ");
                    especialidade = ler.next();
                    psicologo.setEspecialidade(especialidade);

                    System.out.println("Digite o CRP: ");
                    crp = ler.next();
                    psicologo.setCrp(crp);

                    listaPsicologo.add(psicologo);
                    System.out.println("Psicologo cadastrado com sucesso");
                    break;
                case 6:
                    System.out.println("********************LISTA DE PSICOLOGIA********************");
                    System.out.println(listaPsicologo);
                    break;
                case 7:
                    Pedagogo pedagogo  = new Pedagogo();
                    System.out.println("Nome do pedagogo: ");
                    nome = ler.next();
                    pedagogo.setNome(nome);

                    System.out.println("Qual o seu sexo (digite M - Mulher / H - Homem)? ");
                    sex = ler.next().charAt(0);
                    pedagogo.setSex(sex);

                    System.out.println("Digite o local de nascimento: ");
                    localNascimento = ler.next();
                    pedagogo.setNomeNascimento(localNascimento);

                    System.out.println("Digite a data de nascimento: ");
                    dataNascimento = ler.next();
                    pedagogo.setDataNascimento(dataNascimento);

                    System.out.println("Digite o CPF: ");
                    cpf = ler.next();
                    pedagogo.setCpf(cpf);

                    System.out.println("Digite o registro: ");
                    registro = ler.next();
                    pedagogo.setRegistro(registro);

                    listaPedagogo.add(pedagogo);
                    System.out.println("Pedagogo cadastrado com sucesso");
                    break;
                case 8:
                    System.out.println("********************LISTA DE PEDAGOGO********************");
                    System.out.println(listaPedagogo);
                    break;
                case 9:
                    Tecnico tecnico  = new Tecnico();
                    System.out.println("Nome do tecnico: ");
                    nome = ler.next();
                    tecnico.setNome(nome);

                    System.out.println("Qual o seu sexo (digite M - Mulher / H - Homem)? ");
                    sex = ler.next().charAt(0);
                    tecnico.setSex(sex);

                    System.out.println("Digite o local de nascimento: ");
                    localNascimento = ler.next();
                    tecnico.setNomeNascimento(localNascimento);

                    System.out.println("Digite a data de nascimento: ");
                    dataNascimento = ler.next();
                    tecnico.setDataNascimento(dataNascimento);

                    System.out.println("Digite o CPF: ");
                    cpf = ler.next();
                    tecnico.setCpf(cpf);

                    System.out.println("Digite o cargo: ");
                    cargo = ler.next();
                    tecnico.setCargo(cargo);

                    System.out.println("Digite a função: ");
                    funcao = ler.next();
                    tecnico.setFuncao(funcao);

                    System.out.println("Digite o ano de entrada: ");
                    anoEntrada = ler.next();
                    tecnico.setAnoEntrada(anoEntrada);

                    listaTecnico.add(tecnico);
                    System.out.println("Tecnico cadastrado com sucesso");
                    break;
                case 10:
                    System.out.println("********************LISTA DE TECNICO********************");
                    System.out.println(listaTecnico);
                    break;
                case 11:
                    Responsavel resposanvel  = new Responsavel();
                    System.out.println("Nome do Responsável: ");
                    nome = ler.next();
                    resposanvel.setNome(nome);

                    System.out.println("Qual o seu sexo (digite M - Mulher / H - Homem)? ");
                    sex = ler.next().charAt(0);
                    resposanvel.setSex(sex);

                    System.out.println("Digite o local de nascimento: ");
                    localNascimento = ler.next();
                    resposanvel.setNomeNascimento(localNascimento);

                    System.out.println("Digite a data de nascimento: ");
                    dataNascimento = ler.next();
                    resposanvel.setDataNascimento(dataNascimento);

                    System.out.println("Digite o CPF: ");
                    cpf = ler.next();
                    resposanvel.setCpf(cpf);

                    System.out.println("Digite o parentesco: ");
                    parentesco = ler.next();
                    resposanvel.setParentesco(parentesco);

                    System.out.println("Digite a renda: ");
                    renda = ler.nextDouble();
                    resposanvel.setRenda(renda);

                    listaResponsavel.add(resposanvel);
                    System.out.println("Responsável cadastrado com sucesso");
                    break;
                case 12:
                    System.out.println("********************LISTA DE RESPONSAVEL********************");
                    System.out.println(listaResponsavel);
                    break;
                case 13:
                    Candidato candidato  = new Candidato();
                    System.out.println("Nome do Candidato: ");
                    nome = ler.next();
                    candidato.setNome(nome);

                    System.out.println("Qual o seu sexo (digite M - Mulher / H - Homem)? ");
                    sex = ler.next().charAt(0);
                    candidato.setSex(sex);

                    System.out.println("Digite o local de nascimento: ");
                    localNascimento = ler.next();
                    candidato.setNomeNascimento(localNascimento);

                    System.out.println("Digite a data de nascimento: ");
                    dataNascimento = ler.next();
                    candidato.setDataNascimento(dataNascimento);

                    System.out.println("Digite o CPF: ");
                    cpf = ler.next();
                    candidato.setCpf(cpf);

                    System.out.println("Digite a data do concurso: ");
                    dataConcurso = ler.next();
                    candidato.setDataConcurso(dataConcurso);

                    System.out.println("Digite código de Concurso: ");
                    codConcurso = ler.nextInt();
                    candidato.setCodConcurso(codConcurso);

                    System.out.println("Digite a pontuacao do Concurso: ");
                    pontuacao = ler.nextInt();
                    candidato.setPontuacao(pontuacao);

                    listaCandidato.add(candidato);
                    System.out.println("Candidato cadastrado com sucesso");
                    break;
                case 14:
                    System.out.println("********************LISTA DE CANDIDATO********************");
                    System.out.println(listaCandidato);
                    break;
                case 15:
                    AssistenteSocial assistenteSocial  = new AssistenteSocial();
                    System.out.println("Nome do Candidato: ");
                    nome = ler.next();
                    assistenteSocial.setNome(nome);

                    System.out.println("Qual o seu sexo (digite M - Mulher / H - Homem)? ");
                    sex = ler.next().charAt(0);
                    assistenteSocial.setSex(sex);

                    System.out.println("Digite o local de nascimento: ");
                    localNascimento = ler.next();
                    assistenteSocial.setNomeNascimento(localNascimento);

                    System.out.println("Digite a data de nascimento: ");
                    dataNascimento = ler.next();
                    assistenteSocial.setDataNascimento(dataNascimento);

                    System.out.println("Digite o CPF: ");
                    cpf = ler.next();
                    assistenteSocial.setCpf(cpf);

                    System.out.println("Digite o registro do CRESS: ");
                    cress = ler.next();
                    assistenteSocial.setCress(cress);

                    System.out.println("Digite o número de alunos responsáveis: ");
                    numAlunos = ler.nextInt();
                    assistenteSocial.setNumAlunos(numAlunos);

                    listaAssistenteSocial.add(assistenteSocial);
                    break;
                case 16:
                    System.out.println("********************LISTA DE ASSISTENTE SOCIAL********************");
                    System.out.println(listaAssistenteSocial);
                    break;
                case 17:
                    Coordenador coordenador  = new Coordenador();
                    System.out.println("Nome do Candidato: ");
                    nome = ler.next();
                    coordenador.setNome(nome);

                    System.out.println("Qual o seu sexo (digite M - Mulher / H - Homem)? ");
                    sex = ler.next().charAt(0);
                    coordenador.setSex(sex);

                    System.out.println("Digite o local de nascimento: ");
                    localNascimento = ler.next();
                    coordenador.setNomeNascimento(localNascimento);

                    System.out.println("Digite a data de nascimento: ");
                    dataNascimento = ler.next();
                    coordenador.setDataNascimento(dataNascimento);

                    System.out.println("Digite o CPF: ");
                    cpf = ler.next();
                    coordenador.setCpf(cpf);

                    System.out.println("Digite o ano de entrada no cargo: ");
                    anoEntrada = ler.next();
                    coordenador.setAnoEntrada(anoEntrada);

                    System.out.println("Digite o ano de saída do cargo: ");
                    anoSaida = ler.next();
                    coordenador.setAnoSaida(anoSaida);

                    System.out.println("Digite a quantidade de anos no cargo: ");
                    qntAno = ler.nextInt();
                    coordenador.setQntAno(qntAno);

                    listaCoordenador.add(coordenador);
                    break;
                case 18:
                    System.out.println("********************LISTA DE COORDENADOR********************");
                    System.out.println(listaCoordenador);
                    break;
                case 19:
                    Egresso egresso  = new Egresso();
                    System.out.println("Nome do Candidato: ");
                    nome = ler.next();
                    egresso.setNome(nome);

                    System.out.println("Qual o seu sexo (digite M - Mulher / H - Homem)? ");
                    sex = ler.next().charAt(0);
                    egresso.setSex(sex);

                    System.out.println("Digite o local de nascimento: ");
                    localNascimento = ler.next();
                    egresso.setNomeNascimento(localNascimento);

                    System.out.println("Digite a data de nascimento: ");
                    dataNascimento = ler.next();
                    egresso.setDataNascimento(dataNascimento);

                    System.out.println("Digite o CPF: ");
                    cpf = ler.next();
                    egresso.setCpf(cpf);

                    System.out.println("Digite o ano que entrou no curso: ");
                    anoInicio = ler.next();
                    egresso.setAnoInicio(anoInicio);

                    System.out.println("Digite o ano de saída do curso: ");
                    anoConclusao = ler.next();
                    egresso.setAnoConclusao(anoConclusao);

                    System.out.println("Digite a quantidade de anos que demorou para se graduar: ");
                    anosGraduacao = ler.nextInt();
                    egresso.setAnosGraduacao(anosGraduacao);

                    System.out.println("Digite o nome do curso: ");
                    nomeCurso = ler.next();
                    egresso.setNomeCurso(nomeCurso);

                    listaEgresso.add(egresso);
                    break;
                case 20:
                    System.out.println("********************LISTA DE EGRESSO********************");
                    System.out.println(listaEgresso);
                    break;
            }
            opcao = ler.nextInt();
        }
    }
}