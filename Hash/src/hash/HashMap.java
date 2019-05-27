package hash;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashMap {
    private ArrayList<noHash> lista;
    private int TAM = 5;
    private int qtdElement = 0;
    
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
        
    void inserir(int chave, int valor){
         try {
            noHash aux;
            int key = hash(chave);
            if(lista.get(key) != null){
                aux = lista.get(key);
                while(aux != null){
                    if(aux.getProx() == null){
                        aux.setProx(new noHash(chave, valor));
                        qtdElement++;
                        return;
                    }
                    aux = aux.getProx();
                }
            } else{
                  aux = new noHash(chave, valor);
                  lista.set(key,aux);
                  qtdElement++;
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
        
      
   

    
   
    
   

