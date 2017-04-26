import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public abstract class Greedy {
	private List<Element> solution;
	public Greedy(){
		solution=new ArrayList<Element>();
	}
	public List<Element> order(List<Element> candidates){
		Collections.sort(candidates);
		return candidates;
	}
	public List<Element> greed(List<Element> candidates){
		List<Element> candidates2=this.order(candidates);
		for(Element r : candidates2){
			System.out.println(r.getValue());
		} // candidatos
		int cant;
		for (int i=0;i<candidates2.size();i++) {
			cant=0;
			if(!solution.contains(candidates2.get(i))){
				while(this.factible(solution,candidates2.get(i)) && cant<candidates2.get(i).getCount()){
					solution.add(candidates2.get(i));
					cant++;
				}
			}
			System.out.println("moneda usada en este momento "+candidates2.get(i).getValue());
		}
		return solution;
	}
	public abstract boolean factible(List<Element> solution2, Element element);
}
