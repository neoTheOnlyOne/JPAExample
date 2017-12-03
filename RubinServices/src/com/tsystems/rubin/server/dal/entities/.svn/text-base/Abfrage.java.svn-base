package com.tsystems.rubin.server.dal.entities;

import java.io.Serializable;
import java.sql.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Abfrage implements Serializable {
	@Id
	@Column(name="OID_ABFRAGE")
	private Long id;

	private String abfragebezeichnung;

	private String abfragequelle;

	private String abfragestatus;

	private String abfragetyp;

	private String kommentar;

	@Column(name="LETZTE_AKTUALISIER")
	private Date letzteAktualisier;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="FK_BEARBEITER_SZER")
	private User user;

	@OneToMany(mappedBy="abfrage")
	private Set<Abfragekriterium> abfragekriteriums;

	private static final long serialVersionUID = 1L;

	public Abfrage() {
		super();
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the abfragebezeichnung
	 */
	public String getAbfragebezeichnung() {
		return abfragebezeichnung;
	}

	/**
	 * @param abfragebezeichnung the abfragebezeichnung to set
	 */
	public void setAbfragebezeichnung(String abfragebezeichnung) {
		this.abfragebezeichnung = abfragebezeichnung;
	}

	/**
	 * @return the abfragequelle
	 */
	public String getAbfragequelle() {
		return abfragequelle;
	}

	/**
	 * @param abfragequelle the abfragequelle to set
	 */
	public void setAbfragequelle(String abfragequelle) {
		this.abfragequelle = abfragequelle;
	}

	/**
	 * @return the abfragestatus
	 */
	public String getAbfragestatus() {
		return abfragestatus;
	}

	/**
	 * @param abfragestatus the abfragestatus to set
	 */
	public void setAbfragestatus(String abfragestatus) {
		this.abfragestatus = abfragestatus;
	}

	/**
	 * @return the abfragetyp
	 */
	public String getAbfragetyp() {
		return abfragetyp;
	}

	/**
	 * @param abfragetyp the abfragetyp to set
	 */
	public void setAbfragetyp(String abfragetyp) {
		this.abfragetyp = abfragetyp;
	}

	/**
	 * @return the kommentar
	 */
	public String getKommentar() {
		return kommentar;
	}

	/**
	 * @param kommentar the kommentar to set
	 */
	public void setKommentar(String kommentar) {
		this.kommentar = kommentar;
	}

	/**
	 * @return the letzteAktualisier
	 */
	public Date getLetzteAktualisier() {
		return letzteAktualisier;
	}

	/**
	 * @param letzteAktualisier the letzteAktualisier to set
	 */
	public void setLetzteAktualisier(Date letzteAktualisier) {
		this.letzteAktualisier = letzteAktualisier;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the abfragekriteriums
	 */
	public Set<Abfragekriterium> getAbfragekriteriums() {
		return abfragekriteriums;
	}

	/**
	 * @param abfragekriteriums the abfragekriteriums to set
	 */
	public void setAbfragekriteriums(Set<Abfragekriterium> abfragekriteriums) {
		this.abfragekriteriums = abfragekriteriums;
	}


}
