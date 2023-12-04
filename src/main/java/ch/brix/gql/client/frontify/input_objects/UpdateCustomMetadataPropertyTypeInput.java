package ch.brix.gql.client.frontify.input_objects;

public class UpdateCustomMetadataPropertyTypeInput extends ch.brix.gql.client.InputObject {
  /**
   * Define CustomMetadataProperty` options for `SELECT` or `MULTISELECT` type properties.
   */
  public UpdateCustomMetadataPropertyTypeInput options(java.util.List<ch.brix.gql.client.frontify.input_objects.UpdateCustomMetadataPropertyTypeOptionInput> v) {
    values.put("options", v);
    return this;
  }
}
