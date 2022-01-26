public abstract class Computer {
	
	public abstract String get_ram();
	public abstract String get_hdd();
	public abstract String get_cpu();
	
	@Override
	public String toString(){
		return "ram= "+this.get_ram()+", hdd="+this.get_hdd()+", cpu="+this.get_cpu();
	}
}