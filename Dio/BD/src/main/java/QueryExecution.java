//import java.util.List;
//
//public class QueryExecution {
//    public static void main(String[] args) {
//
//        AlunoDAO alunoDAO = new AlunoDAO();
//
//        // 1.0 Consulta em lista
//      //  List<Aluno> alunos = alunoDAO.list();
//
//        // alunos.stream().forEach(System.out::println);
////
////        for (Aluno aluno : alunos) {
////            System.out.println(aluno);
////        }
//
//        // 1.1 Consulta com filtro
////        Aluno alunoParaConsulta = alunoDAO.getById(1);
////        System.out.println(alunoParaConsulta);
//
//        // 2 - Inserção
//        Aluno alunoParaInsercao = new Aluno(12,"silva", 22, "PB");
//        alunoDAO.create(alunoParaInsercao);
//        System.out.println(alunoParaInsercao);
//
//        // 3 - Delete
//        alunoDAO.list().stream().forEach(System.out::println);
//
//        alunoDAO.delete(12);
//
//        alunoDAO.list().stream().forEach(System.out::println);
//
////        for (Aluno aluno : alunos){
////            System.out.println(aluno);
////        }
//
//        //4 - Atualizar
//        Aluno alunoParaAtualizar = alunoDAO.getById(2);
//        alunoParaAtualizar.setNome("Ju");
//        alunoParaAtualizar.setIdade(19);
//        alunoParaAtualizar.setEstado("SP");
//
//        alunoDAO.update(alunoParaAtualizar);
//
//        alunoDAO.list().stream().forEach(System.out::println);
//
//    }
//}
