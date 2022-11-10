package ranking.service.teste;

import ranking.model.teste.DadosTeste;

import java.util.List;

public interface DadosTesteInterface {

    List<DadosTeste> listar();

    DadosTeste adicionar(DadosTeste dados);

    DadosTeste alterar(Long id, DadosTeste dados);

    void deletar(Long id);

}
