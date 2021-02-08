package net.opendevup.scolarite.dao;

import java.util.Date;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import net.opendevup.scolarite.entities.Etudiant;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
public interface EtudiantRepository extends JpaRepository<Etudiant, Long>{
//    public List<Etudiant> findByNom(String n);
//    public Page<Etudiant> findByNom(String n,Pageable pageable);
    
    @Query("Select e from Etudiant e where e.nom like :x")
    public Page<Etudiant> chercherEtudiant(@Param("x")String mc, Pageable pageable);
    
//    @Query("Select e from Etudiant e where e.dateNaissance>:x and e.dateNaissance<:y")
//    public Page<Etudiant> chercherEtudiant(@Param("x")Date d1, @Param("y")Date d2);
}
