package co.edu.ue.eight_project.dao;

import co.edu.ue.eight_project.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioJpaDAO extends JpaRepository<Usuario, Long> {

    Usuario findByDatId(Long id);
    Usuario findByDatEmail(String datEmail);

    Usuario findByDatDocument(String documento);
}
