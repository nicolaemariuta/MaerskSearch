package com.example.MaerskSearch.api;

import com.example.MaerskSearch.model.SearchItem;
import com.example.MaerskSearch.service.SearchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RequestMapping("api/v1/search")
@RestController
public class MaerskSearchController {

    private final SearchService searchService;

    @Autowired
    public MaerskSearchController(SearchService searchService) {
        this.searchService = searchService;
    }
    
    @GetMapping(path = "attribute={attribute}&value={value}")
    public List<SearchItem> search(@PathVariable("attribute") String attribute,
                                   @PathVariable("value") String value){
        return searchService.search(attribute, value);
    }

}
