package modelo;

public class Setor extends Entidade{
    private Usuario userChefe;

    public Setor(String name){
        super(name);
        this.userChefe = null;
    }

    public Usuario getUserChefe() {
        return userChefe;
    }

    public void setUserChefe(Usuario userChefe) {
        this.userChefe = userChefe;
    }

    public String toString() {
        return super.toString() + ", [userChefe = " + userChefe + "]";
    }  
}
