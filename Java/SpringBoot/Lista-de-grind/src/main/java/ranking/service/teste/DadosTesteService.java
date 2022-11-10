package ranking.service.teste;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ranking.model.teste.DadosTeste;
import ranking.repository.teste.DadosTesteRepository;

import java.util.Calendar;
import java.util.List;
import java.util.Optional;

@Service
public class DadosTesteService implements DadosTesteInterface {

    @Autowired
    private DadosTesteRepository repository;

    public DadosTesteService(DadosTesteRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<DadosTeste> listar() {
        return repository.findAll();
    }

    public Optional<DadosTeste> encontrarUsuario(Long id){
        return Optional.ofNullable(repository.findById(id).orElseThrow(() -> {
            try {
                throw new Exception("Usuario não encontrado!");
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        }));
    }

    @Override
    public DadosTeste adicionar(DadosTeste dados) {
        dados.setData(Calendar.getInstance());
        return repository.save(dados);
    }

    @Override
    public DadosTeste alterar(Long id, DadosTeste dados) {
        var inf = repository.findById(id);
        dados.setId(inf.get().getId());
        dados.setData(Calendar.getInstance());
        return repository.save(dados) ;
    }

    @Override
    public void deletar(Long id) {
            repository.findById(id);
            repository.deleteById(id);
    }
}
