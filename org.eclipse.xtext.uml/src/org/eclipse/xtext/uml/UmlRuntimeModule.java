package org.eclipse.xtext.uml;
 
import org.eclipse.xtext.naming.IQualifiedNameProvider;
import org.eclipse.xtext.resource.IDefaultResourceDescriptionStrategy;
import org.eclipse.xtext.resource.generic.AbstractGenericResourceRuntimeModule;
 
public class UmlRuntimeModule extends AbstractGenericResourceRuntimeModule {
 
    @Override
    protected String getLanguageName() {
        return "org.eclipse.uml2.uml.editor.presentation.UMLEditorID";
    }
 
    @Override
    protected String getFileExtensions() {
        return "uml";
    }
 
    public Class<? extends IDefaultResourceDescriptionStrategy> bindIDefaultResourceDescriptionStrategy() {
        return UmlResourceDescriptionStrategy.class;
    }
 
    @Override
    public Class<? extends IQualifiedNameProvider> bindIQualifiedNameProvider() {
        return UmlQualifiedNameProvider.class;
    }
 
}