package com.example.tp1.services.interfaces;

import com.example.tp1.entity.Reservation;

import java.util.Date;
import java.util.List;

public interface IreservationService {

    List<Reservation> retrieveAllReservation();
    Reservation updateReservation (Reservation res);
    Reservation retrieveReservation (String idReservation);
     Reservation ajouterReservation (long idChambre, long cinEtudiant);
    public Reservation annulerReservation (long cinEtudiant) ;
//    List<Reservation> getReservationParAnneeUniversitaireEtNomUniversite(Date anneeUniversite, String nomUniversite);

}
