package com.app.main.dto;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Artist implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int artistId;
	
	@Column(unique=true)
	private String artistEmailID;
	private String artistName;
	private long artistPhoneNumber;
	private String artistGenre;
	private String artistAvailDays;
	private float artistfees;
	private String artistCertification;
	private String artistExperience;
	private String artistAddress;
	private String artistPassword;
	private String artistDob;
	private String prefWorkHours;
	private String artistPicture;
	
	
	
	public Artist() {
		
	}
	
	  @OneToOne(fetch=FetchType.EAGER,cascade=CascadeType.ALL,mappedBy =
	  "artistId")
	  private Order1 orderId;
	 
	
	public int getArtistId() {
		return artistId;
	}
	public void setArtistId(int artistId) {
		this.artistId = artistId;
	}
	public String getArtistEmailID() {
		return artistEmailID;
	}
	public void setArtistEmailID(String artistEmailID) {
		this.artistEmailID = artistEmailID;
	}
	public long getArtistPhoneNumber() {
		return artistPhoneNumber;
	}
	public void setArtistPhoneNumber(long artistPhoneNumber) {
		this.artistPhoneNumber = artistPhoneNumber;
	}
	public String getArtistGenre() {
		return artistGenre;
	}
	public void setArtistGenre(String artistGenre) {
		this.artistGenre = artistGenre;
	}
	public String getArtistAvailDays() {
		return artistAvailDays;
	}
	public void setArtistAvailDays(String artistAvailDays) {
		this.artistAvailDays = artistAvailDays;
	}
	public float getArtistfees() {
		return artistfees;
	}
	public void setArtistfees(float artistfees) {
		this.artistfees = artistfees;
	}
	public String getArtistCertification() {
		return artistCertification;
	}
	public void setArtistCertification(String artistCertification) {
		this.artistCertification = artistCertification;
	}
	public String getArtistExperience() {
		return artistExperience;
	}
	public void setArtistExperience(String artistExperience) {
		this.artistExperience = artistExperience;
	}
	public String getArtistAddress() {
		return artistAddress;
	}
	public void setArtistAddress(String artistAddress) {
		this.artistAddress = artistAddress;
	}
	public String getArtistDob() {
		return artistDob;
	}
	public void setArtistDob(String artistDob) {
		this.artistDob = artistDob;
	}
	public String getPrefWorkHours() {
		return prefWorkHours;
	}
	public void setPrefWorkHours(String prefWorkHours) {
		this.prefWorkHours = prefWorkHours;
	}
	
	public String getArtistPassword() {
		return artistPassword;
	}
	public void setArtistPassword(String artistPassword) {
		this.artistPassword = artistPassword;
	}
	
	public String getArtistName() {
		return artistName;
	}
	public void setArtistName(String artistName) {
		this.artistName = artistName;
	}
	public String getArtistPicture() {
		return artistPicture;
	}
	public void setArtistPicture(String artistPicture) {
		this.artistPicture = artistPicture;
	}

	
	  public Order1 getOrderId() { return orderId; }
	  public void setOrderId(Order1
	  orderId) { this.orderId = orderId; }
	 
	@Override
	public String toString() {
		return "Artist [artistId=" + artistId + ", artistEmailID=" + artistEmailID + ", artistPhoneNumber="
				+ artistPhoneNumber + ", artistGenre=" + artistGenre + ", artistAvailDays=" + artistAvailDays
				+ ", artistfees=" + artistfees + ", artistCertification=" + artistCertification + ", artistExperience="
				+ artistExperience + ", artistAddress=" + artistAddress + ", artistDob=" + artistDob
				+ ", prefWorkHours=" + prefWorkHours + "]";
	}
	
	
	

}
