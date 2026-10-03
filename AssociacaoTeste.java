package ExercicioDeAssociacao;

public class AssociacaoTeste {
    public static void main(String[] args) {
        Local local = new Local("Rua das flores");
        Aluno aluno = new Aluno(17,"Micael");
        Professor professor = new Professor("Rafaelle", "Doutorado");
        Aluno[] alunosSeminario ={aluno};
        Seminario seminario = new Seminario(alunosSeminario, "Onde começa o Mundo", local );
        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);
        professor.imprime();
    }
}
