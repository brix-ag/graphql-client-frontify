package ch.brix.gql.client.frontify.builders;

public class On_CustomMetadataPropertySelectValueType extends ch.brix.gql.client.TypeBuilder {
  public On_CustomMetadataPropertySelectValueType() {
    super(new ch.brix.gql.client.On("CustomMetadataPropertySelectValueType"));
  }
  /**
   * `CustomMetadataPropertyValueType` property type.
   */
  public On_CustomMetadataPropertySelectValueType propertyType() {
    _add_field("propertyType");
    return this;
  }
  /**
   * `SelectPropertyValueType` options.
   */
  public On_CustomMetadataPropertySelectValueType options(CustomMetadataPropertySelectValueType_options callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
