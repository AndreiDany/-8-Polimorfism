
public class VagonCalatoriB extends VagonCalatori {

	public VagonCalatoriB() {
		super();
		this.capacitateCalatori = 50;
		this.capacitateColete = 400;
	}
	
	public void blocareGeamuri()
	{
		System.out.println("Geamurile s-au blocat!");
	}
	
	public String tipVagon()
	{
		return "VagonCalatoriB";
	}
}
