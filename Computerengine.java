package asd.one;

public class Computerengine {

	private ComputerBuilder cb;
	public void setComputerBuilder(ComputerBuilder cb)
	{
		this.cb=cb;
	}
	public Computer construct()
	{
	cb.buildCPU();
	cb.buildRAM();
	cb.buildmonitor();
	cb.buildharddisk();
	cb.buildmainframe();
	return cb.getcomputer();
	}
}
