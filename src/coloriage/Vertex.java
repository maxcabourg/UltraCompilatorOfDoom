package coloriage;
import java.awt.Color;
import java.util.*;

/**
 * Class representing Vertex in a graph, in order to complete the coloring algorithm
 * 
 * @author Cabourg Max & Masson Yoann
 * @version 1.0.0
 */
public class Vertex {

	private List<Vertex> interference ;
	private List<Vertex> preference ;
	private char label;
	private String color ="Pas de couleur";

	public Vertex(char label){
		this.label = label;
		interference = new ArrayList<Vertex>();
		preference = new ArrayList<Vertex>();
	}

	/**
	 *  Add an edge to the between a and b 
	 * @param dest destination
	 * @param interference if true interference otherwise preference
	 */
	public void addEdge(Vertex dest,boolean interference) {
		if(interference){
			this.interference.add(dest);	
		}else{
			this.preference.add(dest);
		}
		dest.addEdgeFinal(this, interference);
	}

	private void addEdgeFinal(Vertex dest, boolean interference) {
		if(interference){
			this.interference.add(dest);	
		}else{
			this.preference.add(dest);
		}
	}

	/**
	 * Return the degree of the vertex
	 * @return the vertex's degree
	 */
	public int degree(){
		return interference.size();
	}

	/**
	 * Test if the vertex is "k coloriable" (in French in the text);
	 * @param k number of register available
	 * @return if the degree is strictly lesser than k
	 */
	public boolean kColoriable(int k){
		return this.degree() < k;
	}

	/**
	 * Get the interference list of the vertex
	 * @return List of vertices
	 */
	public List<Vertex> getInterference() {
		return interference;
	}

	/**
	 * Get the preference list of the vertex
	 * @return List of vertices
	 */
	public List<Vertex> getPreference() {
		return preference;
	}

	public void setColor(){
		boolean available;
		for(int i = 0; i< 10 ;i++){
			available = true;
			String color = Graph.tabColor[i];
			for(Vertex v:this.interference){
				if(v.color.equals(color)){
					available = false;
				}
			}
			if(available){
				this.color = color;
				break;
			}
		}
	}
	
	public void spill(){
		this.color=new String("Spill");
	}
	@Override
	public String toString(){
		if(this.color == null){
			return new String(this.label+" Pas de couleur pour le moment");
		}else{
			return new String(this.label+" "+color);
		}
	}

}
