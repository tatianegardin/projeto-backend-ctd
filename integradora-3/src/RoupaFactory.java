import java.util.HashMap;
import java.util.Map;

public class RoupaFactory {
    private Map<String, Roupa> tamanhoXS, tamanhoS, tamanhoM, roupasImportadas, roupasUsadas;

    public RoupaFactory (){
        this.tamanhoXS = new HashMap<>();
        this.tamanhoS = new HashMap<>();
        this.tamanhoM = new HashMap<>();
        this.roupasUsadas = new HashMap<>();
        this.roupasImportadas = new HashMap<>();
    }

    public Roupa getRoupa (String tamanho, String tipo, String eNovo, String importada){
        String id = "id: " + tamanho + ":" + tipo+ ":" +eNovo+ ":" +importada;
        if(!enovo(eNovo)){
           if(roupasUsadas.containsKey(id)){
                return roupasUsadas.get(id);
           }
           roupasUsadas.put(id, new Roupa(tamanho, tipo, eNovo, importada));
        }
        //colocar outras validações para adicionar dentro das listas correspondentes, através de outros ifsssss
        return null;
    }

    public boolean enovo(String roupa){
        if(roupa.equalsIgnoreCase("novo")){
            return true;
        }
        return false;
    }

    public boolean importado(String roupa){
        if(roupa.equalsIgnoreCase("importado")){
            return true;
        }
        return false;
    }
}
