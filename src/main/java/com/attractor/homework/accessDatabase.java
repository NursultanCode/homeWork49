package com.attractor.homework;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
@Repository("fakeDao")
public class accessDatabase implements ArtistDao {
    private static List<Artist> DB = new ArrayList<>();

    @Override
    public int insertArtist(UUID id, Artist artist) {
        DB.add(new Artist(id,artist.getName(),artist.getInformation()));
        return 1;
    }

    @Override
    public List<Artist> selectAllArtist() {
        return DB;
    }
}
