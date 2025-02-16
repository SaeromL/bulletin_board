package ca.sheridancollege.leesae.domain;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Entity
public class BulletinBoard {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	@NonNull
	private String author;
	@NonNull
	private String title;
	@NonNull
	@DateTimeFormat(iso = DateTimeFormat.ISO.TIME, pattern = "yyyy-MM-dd'T'HH:mm")
	private LocalDateTime date;
	@Lob
	private String content;
	
	
    public BulletinBoard(String author, String title, LocalDateTime date, String content) {
        this.author = author;
        this.title = title;
        this.date = date;
        this.content = content;
    }
}
