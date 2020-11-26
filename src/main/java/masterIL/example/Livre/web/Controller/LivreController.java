package masterIL.example.Livre.web.Controller;

import masterIL.example.Livre.dao.ILivreDAO;
import masterIL.example.Livre.model.Livre;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class LivreController {

    @Autowired
    private ILivreDAO dao;

    @ResponseBody
    @GetMapping(value="/Livres")
    public List<Livre> getLesLivres() {
        return dao.findAll();
    }

    @ResponseBody
    @GetMapping(value="/Livre/{id}")
    public Livre getLivre(@PathVariable int id) {
        return dao.findBy(id);
    }

    @PostMapping(value="Livres")
    public void addLivre(@RequestBody Livre l) {
        dao.save(l);
    }
}
