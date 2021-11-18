package com.example.MaerskSearch.dao;

import com.example.MaerskSearch.model.SearchItem;

import org.springframework.stereotype.Repository;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@Repository("jsonDao")
public class SearchItemJsonService implements SearchItemDao{

    @Override
    public List<SearchItem> search(String attribute, String value) {
        List<SearchItem> searchResult = new ArrayList<SearchItem>();

        searchResult.add(new SearchItem(
               "1",
                "incident",
                "Cargo Missing",
                "Nostrud ad sit velit cupidatat laboris ipsum nisi amet laboris ex exercitation amet et proident. Ipsum fugiat aute dolore tempor nostrud velit ipsum.",
                "high",
                "pending"
        ));

        return searchResult;
    }
}
