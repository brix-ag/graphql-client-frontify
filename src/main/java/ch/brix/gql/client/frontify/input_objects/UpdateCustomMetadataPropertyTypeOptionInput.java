package ch.brix.gql.client.frontify.input_objects;

public class UpdateCustomMetadataPropertyTypeOptionInput extends ch.brix.gql.client.InputObject {
  /**
   * `CustomMetadataPropertyOption` Id. This is an optional field only consider for editing purposes.
   */
  public UpdateCustomMetadataPropertyTypeOptionInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
  /**
   * `CustomMetadataPropertyOption` value.
   */
  public UpdateCustomMetadataPropertyTypeOptionInput value(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("value", v);
    return this;
  }
  /**
   * Define `CustomMetadataPropertyOption` as default. Applies to newly created `Assets` only.
   */
  @ch.brix.gql.client.DefaultValue("false")
  public UpdateCustomMetadataPropertyTypeOptionInput isDefault(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("isDefault", v);
    return this;
  }
}
