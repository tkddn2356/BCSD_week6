package week6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import week6.service.Search;

@Controller
public class SearchController {
    private Search search;

    @Autowired
    public void SearchController(Search search) {
        this.search = search;
    }

    @RequestMapping(value = "/Search", method = RequestMethod.GET)
    public String searchTest() {
        search.BinarySearch();
        search.SequentialSearch();
        return "Search";
    }

}
