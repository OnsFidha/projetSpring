package com.example.tp1.repository;

import com.example.tp1.entity.Chambre;
import com.example.tp1.entity.TypeChambre;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ChambreRepository extends JpaRepository<Chambre, Long> {
    List<Chambre> findByBlocFoyerUniversiteAdresse(String ads);
    Chambre findByReservationsEtudiantsCinAndBlocNomBloc(Long cin, String nomBloc);
    List<Chambre> findByNumeroChambreIn(List<Long> numero);
    List<Chambre> findByBlocIdBlocAndTypeC(Long idBloc, TypeChambre typeC);
    //Bloc ism lrelation mapped by maa b bloc f chambre wIdBloc howa ism attribut
}
