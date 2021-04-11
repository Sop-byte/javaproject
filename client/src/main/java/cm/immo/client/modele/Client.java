package cm.immo.client.modele;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="client")
public class Client {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	int idclient;
	String nom;
	Date datenaissance;
	String profession;
	int telephone;
	String email;
	
	public int getIdclient() {
		return idclient; 
	}
	public void setIdclient(int idclient) {
		this.idclient = idclient;
	}
	public String getNom() { 
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public Date getDatenaissance() {
		return datenaissance;
	}
	public void setDatenaissance(Date datenaissance) {
		this.datenaissance = datenaissance;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public int getTelephone() {
		return telephone;
	}
	public void setTelephone(int telephone) {
		this.telephone = telephone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}	

}
