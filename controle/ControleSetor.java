package controle;

import java.util.ArrayList;
import modelo.*;
import persistencia.BancoDeDados;

public class ControleSetor{
    BancoDeDados banco = BancoDeDados.getInstance();

    public void cadastra(String name){
        Setor novoSetor = new Setor(name);
        banco.getPersistenteSetor().adicionarObjeto(novoSetor);
    }
    
    public String remove(String name){
        try{
            Entidade setorRemovido = banco.getPersistenteSetor().buscaPorName(name);
            banco.getPersistenteSetor().removerObjeto(setorRemovido);
            return "true";
        } catch(Exception e){
            String mensagem = e.toString();
            String[] msg = mensagem.split(":");
            return msg[1];
        }
    }
    
    public void altera(String novoChefe, String setor){
        try{
            Setor aux1 = (Setor) banco.getPersistenteSetor().buscaPorName(setor);
            Usuario aux2 = (Usuario) banco.getPersistenteUsuario().buscaPorName(novoChefe);
                            
            aux1.setUserChefe(aux2);
        } catch(Exception e){

        }
    }
    
    public String visualiza(int id){
        try{
            Entidade aux3 = banco.getPersistenteSetor().buscaPorId(id);
            return aux3.toString();
        } catch(Exception e){
            String mensagem = e.toString();
            String[] msg = mensagem.split(":");
            return msg[1];
        }
    }

    public ArrayList<Entidade> visualizaTodos(){
        ArrayList<Entidade> list = new ArrayList<Entidade>();
        
        try{
            list = banco.getPersistenteSetor().visualizarTudo();
            return list;
        } catch(Exception e){
            return list;
        }
    }
}
