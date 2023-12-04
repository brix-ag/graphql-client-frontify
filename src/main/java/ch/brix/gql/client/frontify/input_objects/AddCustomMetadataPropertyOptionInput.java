package ch.brix.gql.client.frontify.input_objects;

public class AddCustomMetadataPropertyOptionInput extends ch.brix.gql.client.InputObject {
  /**
   * `CustomMetadataPropertyOption` value.
   */
  public AddCustomMetadataPropertyOptionInput value(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("value", v);
    return this;
  }
  /**
   * Define `CustomMetadataPropertyOption` as default. Applies to newly created `Assets` only.
   */
  @ch.brix.gql.client.DefaultValue("false")
  public AddCustomMetadataPropertyOptionInput isDefault(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("isDefault", v);
    return this;
  }
}
