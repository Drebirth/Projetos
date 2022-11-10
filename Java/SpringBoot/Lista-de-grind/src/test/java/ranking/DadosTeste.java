package ranking;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import ranking.model.Dados;
import ranking.model.Usuario;
import ranking.service.dados.DadosService;

@SpringBootTest
public class DadosTeste {

    @Autowired
    private DadosService service;


    @Test
    public void dadosTeste(){
        Dados dados = new Dados();
        Usuario user = new Usuario();

        user.setId(1L);

        dados.setUsuario(user);
        dados.setNickname("Drebirth");
       dados.setClasse("Sorc");
       dados.setLevel(63);
       dados.setMapa("Sicraia");
       dados.setDrop(4800);
       dados.setPa(283);
       dados.setDp(341);

       service.salvar(user.getId(), dados);
       System.out.println(dados.toString());


    }
}
