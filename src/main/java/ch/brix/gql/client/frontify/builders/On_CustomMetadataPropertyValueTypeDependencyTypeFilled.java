package ch.brix.gql.client.frontify.builders;

public class On_CustomMetadataPropertyValueTypeDependencyTypeFilled extends ch.brix.gql.client.TypeBuilder {
  public On_CustomMetadataPropertyValueTypeDependencyTypeFilled() {
    super(new ch.brix.gql.client.On("CustomMetadataPropertyValueTypeDependencyTypeFilled"));
  }
  /**
   * `CustomMetadataPropertyDependency` type.
   */
  public On_CustomMetadataPropertyValueTypeDependencyTypeFilled type() {
    _add_field("type");
    return this;
  }
  /**
   * The dependee `CustomMetadataProperty` Id.
   */
  public On_CustomMetadataPropertyValueTypeDependencyTypeFilled propertyId() {
    _add_field("propertyId");
    return this;
  }
}
