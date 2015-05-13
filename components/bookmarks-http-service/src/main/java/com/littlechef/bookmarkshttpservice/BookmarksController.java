package com.littlechef.bookmarkshttpservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@RestController
@RequestMapping(value = "/bookmarks", produces = "application/json")
public class BookmarksController {

    @RequestMapping(method = GET, consumes = "application/json")
    public String forUser(){
        return "[]";
    }
}
