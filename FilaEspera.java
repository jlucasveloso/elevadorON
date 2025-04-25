import java.io.Serializable; // Permite salvar o estado da fila para persistência ou simulação

// Representa a fila de espera de um determinado andar
public class FilaEspera implements Serializable {

    // Fila principal que armazena todos os passageiros esperando no andar
    private FilaSimples fila;

    // Construtor da fila de espera
    public FilaEspera() {
        this.fila = new FilaSimples(); // Inicializa a fila como uma nova FilaSimples
    }

    // Adiciona uma nova pessoa à fila de espera
    public void adicionarPessoa(Pessoa pessoa) {
        fila.enfileirar(pessoa); // Insere a pessoa no final da fila
    }

    // Remove e retorna a próxima pessoa da fila (ordem de chegada)
    public Pessoa proximaPessoa() {
        return fila.desenfileirar(); // Remove o primeiro da fila
    }

    // Verifica se a fila está vazia
    public boolean estaVazia() {
        return fila.estaVazia();
    }

    // Retorna o número de pessoas aguardando na fila
    public int tamanho() {
        return fila.tamanho();
    }

    // Retorna a fila (caso o sistema precise percorrê-la para alguma lógica)
    public FilaSimples getFila() {
        return fila;
    }
}
