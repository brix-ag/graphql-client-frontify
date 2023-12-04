package ch.brix.gql.client.frontify.builders;

public class On_CustomMetadataPropertyTypeMultiSelect extends ch.brix.gql.client.TypeBuilder {
  public On_CustomMetadataPropertyTypeMultiSelect() {
    super(new ch.brix.gql.client.On("CustomMetadataPropertyTypeMultiSelect"));
  }
  /**
   * The `CustomMetadataProperty` type name.
   */
  public On_CustomMetadataPropertyTypeMultiSelect name() {
    _add_field("name");
    return this;
  }
  /**
   * `MULTISELECT` type `CustomMetadataProperty` options.
   */
  public On_CustomMetadataPropertyTypeMultiSelect options(CustomMetadataPropertyTypeMultiSelect_options callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
