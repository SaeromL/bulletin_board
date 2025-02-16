package ca.sheridancollege.leesae.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ca.sheridancollege.leesae.domain.BulletinBoard;

@Repository
public interface BulletinBoardRepository extends JpaRepository<BulletinBoard, Long> {

	public Optional<BulletinBoard> findByAuthor(String author);
	
	public List<BulletinBoard> findAllByOrderByDateDesc();
}
