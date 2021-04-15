package com.attractor.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

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

}
