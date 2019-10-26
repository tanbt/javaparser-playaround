package com.mylocal.parsers;

import com.mylocal.mapper.FieldTypeMapper;
import com.mylocal.mapper.PolymerImportMapper;
import com.mylocal.parsers.entity.EntityClass;
import com.mylocal.parsers.entity.EntityField;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Element;

import javax.swing.text.html.parser.Entity;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Manipulate DOM tree, write into file a Polymer 3 template
 */
public class Polymer3Parser {

    public static String generateComponent(EntityClass eClass) {
        String result = "";
        String imports = generateImports(eClass).stream().collect(Collectors.joining("\n"));
        String html = generateHtml(eClass);
        return imports + "\n\n" + html;
    }

    /**
     * Prepared html content for template
     */
    private static String generateHtml(EntityClass eClass) {
        Element body = Jsoup.parse("").body();
        eClass.getFields().forEach(f -> {
            Element newEl = new Element(FieldTypeMapper.getComponent(f.getVarType()));
            newEl.attr("id", f.getVarName());
            body.appendChild(newEl);
        });
        return body.html();
    }

    private static List<String> generateImports(EntityClass eClass) {
        List<String> resolvedImports = eClass.getFields().stream().map(f -> {
            String compName = FieldTypeMapper.getComponent(f.getVarType());
            String moduleName = PolymerImportMapper.getImport(compName);
            return String.format("import '%s';", moduleName);
        }).collect(Collectors.toList());

        List<String> allImports = getPreservedImports();
        allImports.addAll(resolvedImports);
        return allImports;
    }

    private static List<String> getPreservedImports() {
        return new ArrayList<String>() {
            {
                add("import { PolymerElement } from '@polymer/polymer/polymer-element.js';");
                add("import { html } from '@polymer/polymer/lib/utils/html-tag.js';");
            }
        };
    }
}
