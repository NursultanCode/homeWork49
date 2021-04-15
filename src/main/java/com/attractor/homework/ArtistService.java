package com.attractor.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class ArtistService {
    private final ArtistDao artistDao;
    @Autowired
    public ArtistService(ArtistDao artistDao) {
        this.artistDao = artistDao;
    }

    public int addArtist(@Qualifier("fakeDao") Artist artist){
        return artistDao.insertArtist(artist);
    }

    public List<Artist> getAllPeople(){
        return artistDao.selectAllArtist();
    }

    public Optional<Artist> getArtistById(UUID id){
        return artistDao.selectArtistById(id);
    }

}
