package com.mylocal.parsers;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

import java.util.List;

/**
 * Manipulate DOM tree, write into file a Polymer 3 template
 */
public class Polymer3Parser {

    public static Document generateDocument(List<EntityField> pojoFields) {
        Document doc = Jsoup.parse("");

        return doc;
    }

}
