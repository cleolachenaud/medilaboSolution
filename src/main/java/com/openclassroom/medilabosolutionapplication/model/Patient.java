package com.openclassroom.medilabosolutionapplication.model;

import java.util.Date;



import com.openclassroom.medialabosolutionapplication.util.Genre;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;
import lombok.Data;


@Data
@Entity
@Table(name = "patient")
public class Patient {
	 
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @Column(name = "id")
	    private int patientId;
	 
	    @Column(name = "nom")
	    @NotNull
	    private String nom;

	    @Column(name = "prenom")
	    @NotNull
	    private String prenom;

		@Column(name = "date_naissance")
	    @NotNull
	    private Date dateNaissance;

	    @Column(name = "genre", nullable = false, length = 1)
	    @Enumerated(EnumType.STRING)
	    @NotNull
	    private Genre genre;
	 
	    @Column(name = "adresse")
	    private String adresse;
	 
	    @Column(name = "telephone")
	    private Integer telephone;
	    
}
