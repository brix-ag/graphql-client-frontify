package ch.brix.gql.client.frontify.builders;

public class On_CustomMetadataPropertyTypeSelect extends ch.brix.gql.client.TypeBuilder {
  public On_CustomMetadataPropertyTypeSelect() {
    super(new ch.brix.gql.client.On("CustomMetadataPropertyTypeSelect"));
  }
  /**
   * The `CustomMetadataProperty` type name.
   */
  public On_CustomMetadataPropertyTypeSelect name() {
    _add_field("name");
    return this;
  }
  /**
   * `SELECT` type `CustomMetadataProperty` options.
   */
  public On_CustomMetadataPropertyTypeSelect options(CustomMetadataPropertyTypeSelect_options callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
