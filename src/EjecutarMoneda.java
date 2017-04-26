import java.util.*;
public class EjecutarMoneda {

	public static void main(String[] args) {
		Moneda cambio=new Moneda(289);//289 es el monto que tengo que devolver en monedas/billetes
		List<Element> monedas=new ArrayList<Element>();
		Element cien=new Element("100",1000,100,1); //String name,int count,double value, double weight
		Element veinticinco=new Element("25",1000,25,1); 
		Element diez=new Element("10",1000,10,1); 
		Element cinco=new Element("5",1000,5,1);
		Element uno=new Element("1",1000,1,1); 
		monedas.add(cien);
		monedas.add(veinticinco);
		monedas.add(diez);
		monedas.add(cinco);
		monedas.add(uno);
		List<Element> resultado= cambio.greed(monedas);
		for(Element r : resultado){
			System.out.println(r.getValue());
		}
	}

}
