package com.fullstackweb_app.fullstackweb_app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {
    private final AlbumRepository albumRepository  ;
//    @Autowired
    public AlbumService(AlbumRepository albumRepository) {
        this.albumRepository = albumRepository;
    }

    public List<Album> getAllAlbums(){
        return albumRepository.findAll();
    }

    public void save(Album album){
        albumRepository.save(album) ;
    }

}
