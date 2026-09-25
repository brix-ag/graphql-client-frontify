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
   * **BETA** Define if `CustomMetadataProperty` is viewable.
   */
  @ch.brix.gql.client.DefaultValue("true")
  public CreateCustomMetadataPropertyInput isViewable(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("isViewable", v);
    return this;
  }
  /**
   * **BETA** Define if `CustomMetadataProperty` is searchable.
   */
  @ch.brix.gql.client.DefaultValue("true")
  public CreateCustomMetadataPropertyInput isSearchable(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("isSearchable", v);
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
  /**
   * **BETA** Set a dependency to another `CustomMetadataProperty`.
   */
  public CreateCustomMetadataPropertyInput dependency(ch.brix.gql.client.frontify.input_objects.CustomMetadataPropertyDependencyInput v) {
    values.put("dependency", v);
    return this;
  }
  /**
   * **BETA** Permissions defined for this property.
   */
  public CreateCustomMetadataPropertyInput permissions(java.util.List<ch.brix.gql.client.frontify.input_objects.CustomMetadataPropertyPermissionInput> v) {
    values.put("permissions", v);
    return this;
  }
}
