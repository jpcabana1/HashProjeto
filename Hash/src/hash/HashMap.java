package hash;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashMap {
    private ArrayList<noHash> lista;
    private int TAM = 5;
    private int qtdElement = 0;
    private int qtdColisao = 0;
    
    void create(){
        try {
           if (lista == null){
                lista = new ArrayList<>();
                for(int i = 0; i < TAM; i++){
                    lista.add(null);
                }        
           }
        } catch (Exception e) {
            System.out.println("Erro!");         
        }
    }
     
    void destroy(){
        try {
            lista.clear();
            TAM = 0;
            qtdElement = 0;
            qtdColisao = 0;
        } catch (Exception e) {
            System.out.println("Erro ao destruir Tabela hash!");   
        }
        
    }
    void inserir(int chave, int valor){
         try {
            noHash aux, novo;
            int key = hash(chave);
            if(lista.get(key) != null){
                aux = lista.get(key);
                if(valor == aux.getValor()){
                    return;
                }
                else if(valor > aux.getValor()){
                      novo =  new noHash(chave, valor);
                      novo.setProx(aux);
                      lista.set(key, novo);
                      return;
                }
                else{                  
                    while(aux.getProx() != null){             
                            if (valor > aux.getValor()){
                                novo =  new noHash(chave, valor);
                                novo.setProx(aux);
                                aux.equals(novo);
                                return;
                            }                         
                        aux = aux.getProx();
                    }
                    if(valor > aux.getValor()){
                        novo =  new noHash(chave, valor);
                        novo.setProx(aux);
                        aux.equals(novo);
                        return;
                    }else{
                        aux.setProx(new noHash(chave, valor));                           
                        return;
                    }
                }                       
            }else{
                  aux = new noHash(chave, valor);
                  lista.set(key,aux);                 
            }  
             
            
        } catch (Exception e) {
            System.out.println("Erro!");         
        }          
    } 
    
    /*void ordena(int chave){
        noHash aux, aux2, temp;
        int key;
        try {
              key = hash(chave);             
              
                 aux = lista.get(key);
                 while()
                 aux2 = aux.getProx();
                  while(aux2 != null){
                      if(aux.getValor() > aux2.getValor()){
                          temp = aux;
                          aux = aux2;
                          aux2 = temp;
                      }
                      aux = aux2;
                      aux2 = aux2.getProx();
                  }
              
        } catch (Exception e) {
            System.out.println("Erro!");     
        }
    }
    */
    void exibeFileira(int chave){
        noHash aux;
        int key;
        try {
             key = hash(chave);
             aux = lista.get(key); 
             while(aux != null){
                 System.out.print(aux.getValor()+",");             
                 aux = aux.getProx();
             }
        } catch (Exception e) {
            System.out.println("Erro!");         
        }
    }
    
    void getVal(int chave, int val){       
        try {
            int hash = hash(chave);
            noHash aux;
            aux = lista.get(hash);
            if(aux.getValor() == val){
                System.out.println("Valor inserido!");
            }else{
                while(aux != null){
                    if(aux.getValor() == val){
                        System.out.println("Valor inserido!");
                        return;
                    }
                    aux = aux.getProx();
                }
               System.out.println("Elemento não encontrado!"); 
            }     
        } catch (Exception e) {
            System.out.println("Erro!");
        }
        
       
    }
    
    private int hash(int chave){
            return chave % TAM;         
    }

    public ArrayList<noHash> getLista() {
        return lista;
    }

    public void setLista(ArrayList<noHash> lista) {
        this.lista = lista;
    }

    public int getTAM() {
        return TAM;
    }

    public void setTAM(int TAM) {
        this.TAM = TAM;
    }

    public int getQtdElement() {
        return qtdElement;
    }

    public void setQtdElement(int qtdElement) {
        this.qtdElement = qtdElement;
    }
    
    
    
    
    }
        
      
   

    
   
    
   

