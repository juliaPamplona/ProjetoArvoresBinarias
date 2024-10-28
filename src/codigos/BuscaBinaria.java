package codigos;

public class BuscaBinaria {
	
	class Node {
	    int valor;
	    Node left;
	    Node right;

	    Node(int valor) {
	        this.valor = valor;
	        this.left = null;
	        this.right = null;
	    }
	}
	    private Node root;
	    public Node getRoot() {
	    	return root;
	    }

	    public BuscaBinaria() {
	        root = null;
	    }
	    
	    // Método para insererção de um novo nó:
	    
	    public void insertRecursive(int valor) {
	        Node newNode = new Node(valor);
	        if (root == null) {
	            root = newNode;
	        } else {
	            Node current = root;
	            while (true) {
	                if (valor < current.valor) {
	                    if (current.left == null) {
	                        current.left = newNode;
	                        break;
	                    } else {
	                        current = current.left;
	                    }
	                } else {
	                    if (current.right == null) {
	                        current.right = newNode;
	                        break;
	                    } else {
	                        current = current.right;
	                    }
	                }
	            }
	        }
	    }

	    // Método para percorrer a árvore em ordem:
	    
	    public void inorderTraversal(Node node) {
	        if (node == null) {
	            return;
	        }
	        inorderTraversal(node.left);
	        System.out.print(node.valor + " ");
	        inorderTraversal(node.right);
	    }
	}

