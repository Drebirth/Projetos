package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import springmvc.model.Grind;
import springmvc.repository.GrindRepository;

import java.util.List;

@Service
public class GrindService {

    @Autowired
    private GrindRepository repository;

    public List<Grind> all(){
        return repository.findAll();
    }

    public Grind save(Grind grind){
        return repository.save(grind);
    }

    public void delete(Long id){
        if (repository.existsById(id)){
            repository.deleteById(id);
        }else {
            throw new RuntimeException("Id não encontrado!");
        }
    }

}
