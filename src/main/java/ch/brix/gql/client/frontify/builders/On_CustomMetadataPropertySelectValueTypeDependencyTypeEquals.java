package ch.brix.gql.client.frontify.builders;

public class On_CustomMetadataPropertySelectValueTypeDependencyTypeEquals extends ch.brix.gql.client.TypeBuilder {
  public On_CustomMetadataPropertySelectValueTypeDependencyTypeEquals() {
    super(new ch.brix.gql.client.On("CustomMetadataPropertySelectValueTypeDependencyTypeEquals"));
  }
  /**
   * `CustomMetadataPropertyDependency` type.
   */
  public On_CustomMetadataPropertySelectValueTypeDependencyTypeEquals type() {
    _add_field("type");
    return this;
  }
  /**
   * The dependee `CustomMetadataProperty` Id.
   */
  public On_CustomMetadataPropertySelectValueTypeDependencyTypeEquals propertyId() {
    _add_field("propertyId");
    return this;
  }
  /**
   * `CustomMetadataPropertyOption` Id.
   */
  public On_CustomMetadataPropertySelectValueTypeDependencyTypeEquals propertyOptionId() {
    _add_field("propertyOptionId");
    return this;
  }
}
