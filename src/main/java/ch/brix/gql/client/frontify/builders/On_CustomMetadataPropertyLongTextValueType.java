package ch.brix.gql.client.frontify.builders;

public class On_CustomMetadataPropertyLongTextValueType extends ch.brix.gql.client.TypeBuilder {
  public On_CustomMetadataPropertyLongTextValueType() {
    super(new ch.brix.gql.client.On("CustomMetadataPropertyLongTextValueType"));
  }
  /**
   * `CustomMetadataPropertyValueType` property type.
   */
  public On_CustomMetadataPropertyLongTextValueType propertyType() {
    _add_field("propertyType");
    return this;
  }
}
