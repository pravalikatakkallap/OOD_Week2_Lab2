public class Server extends Computer {

	private String ram;
	private String hdd;
	private String cpu;
	
	public Server(String ram, String hdd, String cpu){
		this.ram=ram;
		this.hdd=hdd;
		this.cpu=cpu;
	}
	@Override
	public String get_ram() {
		return this.ram;
	}

	@Override
	public String get_hdd() {
		return this.hdd;
	}

	@Override
	public String get_cpu() {
		return this.cpu;
	}

}