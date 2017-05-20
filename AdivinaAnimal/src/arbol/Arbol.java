package arbol;

public class Arbol {

    public String carga;
    public Arbol izquierdo;
    public Arbol derecho;
      
public Arbol(String carga){
    this.carga = carga;}

public Arbol(String carga, Arbol izquierdo, Arbol derecho){
    this.carga = carga;
    this.izquierdo = izquierdo;
    this.derecho = derecho;}

    @Override
    public String toString() {
        return this.carga; 
    }


    public String getCarga(){
        return this.carga;
    }
    
    public void setCarga(String carga){
        this.carga = carga;
    }
    
    public Arbol getDerecho(){
        return this.derecho;
    }
    
    public void setDerecho(Arbol derecho){
        this.derecho = derecho;
    }
    
    public Arbol getIzquierdo(){
        return this.izquierdo;
    }
    
    public void setIzquierdo(Arbol izquierdo){
        this.izquierdo = izquierdo;
    }
    
    public int total(Arbol arbol){
        if(arbol == null ){
            return 0;
        }
        return total(arbol.izquierdo) + total(arbol.derecho) + Integer.parseInt(this.carga);
    }
    
    public void imprimirArbol(Arbol arbol){
        if (arbol == null){
            return;
        }
        System.out.print(arbol);
        imprimirArbol(arbol.izquierdo);
        imprimirArbol(arbol.derecho);
    }
    
    public void imprimirArbolPostOrden(Arbol this){
        if (this == null){
            return;
        }
        
        imprimirArbolPostOrden(this.izquierdo);
        imprimirArbolPostOrden(this.derecho);
        System.out.print(this);
    }
    
    public void imprimirArbolPostOrden(Arbol arbol){
		if (this == null ) {return;}
		imprimirArbolPostOrden(this.izquierdo);
		imprimirArbolPostOrden(this.derecho);
		System.out.println(arbol);}
    
    public void imprimirArbolEnOrden(Arbol arbol){
		if (this == null ){ return;}
		imprimirArbolEnOrden(this.izquierdo);
		System.out.print(this);
		imprimirArbolEnOrden(this.derecho);}
        
    public void imprimirArbolIndentado(Arbol arbol , int level) {
		if (this == null ){ return;}
		imprimirArbolIndentado(this.derecho, level+1);
		System.out.println(' ' * level + (this.carga));
		imprimirArbolIndentado(this.izquierdo, level+1); }

}   
    
    
