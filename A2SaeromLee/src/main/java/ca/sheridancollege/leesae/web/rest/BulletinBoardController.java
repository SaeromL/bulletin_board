package ca.sheridancollege.leesae.web.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import ca.sheridancollege.leesae.domain.BulletinBoard;
import ca.sheridancollege.leesae.services.BulletinBoardService;

@RestController
@RequestMapping("/api/v1/bulletin_boards")
public class BulletinBoardController {
	
	@Autowired
	private BulletinBoardService bulletinBoardService;
	
	@GetMapping(value = {"", "/"})
	public List<BulletinBoard> getCollection() {
		
		return bulletinBoardService.findAll();
	}
	
	@PostMapping(value = {"", "/"})
	public BulletinBoard save(@RequestBody BulletinBoard bulletinBoard) {
		
		return bulletinBoardService.save(bulletinBoard);
	}

}
