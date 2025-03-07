package ch.brix.gql.client.frontify.builders;

public class On_CustomMetadataPropertySelectValueTypeDependencyTypeOneOf extends ch.brix.gql.client.TypeBuilder {
  public On_CustomMetadataPropertySelectValueTypeDependencyTypeOneOf() {
    super(new ch.brix.gql.client.On("CustomMetadataPropertySelectValueTypeDependencyTypeOneOf"));
  }
  /**
   * `CustomMetadataPropertyDependency` type.
   */
  public On_CustomMetadataPropertySelectValueTypeDependencyTypeOneOf type() {
    _add_field("type");
    return this;
  }
  /**
   * The dependee `CustomMetadataProperty` Id.
   */
  public On_CustomMetadataPropertySelectValueTypeDependencyTypeOneOf propertyId() {
    _add_field("propertyId");
    return this;
  }
  /**
   * `CustomMetadataPropertyOption` property option ids.
   */
  public On_CustomMetadataPropertySelectValueTypeDependencyTypeOneOf propertyOptionIds() {
    _add_field("propertyOptionIds");
    return this;
  }
}
