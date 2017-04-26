

import java.util.ArrayList;
import java.util.List;

public class EjecutarMochila {

	public static void main(String[] args) {
		Mochila mochila=new Mochila(20);//20kg es el peso max que aguanta la mochila
		List<Element> productos=new ArrayList<Element>();
		
		//String name,int count,double value, double weight
		Element agua=new Element("agua",1000,50,1); //elemento "agua" - cant: 1000 - valor: 50 - peso:1kg
		Element aceite=new Element("aceite",10,12000,1); //elemento "aceite" - cant: 10 - valor: 12000 - peso:1kg
		Element azucar=new Element("azucar",1000,600,2); //elemento "azucar" - cant: 1000 - valor: 600 - peso:2kg
		productos.add(agua);
		productos.add(aceite);
		productos.add(azucar);
		List<Element> resultado= mochila.greed(productos);
		for(Element r : resultado){
			System.out.println(r.getValue());
		}

	}

}