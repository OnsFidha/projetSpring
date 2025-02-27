package com.example.tp1.services.IMPL;

import com.example.tp1.entity.Chambre;
import com.example.tp1.repository.ChambreRepository;
import com.example.tp1.services.interfaces.IchambreService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@AllArgsConstructor
public class ChambreServiceIMPL implements IchambreService {
    ChambreRepository chambreRepository;
    @Override
    public List<Chambre> retrieveAllChambres() {
        return chambreRepository.findAll();
    }

    @Override
    public Chambre addChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre updateChambre(Chambre c) {
        return chambreRepository.save(c);
    }

    @Override
    public Chambre retrieveChambre(long idChambre) {
        return chambreRepository.findById(idChambre).orElse(null);
    }

    @Override
    public List<Chambre> getChambreByAddresseUniversite(String ads) {
        return chambreRepository.findByBlocFoyerUniversiteAdresse(ads);
    }

    @Override
    public Chambre getChambreByCINEtudaintEtNomBloc(Long CIN, String nom) {
        return  chambreRepository.findByReservationsEtudiantsCinAndBlocNomBloc(CIN,nom);
    }


}
