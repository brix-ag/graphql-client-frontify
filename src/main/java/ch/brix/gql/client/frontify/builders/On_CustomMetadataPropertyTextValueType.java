package ch.brix.gql.client.frontify.builders;

public class On_CustomMetadataPropertyTextValueType extends ch.brix.gql.client.TypeBuilder {
  public On_CustomMetadataPropertyTextValueType() {
    super(new ch.brix.gql.client.On("CustomMetadataPropertyTextValueType"));
  }
  /**
   * `CustomMetadataPropertyValueType` property type.
   */
  public On_CustomMetadataPropertyTextValueType propertyType() {
    _add_field("propertyType");
    return this;
  }
}
