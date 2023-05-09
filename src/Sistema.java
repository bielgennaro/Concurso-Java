public class Sistema {
    public static void main(String[] args) {
        Candidato c1 = new Candidato();
        c1.setCpf("12345678900");
        Candidato c2 = new Candidato();
        c2.setCpf("12344325252");

        Concurso concurso1 = new Concurso();
        concurso1.adicionaCandidato(c1);
        concurso1.adicionaCandidato(c2);
        concurso1.removerCandidato("12345678900");
        concurso1.addRespostas();

    }
}
