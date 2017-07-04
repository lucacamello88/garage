package Model;

 class EnumTest {
	   Tipo tipo;
	    
	    public EnumTest(Tipo tipo) {
	        this.tipo = tipo;
	    }
	    
	    public void tipoVeicolo() {
	        switch (tipo) {
	            case AUTO:
	                System.out.println("AUTO");
	                break;
	                    
	            case MOTO:
	                System.out.println("MOTO");
	                break;
	                         
	            case CAMION: 
	                System.out.println("CAMION");
	                break;
	                        
	            default:
	                System.out.println("NULL");
	                break;
	        }
	    }
public static class Main {

	
	
	
	public static void main(String[] args) {
		  EnumTest Auto = new EnumTest(Tipo.AUTO);
	        Auto.tipoVeicolo();
	        EnumTest Moto = new EnumTest(Tipo.MOTO);
	        Moto.tipoVeicolo();
	        EnumTest Camion = new EnumTest(Tipo.CAMION);
	        Camion.tipoVeicolo();
	       
	        

	}
	}
}

