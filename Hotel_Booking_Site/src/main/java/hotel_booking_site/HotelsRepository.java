package hotel_booking_site;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface HotelsRepository extends JpaRepository<Hotel, Long> {
	
	Hotel findById(int id); 
}
