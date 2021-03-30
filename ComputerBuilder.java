package asd.one;

public abstract class ComputerBuilder {

	protected Computer computer=new Computer();
	public abstract void buildCPU();
	public abstract void buildRAM();
	public abstract void buildharddisk();
	public abstract void buildmainframe();
	public abstract void buildmonitor();
	public Computer getcomputer()
	{
		return computer;
	}
}
