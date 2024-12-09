package ArvoresNova;

public class TreeBB {

    NodeB raiz;

    public addNodeSimples(int valor){
        
    }



    public NodeB addNode(int valor) {
        NodeB node = new NodeB(valor);

        if (this.raiz == null) {
            return this.raiz = node;
        }

        NodeB atual = this.getNodeEmpty(valor, raiz);

        if (valor < 0) {
            return atual.nivelTres = node;
        } else if (valor % 2 == 0) {
            return atual.nivelUm = node;
        } else {
            return atual.nivelDois = node;
        }
    }


    private NodeB getNodeEmpty(int valor, NodeB node) {
        if (valor < 0) {
            if (node.nivelTres == null) {
                return node;
            }
            return getNodeEmpty(valor, node.nivelTres);
        } else if (valor % 2 == 0) {
            if (node.nivelUm == null) {
                return node;
            }
            return getNodeEmpty(valor, node.nivelUm);
        } else {
            if (node.nivelDois == null) {
                return node;
            }
            return getNodeEmpty(valor, node.nivelDois);
        }
    }

    public void printTree(NodeB node, int level) {
        if (node == null) {
            return;
        }

        // Cria uma indentação baseada no nível atual
        String indent = "  ".repeat(level);

        // Imprime o valor do nó atual
        System.out.println(indent + "- " + node.valor);

        // Recursivamente imprime os filhos com níveis incrementados
        printTree(node.nivelTres, level + 1); // NivelTres
        printTree(node.nivelUm, level + 1);  // NivelUm
        printTree(node.nivelDois, level + 1); // NivelDois
    }

    // Método auxiliar para iniciar a impressão a partir da raiz
    public void printTree() {
        System.out.println("Árvore:");
        printTree(raiz, 0);
    }





}
