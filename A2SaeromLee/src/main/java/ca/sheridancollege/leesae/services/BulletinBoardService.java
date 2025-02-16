package ca.sheridancollege.leesae.services;

import java.util.List;
import java.util.Optional;

import ca.sheridancollege.leesae.domain.BulletinBoard;

public interface BulletinBoardService {

	public List<BulletinBoard> findAll();
	public Optional<BulletinBoard> findById(Long id);
	public Optional<BulletinBoard> findByAuthor(String author);
	public BulletinBoard save(BulletinBoard bulletinBoard);
	
}
