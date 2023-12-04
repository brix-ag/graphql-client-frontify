package ch.brix.gql.client.frontify.builders;

public class On_CustomMetadataPropertyNumberValueType extends ch.brix.gql.client.TypeBuilder {
  public On_CustomMetadataPropertyNumberValueType() {
    super(new ch.brix.gql.client.On("CustomMetadataPropertyNumberValueType"));
  }
  /**
   * `CustomMetadataPropertyValueType` property type.
   */
  public On_CustomMetadataPropertyNumberValueType propertyType() {
    _add_field("propertyType");
    return this;
  }
}
