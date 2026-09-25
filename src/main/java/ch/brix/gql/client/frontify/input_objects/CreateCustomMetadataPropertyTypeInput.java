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
  /**
   * **BETA** CATALOG-specific configuration. Required when type name is `CATALOG`; ignored otherwise.
   */
  public CreateCustomMetadataPropertyTypeInput catalogOptions(ch.brix.gql.client.frontify.input_objects.CatalogPropertyTypeOptionsInput v) {
    values.put("catalogOptions", v);
    return this;
  }
}
