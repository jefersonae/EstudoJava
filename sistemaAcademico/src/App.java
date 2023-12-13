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
        byte tempoServico;

        while(opcao != 0){
            switch (opcao){
                case 1:
                    System.out.println("Nome do aluno: ");
                    nome = ler.next();

                    System.out.println("Qual o seu sexo (digite M - Mulher / H - Homem)? ");
                    sex = ler.next().charAt(0);

                    System.out.println("Digite o local de nascimento: ");
                    localNascimento = ler.next();

                    System.out.println("Digite a data de nascimento: ");
                    dataNascimento = ler.next();

                    System.out.println("Digite o CPF: ");
                    cpf = ler.next();

                    System.out.println("Digite a nota 1: ");
                    nota1 = ler.nextFloat();

                    System.out.println("Digite a nota 2: ");
                    nota2 = ler.nextFloat();

                    Aluno aluno = new Aluno(cpf);

                    aluno.setNota1(nota1);
                    aluno.setNome(nome);
                    aluno.setNota2(nota2);
                    aluno.setDataNascimento(dataNascimento);
                    aluno.setNomeNascimento(localNascimento);
                    aluno.setSex(sex);

                    listaAlunos.add(aluno);
                    System.out.println("Aluno cadastrado com sucesso");
                    break;
                case 2:
                    System.out.println("********************LISTA DE ALUNOS********************");
                    System.out.println(listaAlunos);
                    break;
                case 3:
                    System.out.println("Nome do aluno: ");
                    nome = ler.next();

                    System.out.println("Qual o seu sexo (digite M - Mulher / H - Homem)? ");
                    sex = ler.next().charAt(0);

                    System.out.println("Digite o local de nascimento: ");
                    localNascimento = ler.next();

                    System.out.println("Digite a data de nascimento: ");
                    dataNascimento = ler.next();

                    System.out.println("Digite o CPF: ");
                    cpf = ler.next();

                    System.out.println("Digite a formação: ");
                    formacao = ler.next();

                    System.out.println("Digite a quantidade de disciplinas: ");
                    qntDisciplina = ler.nextByte();

                    System.out.println("Digite o tempo de serviço dele: ");
                    tempoServico = ler.nextByte();

                    Professor professor = new Professor(cpf, formacao);

                    professor.setNome(nome);
                    professor.setSex(sex);
                    professor.setNomeNascimento(localNascimento);
                    professor.setDataNascimento(dataNascimento);
                    professor.setQntDisciplina(qntDisciplina);
                    professor.setTempoServico(tempoServico);

                    listaProfessor.add(professor);
                    System.out.println("Professor cadastrado com sucesso");
                    System.out.println("Professor >>>"+professor);
                    break;
                case 4:
                    System.out.println("********************LISTA DE PROFESSORES********************");
                    System.out.println(listaProfessor);
                    break;
                case 5:
                    System.out.println("Nome do psicologo: ");
                    nome = ler.next();

                    System.out.println("Qual o seu sexo (digite M - Mulher / H - Homem)? ");
                    sex = ler.next().charAt(0);

                    System.out.println("Digite o local de nascimento: ");
                    localNascimento = ler.next();

                    System.out.println("Digite a data de nascimento: ");
                    dataNascimento = ler.next();

                    System.out.println("Digite o CPF: ");
                    cpf = ler.next();

                    System.out.println("Digite a especialidade: ");
                    especialidade = ler.next();

                    System.out.println("Digite o CRP: ");
                    crp = ler.next();

                    Psicologo psicologo = new Psicologo(cpf);

                    psicologo.setNome(nome);
                    psicologo.setSex(sex);
                    psicologo.setNomeNascimento(localNascimento);
                    psicologo.setEspecialidade(especialidade);
                    psicologo.setCrp(crp);
                    psicologo.setDataNascimento(dataNascimento);

                    listaPsicologo.add(psicologo);
                    System.out.println("Psicologo cadastrado com sucesso");
                    break;
                case 6:
                    System.out.println("********************LISTA DE PSICOLOGIA********************");
                    System.out.println(listaPsicologo);
                    break;
                case 7:
                    System.out.println("Nome do pedagogo: ");
                    nome = ler.next();

                    System.out.println("Qual o seu sexo (digite M - Mulher / H - Homem)? ");
                    sex = ler.next().charAt(0);

                    System.out.println("Digite o local de nascimento: ");
                    localNascimento = ler.next();

                    System.out.println("Digite a data de nascimento: ");
                    dataNascimento = ler.next();

                    System.out.println("Digite o CPF: ");
                    cpf = ler.next();

                    System.out.println("Digite o registro: ");
                    registro = ler.next();

                    Pedagogo pedagogo  = new Pedagogo(cpf);

                    pedagogo.setNome(nome);
                    pedagogo.setRegistro(registro);
                    pedagogo.setDataNascimento(dataNascimento);
                    pedagogo.setNomeNascimento(localNascimento);
                    pedagogo.setSex(sex);

                    listaPedagogo.add(pedagogo);
                    System.out.println("Pedagogo cadastrado com sucesso");
                    break;
                case 8:
                    System.out.println("********************LISTA DE PEDAGOGO********************");
                    System.out.println(listaPedagogo);
                    break;
                case 9:
                    System.out.println("Nome do tecnico: ");
                    nome = ler.next();

                    System.out.println("Qual o seu sexo (digite M - Mulher / H - Homem)? ");
                    sex = ler.next().charAt(0);

                    System.out.println("Digite o local de nascimento: ");
                    localNascimento = ler.next();

                    System.out.println("Digite a data de nascimento: ");
                    dataNascimento = ler.next();

                    System.out.println("Digite o CPF: ");
                    cpf = ler.next();

                    System.out.println("Digite o cargo: ");
                    cargo = ler.next();

                    System.out.println("Digite a função: ");
                    funcao = ler.next();

                    System.out.println("Digite o ano de entrada: ");
                    anoEntrada = ler.next();

                    Tecnico tecnico  = new Tecnico(cpf);

                    tecnico.setNome(nome);
                    tecnico.setSex(sex);
                    tecnico.setNomeNascimento(localNascimento);
                    tecnico.setDataNascimento(dataNascimento);
                    tecnico.setCargo(cargo);
                    tecnico.setFuncao(funcao);
                    tecnico.setAnoEntrada(anoEntrada);

                    listaTecnico.add(tecnico);
                    System.out.println("Tecnico cadastrado com sucesso");
                    break;
                case 10:
                    System.out.println("********************LISTA DE TECNICO********************");
                    System.out.println(listaTecnico);
                    break;
                case 11:
                    System.out.println("Nome do Responsável: ");
                    nome = ler.next();

                    System.out.println("Qual o seu sexo (digite M - Mulher / H - Homem)? ");
                    sex = ler.next().charAt(0);

                    System.out.println("Digite o local de nascimento: ");
                    localNascimento = ler.next();

                    System.out.println("Digite a data de nascimento: ");
                    dataNascimento = ler.next();

                    System.out.println("Digite o CPF: ");
                    cpf = ler.next();

                    System.out.println("Digite o parentesco: ");
                    parentesco = ler.next();

                    System.out.println("Digite a renda: ");
                    renda = ler.nextDouble();

                    Responsavel responsavel  = new Responsavel(cpf);

                    responsavel.setNome(nome);
                    responsavel.setSex(sex);
                    responsavel.setNomeNascimento(localNascimento);
                    responsavel.setParentesco(parentesco);
                    responsavel.setRenda(renda);
                    responsavel.setDataNascimento(dataNascimento);

                    listaResponsavel.add(responsavel);
                    System.out.println("Responsável cadastrado com sucesso");
                    break;
                case 12:
                    System.out.println("********************LISTA DE RESPONSAVEL********************");
                    System.out.println(listaResponsavel);
                    break;
                case 13:
                    System.out.println("Nome do Candidato: ");
                    nome = ler.next();

                    System.out.println("Qual o seu sexo (digite M - Mulher / H - Homem)? ");
                    sex = ler.next().charAt(0);

                    System.out.println("Digite o local de nascimento: ");
                    localNascimento = ler.next();

                    System.out.println("Digite a data de nascimento: ");
                    dataNascimento = ler.next();

                    System.out.println("Digite o CPF: ");
                    cpf = ler.next();

                    System.out.println("Digite a data do concurso: ");
                    dataConcurso = ler.next();

                    System.out.println("Digite código de Concurso: ");
                    codConcurso = ler.nextInt();

                    System.out.println("Digite a pontuacao do Concurso: ");
                    pontuacao = ler.nextInt();

                    Candidato candidato  = new Candidato(cpf);

                    candidato.setSex(sex);
                    candidato.setNome(nome);
                    candidato.setNomeNascimento(localNascimento);
                    candidato.setDataNascimento(dataNascimento);
                    candidato.setDataConcurso(dataConcurso);
                    candidato.setCodConcurso(codConcurso);
                    candidato.setPontuacao(pontuacao);

                    listaCandidato.add(candidato);
                    System.out.println("Candidato cadastrado com sucesso");
                    break;
                case 14:
                    System.out.println("********************LISTA DE CANDIDATO********************");
                    System.out.println(listaCandidato);
                    break;
                case 15:
                    System.out.println("Nome do Candidato: ");
                    nome = ler.next();

                    System.out.println("Qual o seu sexo (digite M - Mulher / H - Homem)? ");
                    sex = ler.next().charAt(0);

                    System.out.println("Digite o local de nascimento: ");
                    localNascimento = ler.next();

                    System.out.println("Digite a data de nascimento: ");
                    dataNascimento = ler.next();

                    System.out.println("Digite o CPF: ");
                    cpf = ler.next();

                    System.out.println("Digite o registro do CRESS: ");
                    cress = ler.next();

                    System.out.println("Digite o número de alunos responsáveis: ");
                    numAlunos = ler.nextInt();

                    AssistenteSocial assistenteSocial  = new AssistenteSocial(cpf);

                    assistenteSocial.setNome(nome);
                    assistenteSocial.setSex(sex);
                    assistenteSocial.setNomeNascimento(localNascimento);
                    assistenteSocial.setDataNascimento(dataNascimento);
                    assistenteSocial.setNumAlunos(numAlunos);
                    assistenteSocial.setCress(cress);

                    listaAssistenteSocial.add(assistenteSocial);
                    break;
                case 16:
                    System.out.println("********************LISTA DE ASSISTENTE SOCIAL********************");
                    System.out.println(listaAssistenteSocial);
                    break;
                case 17:
                    System.out.println("Nome do Candidato: ");
                    nome = ler.next();

                    System.out.println("Qual o seu sexo (digite M - Mulher / H - Homem)? ");
                    sex = ler.next().charAt(0);

                    System.out.println("Digite o local de nascimento: ");
                    localNascimento = ler.next();

                    System.out.println("Digite a data de nascimento: ");
                    dataNascimento = ler.next();

                    System.out.println("Digite o CPF: ");
                    cpf = ler.next();

                    System.out.println("Digite o ano de entrada no cargo: ");
                    anoEntrada = ler.next();

                    System.out.println("Digite o ano de saída do cargo: ");
                    anoSaida = ler.next();

                    System.out.println("Digite a quantidade de anos no cargo: ");
                    qntAno = ler.nextInt();

                    Coordenador coordenador  = new Coordenador(cpf);

                    coordenador.setNome(nome);
                    coordenador.setSex(sex);
                    coordenador.setNomeNascimento(localNascimento);
                    coordenador.setDataNascimento(dataNascimento);
                    coordenador.setQntAno(qntAno);
                    coordenador.setAnoSaida(anoSaida);
                    coordenador.setAnoEntrada(anoEntrada);

                    listaCoordenador.add(coordenador);
                    break;
                case 18:
                    System.out.println("********************LISTA DE COORDENADOR********************");
                    System.out.println(listaCoordenador);
                    break;
                case 19:
                    System.out.println("Nome do Candidato: ");
                    nome = ler.next();

                    System.out.println("Qual o seu sexo (digite M - Mulher / H - Homem)? ");
                    sex = ler.next().charAt(0);

                    System.out.println("Digite o local de nascimento: ");
                    localNascimento = ler.next();

                    System.out.println("Digite a data de nascimento: ");
                    dataNascimento = ler.next();

                    System.out.println("Digite o CPF: ");
                    cpf = ler.next();

                    System.out.println("Digite o ano que entrou no curso: ");
                    anoInicio = ler.next();

                    System.out.println("Digite o ano de saída do curso: ");
                    anoConclusao = ler.next();

                    System.out.println("Digite a quantidade de anos que demorou para se graduar: ");
                    anosGraduacao = ler.nextInt();

                    System.out.println("Digite o nome do curso: ");
                    nomeCurso = ler.next();

                    Egresso egresso  = new Egresso(cpf);

                    egresso.setNome(nome);
                    egresso.setSex(sex);
                    egresso.setNomeNascimento(localNascimento);
                    egresso.setDataNascimento(dataNascimento);
                    egresso.setAnoInicio(anoInicio);
                    egresso.setNomeCurso(nomeCurso);
                    egresso.setAnosGraduacao(anosGraduacao);
                    egresso.setAnoConclusao(anoConclusao);

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