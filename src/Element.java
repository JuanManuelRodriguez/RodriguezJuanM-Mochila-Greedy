import java.util.Comparator;


public class Element implements Comparable<Element>{
	private String name;
	private int count;
	private double value;
	private double weight;
	private double benefit;
	public Element(String name,int count,double value, double weight){
		this.name=name;
		this.count=count;
		this.value=value;
		this.weight=weight;
		this.benefit=this.value/this.weight;
	}
	public double getBenefit() {
		return benefit;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public String getName() {
		return name;
	}
	public int compareTo(Element e){
		if(this.benefit-e.getBenefit()>0){
			return -1;
		}else if(this.benefit-e.getBenefit()<0){
			return 1;
		}
		return 0;
	}
	public double getValue() {
		return value;
	}
	public double getWeight() {
		return weight;
	}
	
}
