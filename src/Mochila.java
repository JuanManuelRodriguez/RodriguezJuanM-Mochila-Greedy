import java.util.List;


public class Mochila extends Greedy{
	private List<Element> monedas;
	private double tope;
	private int cantProd;
	public Mochila(double tope){
		super();
		this.tope=tope;
		this.cantProd=0;
	}
	@Override
	public boolean factible(List<Element> solution, Element element) {
		double suma=0;
		for(Element es : solution){
			suma+=es.getWeight();
		}
		if(suma+element.getWeight()<=tope){
			return true;
		}
		return false;
	}
	
}
