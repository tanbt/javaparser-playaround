package com.mylocal.parsers;

import com.mylocal.mapper.FieldTypeMapper;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;

import java.util.List;

/**
 * Manipulate DOM tree, write into file a Polymer 3 template
 */
public class Polymer3Parser {

    /**
     * Prepared content for template
     */
    public static String generateDocument(List<EntityField> pojoFields) {
        Element body = Jsoup.parse("").body();
        pojoFields.forEach(f -> {
            Element newEl = new Element(FieldTypeMapper.getComponent(f.getVarType()));
            newEl.attr("id", f.getVarName());
            body.appendChild(newEl);
        });
        return body.html();
    }

}
