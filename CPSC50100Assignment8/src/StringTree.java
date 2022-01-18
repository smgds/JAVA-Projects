//StringTree.java		Author: Amy Noyes

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class StringTree{
	//Root of Binary Tree
    Node root;

    //Add String to Tree
    private void addString(Node node, String str){
        //First Inserted String Added to Left
        if(str.compareTo(node.value)<0){
            if(node.left==null){
                node.left = new Node(str);
                return;
            }
            addString(node.left,str);
        }
        //Then String Added to Right
        else{
            if(node.right==null){
                node.right = new Node(str);
                return;
            }
            addString(node.right,str);
        }
    }
    
    //Add String
    public void addString(String str){
        //Creates Root Node
        if(root==null){
            root = new Node(str);
            return;
        }
        addString(root,str);

    }

    //In Order traversal and Printing
    private void printTree(Node node){
        if(node==null){
            return;
        }
        printTree(node.left);
        System.out.print(node);
        printTree(node.right);
        
    }
    public void printTree(){
        printTree(root);
    }
    public static void main(String[] args) throws FileNotFoundException {
    	
		// Create Tree
		StringTree tree = new StringTree();		
		
		// Read File		
		System.out.println(System.getProperty("user.dir"));
		File file = new File(System.getProperty("user.dir")+"/FruitsAndVegetables.txt");

		Scanner scanner = new Scanner(file);
			while(scanner.hasNextLine()){
			String line = scanner.nextLine();
			String[] words = line.split("\r\n"); 
			for (String word : words) {
			tree.add(word);			
}		
}	
		// print the names
		tree.printTree();

		scanner.close();
}

	private void add(String word) {
		// TODO Auto-generated method stub
		
	}

	}

			
	
