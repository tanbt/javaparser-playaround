package com.mylocal;

import com.github.javaparser.ast.CompilationUnit;
import com.github.javaparser.ast.body.FieldDeclaration;
import com.github.javaparser.ast.visitor.VoidVisitorAdapter;
import com.github.javaparser.utils.CodeGenerationUtils;
import com.github.javaparser.utils.SourceRoot;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        SourceRoot sourceRoot = new SourceRoot(CodeGenerationUtils.mavenModuleRoot(App.class)
                .resolve("src/main/resources"));
        CompilationUnit cu = sourceRoot.parse("", "User.java");

        List<EntityField> entityFields = new ArrayList<>();
        cu.accept(new VoidVisitorAdapter<List<EntityField>>() {
            @Override
            public void visit(FieldDeclaration fd, List<EntityField> f) {
                f.add(new EntityField(
                        fd.getModifiers().get(0).getKeyword().asString(),
                        fd.getVariables().get(0).getNameAsString(),
                        fd.getVariables().get(0).getTypeAsString()
                ));
            }
        }, entityFields);

        entityFields.forEach(f -> System.out.println(f));
    }
}
