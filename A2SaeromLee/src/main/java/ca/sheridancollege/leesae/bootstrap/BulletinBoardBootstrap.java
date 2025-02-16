package ca.sheridancollege.leesae.bootstrap;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import ca.sheridancollege.leesae.domain.BulletinBoard;
import ca.sheridancollege.leesae.services.BulletinBoardService;

@Component
public class BulletinBoardBootstrap implements CommandLineRunner {
	
	@Autowired
	private BulletinBoardService bulletinBoardService;

	@Override
	// TODO comment or remove in production
	public void run(String... args) throws Exception {
		
		BulletinBoard b1 = new BulletinBoard("Jack", "Update for Adobe Pro v23.008.20555", LocalDateTime.parse("2024-01-20T12:45:00"), "Please advise that Adobe Pro v23.008.20555 will be updated over the upcoming weekend.<br><br>");
		BulletinBoard b2 = new BulletinBoard("Sam", "Vacation Request Period", LocalDateTime.parse("2023-11-07T13:30:00"), "Please submit your Vacation Request Form for Jan, 2024 - April, 2024 by the end of the year to your manager. <br>Reach out to your manager as soon as possible if you need to discuss something.<br><br>");
		BulletinBoard b3 = new BulletinBoard("Emily", "Server Maintenance Scheduled", LocalDateTime.parse("2024-03-15T10:19:00"), "We will be performing scheduled maintenance on the server on Saturday, March 20th, 2024 from 10:00 PM to 2:00 AM (EDT). <br>During this time, the server may experience intermittent downtime. <br><br>Please plan your work accordingly.<br><br>");
		BulletinBoard b4 = new BulletinBoard("Alex", "Network Connectivity Issue", LocalDateTime.parse("2023-09-28T09:15:00"), "Some users are experiencing intermittent network connectivity issues. <br>Our IT team is investigating the root cause. <br><br>We apologize for any inconvenience this may cause and appreciate your patience as we work to resolve the issue.<br><br>");
		BulletinBoard b5 = new BulletinBoard("Sophia", "Software Update Reminder", LocalDateTime.parse("2024-03-24T15:00:00"), "A reminder to all employees: <br><br>Please ensure that your software applications are up to date. <br>Regular updates help ensure security, stability, and performance. <br><br>If you need assistance with updating your software, please contact the IT helpdesk.<br><br>");

		
		bulletinBoardService.save(b1);
		bulletinBoardService.save(b2);
		bulletinBoardService.save(b3);
		bulletinBoardService.save(b4);
		bulletinBoardService.save(b5);

	}

}
