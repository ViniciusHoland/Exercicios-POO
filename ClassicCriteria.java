package ArvoresNova;

public class ClassicCriteria extends Criteria {


    @Override
    public Node apply(Node node, int valor) {
        if (valor < node.valor){
            return node.esq;
        }
    }
}
