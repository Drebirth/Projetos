//
//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
//public class AlunoDAO {
//
//    // 1 - Consulta
//    public List<Aluno> list() {
//        List<Aluno> alunos = new ArrayList<>();
//
//        try (Connection conn = ConnectionFactory.getConnection()) {
//            PreparedStatement prst = conn.prepareStatement("SELECT * FROM alunos");
//
//            ResultSet rs = prst.executeQuery();
//
//            while (rs.next()) {
//                Aluno aluno = new Aluno(rs.getInt("id"), rs.getString("nome"), rs.getInt("idade"),
//                        rs.getString("estado"));
//
//                alunos.add(aluno);
//            }
//
//        } catch (Exception e) {
//
//        }
//        return alunos;
//    }
//
//    // 1-1 Consulta com filtro
//    public Aluno getById(int id) {
//        Aluno aluno = new Aluno();
//
//        try (Connection conn = ConnectionFactory.getConnection()) {
//            // Prepara consulta SQL
//            String sql = "SELECT * FROM alunos WHERE id = ? ";
//
//            // Prepara statement com os par^metros recebidos
//            PreparedStatement stmt = conn.prepareStatement(sql);
//            stmt.setInt(1, id);
//
//            // Executa consulta e armazena o retorno da consulta no objeto "rs"
//            ResultSet rs = stmt.executeQuery();
//
//            // Guardar valores retornados da tabela alunos no objeto aluno
//            if (rs.next()) {
//                aluno.setId(rs.getInt("id"));
//                aluno.setNome(rs.getString("nome"));
//                aluno.setIdade(rs.getInt("idade"));
//                aluno.setEstado(rs.getString("estado"));
//            }
//        } catch (Exception e) {
//            System.out.println("Listagem de alunos falhou!");
//            e.printStackTrace();
//        }
//        return aluno;
//    }
//
//    // 2 - Inserção
//    public void create(Aluno aluno) {
//        try (Connection connection = ConnectionFactory.getConnection()) {
//
//            // Preparar SQL para inserção de dados do aluno.
//            String sql = "INSERT INTO alunos(id, nome, idade, estado) VALUES(?,?,?,?)";
//
//            // Preparar statement com os parâmetros recebidos
//            PreparedStatement stmt = connection.prepareStatement(sql);
//            stmt.setInt(1, aluno.getId());
//            stmt.setString(2, aluno.getNome());
//            stmt.setInt(3, aluno.getIdade());
//            stmt.setString(4, aluno.getEstado());
//
//            //Executa inserção e armazena o numero de linhas afetadas
//            int rowsAffected = stmt.executeUpdate();
//
//            System.out.println("Inserção BEM SUCEDA!. Foi adicionada " + rowsAffected + "linha");
//        } catch (SQLException e) {
//            System.out.println("Inserção Falhou!");
//            e.printStackTrace();
//
//        }
//    }
//
//    // 3 - Delete
//    public void delete(int id){
//        try (Connection conn = ConnectionFactory.getConnection()){
//
//            //Preparar SQL para deletar uma linha
//            String sql = "DELETE FROM alunos WHERE id = ?";
//
//            //Preparar statement com os parâmetros recebidos
//            PreparedStatement stmt = conn.prepareStatement(sql);
//            stmt.setInt(1, id);
//
//            //Executa dele e armazena o numero de linhas afetadas
//            int rowsAffected = stmt.executeUpdate();
//
//            System.out.println("Delete bem sucedido! Foi deletado " + rowsAffected+ " linha");
//        }catch(SQLException e){
//            System.out.println("Delete Falhou!");
//            e.printStackTrace();
//        }
//    }
//
//    // 4 - Atualizar
//    public void update(Aluno aluno){
//        try (Connection connection = ConnectionFactory.getConnection()){
//
//            //Preparar SQL para atualuzar linhas
//            String sql = "UPDATE alunos SET nome = ?, idade = ?, estado = ? WHERE id = ?";
//
//            //Preparar statement com os parâmetros recebidos
//            PreparedStatement stmt = connection.prepareStatement(sql);
//            stmt.setString(1, aluno.getNome());
//            stmt.setInt(2, aluno.getIdade());
//            stmt.setString(3, aluno.getEstado());
//            stmt.setInt(4, aluno.getId());
//
//            //Executa atualizado e armazena o numero de linhas afetadas
//            int rowsAffected = stmt.executeUpdate();
//            System.out.println("Atualizacao bem sucedida! Foi atualizada: " + rowsAffected + "linha");
//        }catch(SQLException e){
//            System.out.println("Erro ao atualizar!");
//            e.printStackTrace();
//        }
//    }
//
//
//
//}
