package ch.brix.gql.client.frontify.input_objects;

public class CreateCustomMetadataPropertyTypeOptionInput extends ch.brix.gql.client.InputObject {
  /**
   * `CustomMetadataPropertyOption` value.
   */
  public CreateCustomMetadataPropertyTypeOptionInput value(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("value", v);
    return this;
  }
  /**
   * Define `CustomMetadataPropertyOption` as default. Applies to newly created `Assets` only.
   */
  @ch.brix.gql.client.DefaultValue("false")
  public CreateCustomMetadataPropertyTypeOptionInput isDefault(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("isDefault", v);
    return this;
  }
}
