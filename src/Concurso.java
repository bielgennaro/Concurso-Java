import java.util.ArrayList;
import java.util.Scanner;

public class Concurso {
    private final char[] gabarito = new char[10];
    private ArrayList<Candidato> candidatos;

    public Concurso() {
        this.candidatos = new ArrayList<>();
    }

    public char[] getGabarito() {
        return gabarito;
    }

    public ArrayList<Candidato> getCandidatos() {
        return candidatos;
    }

    public void setCandidatos(ArrayList<Candidato> candidatos) {
        this.candidatos = candidatos;
    }

    public void adicionaCandidato(Candidato candidato) {
        String cpfNovo = candidato.getCpf();
        boolean existe = false;
        for (Candidato c : candidatos) {
            if (cpfNovo.equals(c.getCpf())) {
                System.out.println("Candidato já existe");
                existe = true;
                break;
            }
        }
        if (!existe) {
            candidatos.add(candidato);
        }
    }

    public void removerCandidato(String cpf) {
        for (Candidato c : candidatos) {
            if (cpf.equals(c.getCpf())) {
                System.out.println("Candidato removido");
                candidatos.remove(c);
                break;
            }
        }
    }

    public void addRespostas() {
        Scanner sc = new Scanner(System.in);
        char[] validos = {'A', 'B', 'C', 'D', 'E'};
        for (int i = 0; i <= 10; i++) {
            boolean ok = true;
            do {
                System.out.println("Digite a resposta da questão " + (i + 1));
                char resp = sc.next().charAt(0);
                sc.reset();
                for (int j = 0; j < validos.length; j++) {
                    if (resp == validos[j]) {
                        ok = false;
                        break;
                    }
                }
            } while (ok);
        }
        sc.close();
    }

    public void corrigirProva(){
        for (Candidato c: candidatos){
            int acertos = 0;
            for (int i = 0; i < gabarito.length; i++){
                if (c.getRespostas()[i] == gabarito[i]){
                    acertos++;
                }
            }
            System.out.println("Candidato: " + c.getNome() + " acertou " + acertos + " questões");
        }
    }
}
