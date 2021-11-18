package com.example.MaerskSearch.dao;

import com.example.MaerskSearch.model.SearchItem;

import java.util.List;

public interface SearchItemDao {

    List<SearchItem> search(String attribute, String value);

}
