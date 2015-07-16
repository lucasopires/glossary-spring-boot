package br.com.glossary.dao;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.glossary.dao.model.Glossary;

@RepositoryRestResource
public interface GlossaryDao extends CrudRepository<Glossary, Long> {

	List<Glossary> findByVerbete(@Param("verbete") String verbete);

}
