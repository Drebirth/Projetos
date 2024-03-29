import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class QueryExecution3 {

    public static void main(String[] args){

    // 1 - Dados instanciados para serem utilizados como exemplo
    EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("part1-DIO");
    EntityManager entityManager = entityManagerFactory.createEntityManager();
    entityManager.getTransaction().begin();
    Estado estadoParaAdicionar = new Estado("Rio de Janeiro", "RJ");
    entityManager.persist(estadoParaAdicionar);
    entityManager.persist(new Estado("Sao Paulo", "SP"));;
    entityManager.persist(new Aluno("Daniel", 29, estadoParaAdicionar));
    entityManager.persist(new Aluno("Joao", 20, estadoParaAdicionar));
    entityManager.persist(new Aluno("Pedro", 30, estadoParaAdicionar));
    entityManager.getTransaction().commit();

        // 2 - Vamos utilizar o método do EntityManager find(), SQL nativo, JPQL e JPA Criteria API para realizar uma
        //Consulta que retornarar o mesmo valor equivalente aos seguintes SQL;
        //SELECT * FROM Aluno WHERE id = 1 (Equivalente ao método find do entityManager na parte 2.2)
        //SELECT * FROM Aluno WHERE nome = 'Daniel' (Sera o equivalente para as outras consultas nas partes 2.3 - 2.4 - 2.5)

        // 2.1 - O parametro de busca que será utilizado nas proximas consultas
        String nome = "Daniel";


        // 2.2 Utilizando o método find do entityManager
        //Trazendo somente 1 resultado
//        Aluno alunoEntityManager = entityManager.find(Aluno.class, 1);
//
//        //Trazendo uma lista como resultado
//        // Não é possivel!!! Deve utilizar um dos metodos utilizados abaixos nas partes 2.3 - 2.4 - 2.5
//
//        //Resultado das consultas acima
//        System.out.println("Consulta alunoEntityManager: " + alunoEntityManager);

        // =============================================================================================

        // 2.3 - SQL nativo
        //Trazendo somente 1 resultado
//        String sql = "SELECT * FROM Aluno WHERE nome = :nome ";
//        Aluno alunoSQL = (Aluno) entityManager
//                .createNativeQuery(sql, Aluno.class)
//                .setParameter("nome", nome)
//                .getSingleResult();
//
//        //Trazendo uma lista como resultado
//         String sqlList = "SELECT * FROM Aluno";
//         List<Aluno> alunoSQLLIST = entityManager
//                 .createNativeQuery(sqlList, Aluno.class)
//                 .getResultList();
//
//
//         //Resultados das consultas acima
//        System.out.println("Consulta alunoSQL: " + alunoSQL);
//        alunoSQLLIST.forEach(Aluno -> System.out.println("Consulta alunoSQLLIST:  " + Aluno));

        // ======================================================================================================

        // 2.4 - JPQL
        // Trazendo somente 1 resultado
//        String jpql = "select a from Aluno a where a.nome = :nome";
//        Aluno alunoJPQL = entityManager
//                .createNativeQuery(jpql,Aluno.class)
//                .setParameter("nome", nome)
//                .getSingleResult();
//

    }
}
