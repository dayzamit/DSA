package com.dsa.grap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {


    Map<Vertices, List<Vertices>> adjVertices= new HashMap<>();

    private static Graph single_instance = null;



     public static Graph createGraph() {
        Graph graph = new Graph();
        Vertices bob = new Vertices("Bob");
        Vertices alice = new Vertices("Alice");
        Vertices mark = new Vertices("Mark");
        Vertices rob = new Vertices("Rob");
        Vertices maria = new Vertices("Maria");
        graph.addVertex(bob);
        graph.addVertex(alice);
        graph.addVertex(mark);
        graph.addVertex(rob);
        graph.addVertex(maria);
        graph.addEdges(bob, alice);
        graph.addEdges(bob, rob);
        graph.addEdges(alice, mark);
        graph.addEdges(rob, mark);
        graph.addEdges(alice, maria);
        graph.addEdges(rob, maria);
        return graph;
    }


    public static Graph getSingleGraph()
    { if(single_instance==null)
    {
        single_instance=new Graph();
        single_instance=createGraph();


    }
        return single_instance;
    }


    public void addVertex(Vertices vertxName) {
       List<Vertices> adjvList =new ArrayList<>();
        adjvList.add(vertxName);
        adjVertices.putIfAbsent(vertxName,adjvList);
    }

    public void removeVertex(Vertices verticesName) {
        adjVertices.remove(verticesName);
    }

    public void addEdges(Vertices v1, Vertices v2) {
        adjVertices.get(v1).add(v2);
        adjVertices.get(v2).add(v1);
    }

    public List<Vertices> getAdjVerticesList(Vertices vertices) {
        return adjVertices.get(vertices);
    }

    public void removeEdges(Vertices v1, Vertices v2) {
        List<Vertices> eV1 = adjVertices.get(v1);
        List<Vertices> eV2 = adjVertices.get(v1);

        if (v1 != null) {
            eV1.remove(v1);
        }
        if (v2 != null) {
            eV2.remove(v2);
        }


    }


}
