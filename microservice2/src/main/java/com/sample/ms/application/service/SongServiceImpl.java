package com.sample.ms.application.service;

import org.springframework.stereotype.Service;

import com.sample.ms.application.model.Song;

/**
 * This class represents the idea of S in SOLID which
 * states that a class should have one and single reason
 * to change.
 *
 * This class has a single responsiblity and is limited
 * to Customer related CRUD activities only.
 */
@Service
public class SongServiceImpl implements SongService{

	@Override
	public Song getSongForId(Integer songId) {
		return new Song(1, "All of Me", "James", "2015");
	}
}
