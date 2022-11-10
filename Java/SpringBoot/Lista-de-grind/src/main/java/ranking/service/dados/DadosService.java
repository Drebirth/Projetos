package ranking.service.dados;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ranking.model.Dados;
import ranking.repository.DadosRepository;
import ranking.service.usuario.UsuarioService;

import java.text.DateFormat;
import java.time.format.DateTimeFormatterBuilder;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

@Service
public class DadosService implements  DadosInterface{
    @Autowired
    private DadosRepository dados;

    @Autowired
    private UsuarioService usuario;


    public DadosService(DadosRepository dados,UsuarioService usuario) {
        this.dados = dados;
        this.usuario = usuario;
    }

    @Override
    public List<Dados> listarTodos() {
        return dados.findAll();
    }

    @Override
    public Dados salvar(Long id,Dados d) {
        var user =usuario.buscar(id);
        if(user.isPresent()){
            d.setUsuario(user.get());
            d.setDate(Calendar.getInstance());
            return dados.save(d);
        }else {
            throw new RuntimeException("Usuario não existente!");
        }


    }

    @Override
    public Dados alterar(Long id, Dados d) {
        var user = usuario.buscar(id);
        if(user.isPresent()){
              d.setUsuario(user.get());
              return dados.save(d);
        }else{
            throw new RuntimeException("ID não identificado, favor verificar o ID e tentar novamente!");
        }
    }

    @Override
    public void deletar(Long id) {
            if(dados.existsById(id)){
                dados.deleteById(id);
            }else{
                throw new RuntimeException("Informação não existente na base de dados");
            }
    }
}
