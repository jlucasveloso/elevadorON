import java.io.Serializable; // Permite salvar o estado do elevador, útil para logs ou simulações futuras

// Classe que representa um elevador no sistema
public class Elevador implements Serializable {

    // Identificador do elevador (por exemplo: 0, 1, 2...)
    private int id;

    // Andar atual em que o elevador se encontra
    private int andarAtual;

    // Lista de destinos que o elevador precisa atender
    private ListaSimples destinos;

    // Capacidade máxima de passageiros que o elevador pode carregar
    private int capacidadeMaxima;

    // Número atual de passageiros no elevador
    private int passageiros;

    // Direção atual do elevador: true para subir, false para descer
    private boolean subindo;

    // Construtor da classe Elevador
    public Elevador(int id, int andarInicial, int capacidadeMaxima) {
        this.id = id;                                 // Define o ID do elevador
        this.andarAtual = andarInicial;               // Define o andar inicial do elevador
        this.capacidadeMaxima = capacidadeMaxima;     // Define a capacidade máxima
        this.passageiros = 0;                         // Inicializa com 0 passageiros
        this.subindo = true;                          // Por padrão, começa subindo
        this.destinos = new ListaSimples();           // Inicializa a lista de destinos como vazia
    }

    // Retorna o ID do elevador
    public int getId() {
        return id;
    }

    // Retorna o andar atual do elevador
    public int getAndarAtual() {
        return andarAtual;
    }

    // Define o novo andar do elevador
    public void setAndarAtual(int andar) {
        this.andarAtual = andar;
    }

    // Retorna se o elevador está subindo
    public boolean isSubindo() {
        return subindo;
    }

    // Define se o elevador está subindo ou descendo
    public void setSubindo(boolean subindo) {
        this.subindo = subindo;
    }

    // Adiciona um novo destino à lista
    public void adicionarDestino(int destino) {
        destinos.adicionar(destino);
    }

    // Remove o destino atual (primeiro da lista)
    public void removerDestino() {
        destinos.removerInicio();
    }

    // Retorna o próximo destino da lista
    public int getProximoDestino() {
        return destinos.obterPrimeiro();
    }

    // Verifica se há destinos pendentes
    public boolean temDestinos() {
        return !destinos.estaVazia();
    }

    // Retorna a capacidade máxima do elevador
    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    // Retorna o número atual de passageiros
    public int getPassageiros() {
        return passageiros;
    }

    // Adiciona um passageiro (caso não ultrapasse a capacidade)
    public void adicionarPassageiro() {
        if (passageiros < capacidadeMaxima) {
            passageiros++;
        }
    }

    // Remove um passageiro
    public void removerPassageiro() {
        if (passageiros > 0) {
            passageiros--;
        }
    }
}
