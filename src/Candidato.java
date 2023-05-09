import java.util.Arrays;

public class Candidato {
    private String nome;
    private String cpf;
    private char[] respostas = new char[10];

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public char[] getRespostas() {
        return respostas;
    }

    public void setRespostas(char[] respostas) {
        this.respostas = respostas;
    }

    @Override
    public String toString() {
        return "Candidato{" + "nome=" + nome + ", cpf=" + cpf + ", respostas=" + Arrays.toString(respostas) + '}';
    }
}
