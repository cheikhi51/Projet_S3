package dao;

import java.util.List;
import entities.Demande;

public interface IDemandeDao {
    public Demande save(Demande d);
    public List<Demande> DemandesParMc(String mc);
    public List<Demande> getAllDemandes();
    public Demande getDemande(Long id);
    public Demande update(Demande d);
    public void deleteDemande(Long id);
}
