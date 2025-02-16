package ca.sheridancollege.leesae.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ca.sheridancollege.leesae.domain.BulletinBoard;
import ca.sheridancollege.leesae.repositories.BulletinBoardRepository;

@Service
public class BulletinBoardServiceImpl implements BulletinBoardService {

	@Autowired
	private BulletinBoardRepository bulletinBoardRepository;
	
	@Override
	public List<BulletinBoard> findAll() {
		
		return bulletinBoardRepository.findAllByOrderByDateDesc();
	}

	@Override
	public Optional<BulletinBoard> findById(Long id) {
		
		return bulletinBoardRepository.findById(id);
	}

	@Override
	public Optional<BulletinBoard> findByAuthor(String author) {
		
		return bulletinBoardRepository.findByAuthor(author);
	}

	@Override
	public BulletinBoard save(BulletinBoard bulletinBoard) {
		
		return bulletinBoardRepository.save(bulletinBoard);
	}

}
