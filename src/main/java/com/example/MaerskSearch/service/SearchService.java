package com.example.MaerskSearch.service;

import com.example.MaerskSearch.dao.SearchItemDao;
import com.example.MaerskSearch.model.SearchItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchService {

    private final SearchItemDao searchItemDao;

    @Autowired
    public SearchService(@Qualifier("jsonDao") SearchItemDao searchItemDao) {
        this.searchItemDao = searchItemDao;
    }

    public List<SearchItem> search(String attribute, String value) {
        return searchItemDao.search(attribute, value);
    }

}
