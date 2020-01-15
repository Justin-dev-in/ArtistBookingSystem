package com.app.main.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Artist {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int artistId;
	
	@Column(unique=true)
	private String artistEmailID;
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
	@Override
	public String toString() {
		return "Artist [artistId=" + artistId + ", artistEmailID=" + artistEmailID + ", artistPhoneNumber="
				+ artistPhoneNumber + ", artistGenre=" + artistGenre + ", artistAvailDays=" + artistAvailDays
				+ ", artistfees=" + artistfees + ", artistCertification=" + artistCertification + ", artistExperience="
				+ artistExperience + ", artistAddress=" + artistAddress + ", artistDob=" + artistDob
				+ ", prefWorkHours=" + prefWorkHours + "]";
	}
	
	
	

}
