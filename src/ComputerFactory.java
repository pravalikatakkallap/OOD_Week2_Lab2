public class ComputerFactory {

	public static Computer getComputer(String TYPE, String RAM, String HDD, String CPU){
		if("PC".equalsIgnoreCase(TYPE)) return new PC(RAM, HDD, CPU);
		else if("Server".equalsIgnoreCase(TYPE)) return new Server(RAM, HDD, CPU);
		
		return null;
	}
}