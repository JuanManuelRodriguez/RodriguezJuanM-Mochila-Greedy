import java.util.List;


public class Moneda extends Greedy{
	private List<Element> monedas;
	private double tope;
	public Moneda(double tope){
		super();
		this.tope=tope;
	}
	@Override
	public boolean factible(List<Element> solution, Element element) {
		double suma=0;
		for(Element es : solution){
			suma+=es.getValue();
		}
		if(suma+element.getValue()<=tope){
			return true;
		}
		return false;
	}
}
