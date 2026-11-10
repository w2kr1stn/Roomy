package dev.w2kr1stn.roomy.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dev.w2kr1stn.roomy.model.entity.Office;

@Repository
@Transactional(readOnly = true)
public interface OfficeRepository extends JpaRepository<Office, Long>{

	Optional<Office> findByAdress(String adress);

}
