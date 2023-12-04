package ch.brix.gql.client.frontify.builders;

public class On_CustomMetadataPropertyDateValueType extends ch.brix.gql.client.TypeBuilder {
  public On_CustomMetadataPropertyDateValueType() {
    super(new ch.brix.gql.client.On("CustomMetadataPropertyDateValueType"));
  }
  /**
   * `CustomMetadataPropertyValueType` property type.
   */
  public On_CustomMetadataPropertyDateValueType propertyType() {
    _add_field("propertyType");
    return this;
  }
}
