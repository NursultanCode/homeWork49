package com.attractor.homework;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ArtistDao {
    int insertArtist(UUID id, Artist artist);
    default int insertArtist(Artist artist){
        UUID id = UUID.randomUUID();
        return insertArtist(id, artist);
    }
    List<Artist> selectAllArtist();
    Optional<Artist> selectArtistById(UUID id);
    int deleteArtistById(UUID id);
    int updateArtistById(UUID id);
}
