package coloriage;
import java.util.*;


/**
 * Class representing graph, in order to complete the coloring algorithm
 * 
 * @author Cabourg Max & Masson Yoann
 * @version 1.0.0
 */
public class Graph {

	private List<Vertex> vertices;
	private static int compteur = 0;
	public static String[] tabColor = {"Blue","Red","Green","Yellow","Purple","Orange","Pink","Black","White","Grey"};

	public Graph(){
		this.vertices = new ArrayList<Vertex>();
	}

	/**
	 * Add a vertex in the graph
	 * @param a vertex to add
	 */
	public void addVertex(Vertex a){
		this.vertices.add(a);
	}

	public static String getColor(){
		compteur++;
		return tabColor[compteur-1];

	}



	/**
	 * Return a kColoriable Vertex
	 * @param k number of available register
	 * @return a kColoriable vertex or null if the graph has no kColoriable vertex
	 */
	public Vertex getKColoriable(int k){
		Vertex v = null;
		for(Vertex vertex : this.vertices){
			if(vertex.kColoriable(k)){
				v = vertex;
			}
		}
		return v;
	}

	/**
	 * Return the Vertex which has the highest degree
	 * @return the Vertex which has the highest degree
	 */
	public Vertex getHighestDegree(){
		Vertex v = vertices.get(0);
		for(Vertex vertex : this.vertices){
			if(vertex.degree() > v.degree()){
				v = vertex;
			}
		}
		return v;
	}

	public void setVertices(List<Vertex> vertices) {
		this.vertices = vertices;
	}

	public List<Vertex> getVertices() {
		return this.vertices;
	}

	/**
	 * Return a new liste without the remove vertex, DOES NOT REMOVE THE VERTEX FROM THE CURRENT LIST
	 * @param remove verex to remove
	 * @return a new list without "remove"
	 */
	private List<Vertex> removeVertex(Vertex remove){
		List<Vertex> list = new ArrayList<Vertex>();
		for(Vertex v:this.vertices){
			if(v != remove){
				list.add(v);
				v.getInterferenceWork().remove(remove);
			}
		}
		return list;
	}

	/**
	 * Colors the graph with the pessimist Chaitin algorithm
	 * @param k number of available register
	 */
	public void color(int k) {
		if(this.vertices.size() > 0){//Le graphe n'est pas vide, sinon on s'arrï¿½te
			Vertex kColoriable = this.getKColoriable(k);
			if(kColoriable != null){
				Graph G_s = new Graph();// Construction G privï¿½ de S
				List<Vertex> listeTemp = this.removeVertex(kColoriable);
				G_s.setVertices(listeTemp);
				G_s.color(k);//Récursivité
				kColoriable.setColor();//Attribution de la couleur au sommet k coloriable
				kColoriable.reInitialiseWork();
			}else{
				Vertex spill = getHighestDegree();
				Graph G_s = new Graph();// Construction G privé de S
				List<Vertex> listeTemp = this.removeVertex(spill);
				G_s.setVertices(listeTemp);
				G_s.color(k);//Récursivité
				spill.spill();//On attribue spill
				spill.reInitialiseWork();//On reconstruit le graph
			}
		}

	}
	
	@Override
	public String toString(){
		String acc = new String("Graph("+this.vertices.size()+" sommets): \n");
		for(Vertex v:vertices){
			acc += v.toString()+"\n";
		}
		return acc;
	}

}

