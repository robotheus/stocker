package modelo;

public class Bem extends Entidade{
    private Setor setor;

    public Bem(String name, Setor setor){
        super(name);
        this.setor = setor;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public String toString() {
        if(setor.getUserChefe() != null) return super.toString() + ", setor = " + setor.getName() + ", responsavel = " + setor.getUserChefe().getName() + "]";
        else return super.toString() + ", setor = " + setor.getName() + "]";
    }
}
