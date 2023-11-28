public class Psicologo extends Pessoa {
    private String especialidade;
    private String crp;

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCrp() {
        return crp;
    }

    public void setCrp(String crp) {
        this.crp = crp;
    }
    public String toString(){
        return super.toString()+"Especialidae: "+getEspecialidade()+"\n"+
                "CRP: "+getCrp();
    }
}
