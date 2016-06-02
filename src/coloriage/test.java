package coloriage;
import java.awt.Color;


/**
 * Class testing the coloring algorithm
 * 
 * @author Cabourg Max & Masson Yoann
 * @version 1.0.0
 */
public class test {

	public static void main(String[] args) {
		
		//Initialisation du graph
		Vertex a,b,c,d ;
		a = new Vertex('a');
		b = new Vertex('b');
		c = new Vertex('c');
		d = new Vertex('d');
		Graph g = new Graph();
		
		//Ajout des arrêtes
		a.addEdge(b,true);
		b.addEdge(c,true);
		c.addEdge(d, true);
		d.addEdge(a, true);
		
		//Ajout des sommets dans le graph
		g.addVertex(a);
		g.addVertex(b);
		g.addVertex(c);
		g.addVertex(d);
		
		g.color(2);
		System.out.println(g);

	}

}
