public class Aluno extends Pessoa {
    private float nota1;
    private float nota2;

    public Aluno(String cpf) {
        super(cpf);
    }

    public float getNota1() {
        return nota1;
    }

    public void setNota1(float nota1) {
        this.nota1 = nota1;
    }

    public float getNota2() {
        return nota2;
    }

    public void setNota2(float nota2) {
        this.nota2 = nota2;
    }

    public double calcularMedia(){
        return (this.nota1 + this.nota2)/2;
    }

    @Override
    double calcularRemuneracao() {
        if (calcularMedia() >= 7){
            return 400;
        }else{
            return 0;
        }
    }

    public String toString(){
        return super.toString()+"Nota 1: "+getNota1()+"\n"+
                "Nota 2: "+getNota2()+"\n Remuneração extra: R$"+calcularRemuneracao();
    }
}
