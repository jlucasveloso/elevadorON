import java.io.Serializable; // Importa a interface Serializable para permitir que o objeto seja salvo ou transmitido

// Classe que representa o painel de chamada externa do elevador com dois botões (subir e descer)
public class PainelElevador implements Serializable {

    // Atributo que indica se o botão de subir foi pressionado
    private boolean botaoSubirAtivado;

    // Atributo que indica se o botão de descer foi pressionado
    private boolean botaoDescerAtivado;

    // Construtor que inicializa os botões como não ativados
    public PainelElevador() {
        this.botaoSubirAtivado = false;
        this.botaoDescerAtivado = false;
    }

    // Método que simula o pressionamento do botão de subir
    public void pressionarSubir() {
        botaoSubirAtivado = true;
    }

    // Método que simula o pressionamento do botão de descer
    public void pressionarDescer() {
        botaoDescerAtivado = true;
    }

    // Método que reseta os botões para o estado "não ativado"
    public void resetar() {
        botaoSubirAtivado = false;
        botaoDescerAtivado = false;
    }

    // Retorna true se o botão de subir estiver ativado
    public boolean isBotaoSubirAtivado() {
        return botaoSubirAtivado;
    }

    // Retorna true se o botão de descer estiver ativado
    public boolean isBotaoDescerAtivado() {
        return botaoDescerAtivado;
    }
}
