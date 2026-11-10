package dev.w2kr1stn.roomy.repository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import dev.w2kr1stn.roomy.model.entity.Booking;
import dev.w2kr1stn.roomy.model.entity.Office;
import dev.w2kr1stn.roomy.model.entity.User;

@Repository
@Transactional(readOnly = true)
public interface BookingRepository extends JpaRepository<Booking, Long>{

	List<Booking> findByBookingDate(LocalDate date);
	List<Booking> findByUser(User user);
	List<Booking> findByOffice(Office office);

	Optional<Booking> findByUserAndBookingDate(User user, LocalDate date);
	
}
