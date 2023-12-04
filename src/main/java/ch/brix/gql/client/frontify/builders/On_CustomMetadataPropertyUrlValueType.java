package ch.brix.gql.client.frontify.builders;

public class On_CustomMetadataPropertyUrlValueType extends ch.brix.gql.client.TypeBuilder {
  public On_CustomMetadataPropertyUrlValueType() {
    super(new ch.brix.gql.client.On("CustomMetadataPropertyUrlValueType"));
  }
  /**
   * `CustomMetadataPropertyValueType` property type.
   */
  public On_CustomMetadataPropertyUrlValueType propertyType() {
    _add_field("propertyType");
    return this;
  }
}
