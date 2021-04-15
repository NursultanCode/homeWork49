package com.attractor.homework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

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
    @GetMapping(path = "{id}")
    public Artist getArtistById(@PathVariable("id") UUID id){
        return artistService.getArtistById(id).orElse(null);
    }

}
