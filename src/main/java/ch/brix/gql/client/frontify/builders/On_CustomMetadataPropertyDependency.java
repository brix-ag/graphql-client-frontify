package ch.brix.gql.client.frontify.builders;

public class On_CustomMetadataPropertyDependency extends ch.brix.gql.client.TypeBuilder {
  public On_CustomMetadataPropertyDependency() {
    super(new ch.brix.gql.client.On("CustomMetadataPropertyDependency"));
  }
  /**
   * The `CustomMetadataPropertyDependency` type.
   */
  public On_CustomMetadataPropertyDependency type() {
    _add_field("type");
    return this;
  }
  /**
   * The dependee `CustomMetadataProperty` Id.
   */
  public On_CustomMetadataPropertyDependency propertyId() {
    _add_field("propertyId");
    return this;
  }
}
