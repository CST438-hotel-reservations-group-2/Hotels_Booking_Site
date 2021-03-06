package hotel_booking_site;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NewBookingService {
	
	@Autowired
	BookingsRepository bookingsRepository;
	
	public boolean persistNewBooking(Booking booking) {
		bookingsRepository.save(booking);
		
		return true;
	}
}
