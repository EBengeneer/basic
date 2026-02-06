package exception;

public class PlatNotDisponible  extends Exception{

	@Override
	public String toString() {
		return "PlatNotDisponible [] : Plat commandé n'est pas disponible";
	}
	

}
