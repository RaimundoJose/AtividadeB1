
public class Q1 {

	
 	

		String  vent;
	    int temp;
	    boolean ligado;
	    String modo;

	    void Ligar(){
	        this.ligado = true;
	        System.out.println("O Ar está ligado!");
	    }
	     
	    public Q1(String vent, int temp, boolean ligado, String modo) {
			super();
			this.vent = vent;
			this.temp = temp;
			this.ligado = ligado;
			this.modo = modo;
		}

		
	  

	      void Diminuir_Temp(int valor){
	       this.temp = valor;

	    }

		void Aumentar_Temp(int valor){
		this.temp = valor;

	    	}
		void Aumentar_Vent(String  valor){
		this.vent = valor;
	    	}
	       void Modo(String modo){
	        this.modo = modo;
	       }

	    
	   
	}

