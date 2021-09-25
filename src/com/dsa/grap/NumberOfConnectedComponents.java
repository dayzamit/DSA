package com.dsa.grap;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class NumberOfConnectedComponents {

    public static void main(String[] args) {

        //graph edges
        int[][] edgs = {{0, 1}, {1, 2}, {3, 4}};
        //Vertices
        int vertices = 5;

        System.out.println(connectedcount(vertices, edgs));

    }

    public static int connectedcount(int numOfVertices, int[][] edges) {
        boolean[] visitedNodes= new boolean[numOfVertices];
        List[] adjList = new ArrayList[numOfVertices];

        for(int i=0; i<adjList.length; i++){
            adjList[i] = new ArrayList<Integer>();
        }

        //create adjcency list
        for (int[] ed :edges)
        {
            int from=ed[0];
            int to=ed[1];

            adjList[from].add(to);
            adjList[to].add(from);
        }

        Stack<Integer> nodeStackContainer= new Stack<>();

        int ans=0; // ans = count of how many times DFS is carried out

        for (int stackNodeItem=0;stackNodeItem<numOfVertices;stackNodeItem++)
            // if a node is not visited
            if (!visitedNodes[stackNodeItem]) {
                ans++;
                nodeStackContainer.push(stackNodeItem);

                while (!nodeStackContainer.isEmpty()) {
                    int currentItem = nodeStackContainer.peek(); //fecth top item of stack
                    nodeStackContainer.pop(); //remove top item of stack
                    visitedNodes[currentItem]=true; //mark vistednode true

                    List<Integer> neighbhoursList = adjList[currentItem]; // fetch relvant neighbhours list of removed item of stack;

                    // push the connected components of the current node into stack
                    for(int neighbours:neighbhoursList)
                    {
                        if(!visitedNodes[neighbours])
                        {
                            nodeStackContainer.push(neighbours);
                        }

                    }
                }


            }




        return ans;
    }



}


