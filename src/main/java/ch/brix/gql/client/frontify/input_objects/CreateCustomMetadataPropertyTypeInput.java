package ch.brix.gql.client.frontify.input_objects;

public class CreateCustomMetadataPropertyTypeInput extends ch.brix.gql.client.InputObject {
  /**
   * `CustomMetadataProperty` type name.
   */
  public CreateCustomMetadataPropertyTypeInput name(ch.brix.gql.client.frontify.enums.CustomMetadataPropertyTypeName v) {
    values.put("name", v);
    return this;
  }
  /**
   * Define CustomMetadataProperty` options for `SELECT` or `MULTISELECT` type properties.
   */
  public CreateCustomMetadataPropertyTypeInput options(java.util.List<ch.brix.gql.client.frontify.input_objects.CreateCustomMetadataPropertyTypeOptionInput> v) {
    values.put("options", v);
    return this;
  }
}
