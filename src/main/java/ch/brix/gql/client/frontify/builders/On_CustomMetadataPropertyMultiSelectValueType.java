package ch.brix.gql.client.frontify.builders;

public class On_CustomMetadataPropertyMultiSelectValueType extends ch.brix.gql.client.TypeBuilder {
  public On_CustomMetadataPropertyMultiSelectValueType() {
    super(new ch.brix.gql.client.On("CustomMetadataPropertyMultiSelectValueType"));
  }
  /**
   * `CustomMetadataPropertyValueType` property type.
   */
  public On_CustomMetadataPropertyMultiSelectValueType propertyType() {
    _add_field("propertyType");
    return this;
  }
  /**
   * `MultiSelectPropertyValueType` options.
   */
  public On_CustomMetadataPropertyMultiSelectValueType options(CustomMetadataPropertyMultiSelectValueType_options callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
