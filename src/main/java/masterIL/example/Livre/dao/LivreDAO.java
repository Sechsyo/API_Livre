package masterIL.example.Livre.dao;

import masterIL.example.Livre.model.Livre;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class LivreDAO implements ILivreDAO{

    private List<Livre> livres;

    public LivreDAO() {
        livres = new ArrayList<>();
    }

    @Override
    public List<Livre> findAll() {
        return livres;
    }

    @Override
    public Livre findBy(int id) {
        return livres.get(id - 1);
    }

    @Override
    public void save(Livre livre) {
        livres.add(livre);
    }
}
