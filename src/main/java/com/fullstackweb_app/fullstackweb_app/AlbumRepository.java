
package com.fullstackweb_app.fullstackweb_app;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AlbumRepository extends CrudRepository<Album,Integer> {
        List<Album> findAll();

    }

