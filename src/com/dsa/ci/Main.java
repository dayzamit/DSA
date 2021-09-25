package com.dsa.ci;

import com.dsa.grap.Graph;
import com.dsa.grap.Vertices;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Graph graph=Graph.getSingleGraph();


        System.out.print("AdVertices" + graph.getAdjVerticesList(new Vertices("Bob")));
    }


}
