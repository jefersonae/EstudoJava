public class Responsavel extends Pessoa{
    private String parentesco;
    private double renda;
    public String getParentesco() {
        return parentesco;
    }
    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }
    public double getRenda() {
        return renda;
    }
    public void setRenda(double renda) {
        this.renda = renda;
    }
    public String toString() {
        return super.toString()+"Parantesco: "+getParentesco()+"\n"+
                "Renda: "+getRenda()+"\n";
    }
}