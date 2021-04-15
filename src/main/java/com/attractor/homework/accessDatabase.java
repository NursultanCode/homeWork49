package com.attractor.homework;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
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

    @Override
    public Optional<Artist> selectArtistById(UUID id) {
        return DB.stream()
                .filter(artist -> artist.getId().equals(id))
                .findFirst();
    }

    @Override
    public int deleteArtistById(UUID id) {
        Optional<Artist> artistOptional = selectArtistById(id);
        if (artistOptional.isEmpty())return 0;
        DB.remove(artistOptional.get());
        return 1;
    }

    @Override
    public int updateArtistById(UUID id,Artist artist) {
        return selectArtistById(id)
                .map(a -> {
                    int indexToDelete = DB.indexOf(artist);
                    if (indexToDelete>=0){
                        DB.set(indexToDelete, artist);
                        return 1;
                    }
                    return 0;
                })
                  .orElse(0);
    }
}
