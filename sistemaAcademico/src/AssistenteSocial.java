public class AssistenteSocial extends Pessoa {
    //Escolhi criar um pessoa do tipo assistente social para cuidar da verificação dos auxilios dos alunos
    private String cress;
    private int numAlunos;
    public AssistenteSocial(String cpf) {
        super(cpf);
    }

    @Override
    double calcularRemuneracao() {
        return 0;
    }

    public String getCress() {
        return cress;
    }
    public void setCress(String cress) {
        this.cress = cress;
    }

    public int getNumAlunos() {
        return numAlunos;
    }
    public void setNumAlunos(int numAlunos) {
        this.numAlunos = numAlunos;
    }

    public String toString(){
        return super.toString()+"Número do CRESS: "+getCress()+"\n"+
                "Número de alunos para verificar: "+getNumAlunos()+"\n Remuneração extra: R$"+calcularRemuneracao();
    }
}