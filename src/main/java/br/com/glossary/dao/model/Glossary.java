package br.com.glossary.dao.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TB_GLOSSARY", schema = "GLOSSARY_DB")
public class Glossary {



	@Id
	@GeneratedValue
	@Column(name = "ID")
	private Long id;

	@Column(name = "VERBETE")
	private String verbete;

	@Column(name = "CLASSE_PALAVRA")
	private String classePalavra;

	@Column(name = "FONTE_INGLES")
	private String fonteIngles;

	@Column(name = "FONTE_PORTUGUES")
	private String fontePortugues;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVerbete() {
		return verbete;
	}

	public void setVerbete(String verbete) {
		this.verbete = verbete;
	}

	public String getClassePalavra() {
		return classePalavra;
	}

	public void setClassePalavra(String classePalavra) {
		this.classePalavra = classePalavra;
	}

	public String getFonteIngles() {
		return fonteIngles;
	}

	public void setFonteIngles(String fonteIngles) {
		this.fonteIngles = fonteIngles;
	}

	public String getFontePortugues() {
		return fontePortugues;
	}

	public void setFontePortugues(String fontePortugues) {
		this.fontePortugues = fontePortugues;
	}

}
