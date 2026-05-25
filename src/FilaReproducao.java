public class FilaReproducao {
    NoFila frente;
    NoFila fim;

    public void enfileirar (Filme filme) {
        NoFila novoNo = new NoFila(filme);
        if (fim == null) {
            frente = fim = novoNo;
            return;
        }
        fim.proximo = novoNo;
        fim = novoNo;
    }

    public Filme desenfileirar () {
        if (frente == null) return null;

        Filme filme = frente.filme;
        frente = frente.proximo;

        // Se a fila ficar vazia após a remoção, o fim também deve ser null
        if (frente == null) {
            fim = null;
        }
        return filme;
    }

    public Filme espiar() {
        return (frente != null) ? frente.filme : null;
    }

    public void exibir() {
        if (frente == null) {
            System.out.println("Fila de Reprodução vazia.");
            return;
        }
        NoFila atual = frente;
        while (atual != null) {
            System.out.println("  » " + atual.filme.titulo);
            atual = atual.proximo;
        }
    }


}
