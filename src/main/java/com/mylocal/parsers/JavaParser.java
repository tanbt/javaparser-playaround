package com.mylocal.parsers;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.Node;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.type.Type;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import com.github.javaparser.utils.CodeGenerationUtils;
import com.github.javaparser.utils.SourceRoot;
import com.mylocal.App;

import java.util.ArrayList;
import java.util.List;

/**
 * Read a POJO source to get fields metadata
 */
public class JavaParser {
    public static List<EntityField> read(String resourceRootPath, String fileName) {
        SourceRoot sourceRoot = new SourceRoot(CodeGenerationUtils.mavenModuleRoot(App.class)
                .resolve(resourceRootPath));
        CompilationUnit cu = sourceRoot.parse("", fileName);

        List<EntityField> entityFields = new ArrayList<>();
        cu.accept(new VoidVisitorAdapter<List<EntityField>>() {
            @Override
            public void visit(FieldDeclaration fd, List<EntityField> f) {
                f.add(new EntityField(
                        fd.getModifiers().get(0).getKeyword().asString(),
                        fd.getVariables().get(0).getNameAsString(),
                        getTopLevelType(fd)
                ));
            }
        }, entityFields);
        return entityFields;
    }

    private static String getTopLevelType(FieldDeclaration fd) {
        Type type = fd.getVariables().get(0).getType();
        if (type.isPrimitiveType()) {
            return type.asString();
        }
        return fd.getVariables().get(0).getType().getChildNodes().get(0).toString();
    }
}
