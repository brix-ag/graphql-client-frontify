package ch.brix.gql.client.frontify.builders;

public class On_CustomMetadataPropertyValueType extends ch.brix.gql.client.TypeBuilder {
  public On_CustomMetadataPropertyValueType() {
    super(new ch.brix.gql.client.On("CustomMetadataPropertyValueType"));
  }
  /**
   * The `CustomMetadataPropertyValueType` property type.
   */
  public On_CustomMetadataPropertyValueType propertyType() {
    _add_field("propertyType");
    return this;
  }
}
