import java.io.Serializable; // Permite que objetos da classe sejam serializáveis

// Classe que representa um usuário que utilizará o elevador
public class Usuario implements Serializable {

    // Andar de origem do usuário
    private int andarOrigem;

    // Andar de destino do usuário
    private int andarDestino;

    // Indica se o usuário é cadeirante
    private boolean ehCadeirante;

    // Indica se o usuário é idoso
    private boolean ehIdoso;

    // Construtor da classe Usuario
    public Usuario(int origem, int destino, boolean ehCadeirante, boolean ehIdoso) {
        this.andarOrigem = origem;               // Define o andar de origem
        this.andarDestino = destino;             // Define o andar de destino
        this.ehCadeirante = ehCadeirante;        // Define se o usuário é cadeirante
        this.ehIdoso = ehIdoso;                  // Define se o usuário é idoso
    }

    // Retorna o andar de origem do usuário
    public int getAndarOrigem() {
        return andarOrigem;
    }

    // Retorna o andar de destino do usuário
    public int getAndarDestino() {
        return andarDestino;
    }

    // Retorna true se o usuário for cadeirante
    public boolean isEhCadeirante() {
        return ehCadeirante;
    }

    // Retorna true se o usuário for idoso
    public boolean isEhIdoso() {
        return ehIdoso;
    }
}
