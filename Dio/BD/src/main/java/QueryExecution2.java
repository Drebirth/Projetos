//import javax.persistence.EntityManager;
//import javax.persistence.EntityManagerFactory;
//import javax.persistence.Persistence;
//
//public class QueryExecution2 {
//
//    public static void main(String[] args){
//    //JPA com implementacao do hibernate
//
//        // 1 - Passos iniciais para criar um gerenciador de entidades com banco de dados especificado no arquivo "persistence.xml"
//        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("part1-DIO");
//        EntityManager entityManager = entityManagerFactory.createEntityManager();
//
//        // 2.1 - Criar instancias para serem adicionadas no banco de dados
//        Estado estadoParaAdicionar = new Estado("Rio de Janeiro", "RJ");
//        Aluno alunoParaAdicionar = new Aluno("Daniel", 23, estadoParaAdicionar);
//        Aluno alunoParaAdicionar1 = new Aluno("Joao", 23, estadoParaAdicionar);
//
//        // 2.2 - Iniciar uma transação para adicionar as instancias no banco de dados
//        entityManager.getTransaction().begin();
//
//        entityManager.persist(estadoParaAdicionar);
//        entityManager.persist(alunoParaAdicionar);
//        entityManager.persist(alunoParaAdicionar1);
//
//        entityManager.getTransaction().commit();
//
//
//        // 3 - Resgatar instancias no banco de dados.
//        //Não precisa de uma transação ja que nao vamos alterar o banco de dados
//        Estado estadoEncontrado = entityManager.find(Estado.class, 1);
//        Aluno alunoEncontrado = entityManager.find(Aluno.class, 1);
//
//        System.out.println(estadoEncontrado);
//        System.out.println(alunoEncontrado);
//
//
//        // 4 - Alterar uma entidade
//
//        entityManager.getTransaction().begin();
//
//        alunoEncontrado.setNome("Karam");
//        alunoEncontrado.setIdade(20);
//
//        entityManager.getTransaction().commit();
//
//        System.out.println("Depois da alteração: " + alunoEncontrado);
//
//        // 5 - Deletar uma entidade
//
//        entityManager.getTransaction().begin();
//
//        entityManager.remove(alunoEncontrado);
//
//        entityManager.getTransaction().commit();
//
//
//        // 6 - Encerrar o gerenciador de entidades e encerrar a fabrica de gerenciadores de entidade.
//               entityManager.close();
//               entityManagerFactory.close();
//
//    }
//}
