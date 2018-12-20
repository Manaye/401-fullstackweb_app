package com.fullstackweb_app.fullstackweb_app;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.view.RedirectView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AlbumController {
    //
//
    private final AlbumService albumService;
    //@Autowired
    public AlbumController(AlbumService albumService) {
        this.albumService = albumService;
    }

    @ResponseBody
    @RequestMapping(value = "/albums", method = RequestMethod.GET)
    public String index(Model m) {
        List<Album> albumList = albumService.getAllAlbums();
        m.addAttribute("albums", albumList);
        return "albumIndex";
    }


    @RequestMapping(value = "/albums", method = RequestMethod.POST)
    public RedirectView create(
            @RequestParam String title,
            @RequestParam String artist,
            @RequestParam int songCount,
            @RequestParam int length,
            @RequestParam String imageUrl) {
        Album newAlbum = new Album(title, artist, songCount, length, imageUrl);
        albumService.save(newAlbum);
        return new RedirectView("/albums");
    }

}
