public class Professor extends Pessoa {
    private String formacao;
    private byte qntDisciplina;

    public String getFormacao() {
        return formacao;
    }

    public void setFormacao(String formacao) {
        this.formacao = formacao;
    }

    public byte getQntDisciplina() {
        return qntDisciplina;
    }

    public void setQntDisciplina(byte qntDisciplina) {
        this.qntDisciplina = qntDisciplina;
    }
}
