package br.com.sanepar.aula.sst;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.sanepar.aula.sst.database.RepositorioContato;
import br.com.sanepar.aula.sst.entity.Contato;

@RestController
@RequestMapping("/contato")
public class ContatoREST {

    @Autowired
    private RepositorioContato repositorio;

    @GetMapping
    public List<Contato> listar() {
        return repositorio.findAll();
    }
    
    @PostMapping
    public Contato salvar(@RequestBody Contato contato) {
        return repositorio.save(contato);
    }

    @PutMapping
    public Contato alterar(@RequestBody Contato contato) {
        if (contato.getId()!=null)
            return repositorio.save(contato);

        return null;
    }

    @DeleteMapping
    public void excluir (@RequestBody Contato contato) {
        repositorio.delete(contato);
    }
}
