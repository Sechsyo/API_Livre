package masterIL.example.Livre.dao;

import masterIL.example.Livre.model.Livre;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ILivreDAO {

    public List<Livre> findAll();

    public Livre findBy(int id);

    public void save(Livre livre);
}
