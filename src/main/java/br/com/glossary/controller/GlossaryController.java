package br.com.glossary.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.glossary.dao.GlossaryDao;
import br.com.glossary.dao.model.Glossary;

@RestController
public class GlossaryController {

	@Autowired
	GlossaryDao dao;

	/***
	 * 
	 * example request http://localhost:8080/verbete?verbete=teste
	 * 
	 * @param verbete
	 * @return
	 */
	@RequestMapping("/verbete")
	public List<Glossary> findByVerbete(
			@RequestParam(value = "verbete") String verbete) {
		
		return dao.findByVerbete(verbete);
	}

}
