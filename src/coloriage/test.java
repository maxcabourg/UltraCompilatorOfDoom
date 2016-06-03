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
		v.addEdge(x,true);
		t.addEdge(y,true);
		y.addEdge(x,true);
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

		System.out.println("////////////////////////////////Graphe de la diapo 10 du cours 7 avec k=3/////////////////////////////////////////////");
		g.color(3);
		System.out.println(g);

		System.out.println("////////////////////////////////Graphe de la diapo 10 du cours 7 avec k=2/////////////////////////////////////////////");
		g.color(2);
		System.out.println(g);
	}

}
