package hash;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class HashMap {
    private ArrayList<noHash> lista;
    private int TAM = 5;
    
    
    void create(){
        if (lista == null){
           lista = new ArrayList<>();
           for(int i = 0; i < TAM; i++){
               lista.add(null);
            }        
        }
    }
    void inserir(int chave, int valor){
            noHash aux;
            int key = hash(chave);
            if(lista.get(key) != null){
                aux = lista.get(key);
                do{
                    if(aux == null){
                        aux = new noHash(chave, valor);
                        return;
                    }
                    aux = aux.getProx();
                }while(aux != null);
            } else{
                  aux = new noHash(chave, valor);
                  lista.set(key,aux);
            }
            
        }        
    int hash(int chave){
            return (chave % TAM) + 1;         
         }
    
    
    }
        
      
   

    
   
    
   

