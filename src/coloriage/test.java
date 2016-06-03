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
		Vertex t,u,v,x,y,z ;
		t = new Vertex('t');
		u = new Vertex('u');
		v = new Vertex('v');
		x = new Vertex('x');
		y = new Vertex('y');
		z = new Vertex('z');
		Graph g = new Graph();
		
		//Ajout des arr�tes
		z.addEdge(v,true);
		v.addEdge(t,true);
		t.addEdge(y,true);
		y.addEdge(x,true);
		z.addEdge(v,true);
		x.addEdge(u,true);
		y.addEdge(u,true);
		u.addEdge(t, false);
		//Ajout des sommets dans le graph
		g.addVertex(t);
		g.addVertex(u);
		g.addVertex(v);
		g.addVertex(x);
		g.addVertex(y);
		g.addVertex(z);
		
		g.color(1);
		System.out.println(g);

	}

}
