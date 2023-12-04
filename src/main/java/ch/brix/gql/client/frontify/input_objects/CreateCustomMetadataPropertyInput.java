package ch.brix.gql.client.frontify.input_objects;

public class CreateCustomMetadataPropertyInput extends ch.brix.gql.client.InputObject {
  /**
   * `CustomMetadataProperty` parent Id.
   */
  public CreateCustomMetadataPropertyInput parentId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("parentId", v);
    return this;
  }
  /**
   * `CustomMetadataProperty` display name.
   */
  public CreateCustomMetadataPropertyInput name(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("name", v);
    return this;
  }
  /**
   * `CustomMetadataProperty` type.
   */
  public CreateCustomMetadataPropertyInput type(ch.brix.gql.client.frontify.input_objects.CreateCustomMetadataPropertyTypeInput v) {
    values.put("type", v);
    return this;
  }
  /**
   * `CustomMetadataProperty` help text.
   */
  @ch.brix.gql.client.DefaultValue("\"\"")
  public CreateCustomMetadataPropertyInput helpText(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("helpText", v);
    return this;
  }
  /**
   * Define if `CustomMetadataProperty` is required.
   */
  @ch.brix.gql.client.DefaultValue("false")
  public CreateCustomMetadataPropertyInput isRequired(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("isRequired", v);
    return this;
  }
  /**
   * Set a `CustomMetadataProperty` default value. This setting will be ignored for properties that are not of `SELECT` or `MULTISELECT` type  (use options for these cases instead). Applies to newly uploaded `Assets` only.
   */
  public CreateCustomMetadataPropertyInput defaultValue(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("defaultValue", v);
    return this;
  }
  /**
   * Position in the list of newly created `CustomMetadataProperty`.
   */
  public CreateCustomMetadataPropertyInput position(ch.brix.gql.client.frontify.input_objects.CustomMetadataPropertyPositionInput v) {
    values.put("position", v);
    return this;
  }
}
