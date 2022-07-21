package resolucion;

public class Fraccion {
    int AUX = 0;
	int numerador;
    int denominador;
    
    Fraccion(){
    	this.numerador=0;
    	this.denominador=0;
    	
    }
    
    Fraccion(int nume, int deno){
    	this.numerador=nume;
    	this.denominador=deno;
    }
    
    //METODO DE INSTANCIA;
    public void imprimirFraccion() {
    	System.out.println(this.numerador +"/"+this.denominador);
    }
    
    public void invertirSigno() {
    	this.numerador=this.numerador*-1;
    }
    
    public void invertirFraccion() {
    		AUX=this.denominador;
    		this.denominador=this.numerador;
    		this.numerador=AUX;

    }
    
    public double aDoulbe() {
    	double n =this.numerador;
    	double d=this.denominador;
    	return n/d;
    }
    
    public void reducir() {
    	int maxcd = mcd(this.numerador,this.denominador);
    	this.numerador=this.numerador/maxcd;
    	this.denominador=this.denominador/maxcd;
    }
    
    
    
    
    
    
    
    
   //METODO DE CLASE. 
    
    public static int mcd(int a, int b) {
    	if(a%b==0) {
    		return b;
    	}else {
    		return mcd(b,a%b);
    	}
    	
    	
    }
    
    
	public static Fraccion  fraccionProducto(Fraccion f1, Fraccion f2) {
		int n=f1.numerador*f2.numerador;
		int d=f1.denominador*f2.denominador;
		int m=mcd(n,d);
		Fraccion f3= new Fraccion(n/m,d/m);
		return f3;
    	
    }
	
	public static Fraccion  fraccionSuma(Fraccion f1, Fraccion f2) {
		int n_1=f1.numerador*f2.denominador;
		int n_2=f1.denominador*f2.numerador;
		int n=n_1+n_2;
		int d=f1.denominador*f2.denominador;
		int m=mcd(n,d);
		Fraccion f3= new Fraccion(n/m,d/m);
		return f3;
    	
    }
}
