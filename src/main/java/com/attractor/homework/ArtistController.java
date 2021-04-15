package com.attractor.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/artists")
@RestController
public class ArtistController {
    private final ArtistService artistService;
    @Autowired
    public ArtistController(ArtistService artistService) {
        this.artistService = artistService;
    }
    @PostMapping
    public void addArtist(@RequestBody Artist artist){
        artistService.addArtist(artist);
    }
    @GetMapping
    public List<Artist> getAllArtist(){
        return artistService.getAllPeople();
    }
}
