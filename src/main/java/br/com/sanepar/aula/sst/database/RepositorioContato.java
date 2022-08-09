package br.com.sanepar.aula.sst.database;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.sanepar.aula.sst.entity.Contato;

public interface RepositorioContato extends JpaRepository<Contato,Long> {}
