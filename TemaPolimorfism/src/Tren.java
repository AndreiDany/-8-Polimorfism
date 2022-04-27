
public class Tren {
	
	private Vagon[] vagoane = new Vagon[15];

	public Tren(Vagon[] vagoane) {
		this.vagoane = vagoane;
	}
	
	public boolean equals(Tren tren)
	{
		int capacitateTotalaColete1 = 0;
		int capacitateTotalaColete2 = 0;
		
		for(int i=0; i<tren.vagoane.length; i++)
		{
			capacitateTotalaColete1 = capacitateTotalaColete1 +
					tren.vagoane[i].capacitateColete;
		}
		
		for(int i=0; i<this.vagoane.length; i++)
		{
			capacitateTotalaColete2 = capacitateTotalaColete2 +
					this.vagoane[i].capacitateColete;
		}
		
		if(capacitateTotalaColete1 == capacitateTotalaColete2)
			return true;
		else
			return false;
	}
	
	public void afisareVagoane()
	{
		for(int i=0; i<this.vagoane.length; i++)
		{
			System.out.println(this.vagoane[i].tipVagon() + "\n");
		}
	}
}
