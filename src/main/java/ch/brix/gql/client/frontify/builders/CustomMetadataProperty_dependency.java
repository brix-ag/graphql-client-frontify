package ch.brix.gql.client.frontify.builders;

public class CustomMetadataProperty_dependency extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.interfaces.CustomMetadataPropertyDependency> {
  public CustomMetadataProperty_dependency() {
    super(new ch.brix.gql.client.Call<>("dependency", "CustomMetadataPropertyDependency"));
  }
  public CustomMetadataProperty_dependency onCustomMetadataPropertySelectValueTypeDependencyTypeEquals(On_CustomMetadataPropertySelectValueTypeDependencyTypeEquals typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public CustomMetadataProperty_dependency onCustomMetadataPropertySelectValueTypeDependencyTypeOneOf(On_CustomMetadataPropertySelectValueTypeDependencyTypeOneOf typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public CustomMetadataProperty_dependency onCustomMetadataPropertyValueTypeDependencyTypeFilled(On_CustomMetadataPropertyValueTypeDependencyTypeFilled typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
  public CustomMetadataProperty_dependency onCustomMetadataPropertyDependency(On_CustomMetadataPropertyDependency typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
