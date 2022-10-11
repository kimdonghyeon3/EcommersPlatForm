package com.example.ecommerceplatform.app.song.repository;

import com.example.ecommerceplatform.app.song.entity.Song;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SongRepository extends JpaRepository<Song, Long> {
}
