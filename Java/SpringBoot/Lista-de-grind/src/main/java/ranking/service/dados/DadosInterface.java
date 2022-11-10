package ranking.service.dados;

import ranking.model.Dados;

import java.util.List;

public interface DadosInterface {

    List<Dados> listarTodos();

    Dados salvar(Long id,Dados dados);

    Dados alterar(Long id, Dados dados);

    void deletar(Long id);

}
