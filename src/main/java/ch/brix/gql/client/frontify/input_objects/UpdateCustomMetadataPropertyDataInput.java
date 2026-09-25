package ch.brix.gql.client.frontify.input_objects;

public class UpdateCustomMetadataPropertyDataInput extends ch.brix.gql.client.InputObject {
  /**
   * `CustomMetadataProperty` display name.
   */
  public UpdateCustomMetadataPropertyDataInput name(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("name", v);
    return this;
  }
  /**
   * `CustomMetadataProperty` type details.
   */
  public UpdateCustomMetadataPropertyDataInput type(ch.brix.gql.client.frontify.input_objects.UpdateCustomMetadataPropertyTypeInput v) {
    values.put("type", v);
    return this;
  }
  /**
   * `CustomMetadataProperty` help text.
   */
  public UpdateCustomMetadataPropertyDataInput helpText(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("helpText", v);
    return this;
  }
  /**
   * Define if `CustomMetadataProperty` is required.
   */
  public UpdateCustomMetadataPropertyDataInput isRequired(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("isRequired", v);
    return this;
  }
  /**
   * **BETA** Define if `CustomMetadataProperty` is searchable.
   */
  public UpdateCustomMetadataPropertyDataInput isSearchable(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("isSearchable", v);
    return this;
  }
  /**
   * **BETA** Define if `CustomMetadataProperty` is viewable.
   */
  public UpdateCustomMetadataPropertyDataInput isViewable(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("isViewable", v);
    return this;
  }
  /**
   * Set a `CustomMetadataProperty` default value. This setting will be ignored for properties that are not of `SELECT` or `MULTISELECT` type  (use options for these cases instead). Applies to newly uploaded `Assets` only.
   */
  public UpdateCustomMetadataPropertyDataInput defaultValue(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("defaultValue", v);
    return this;
  }
  /**
   * **BETA** Set a dependency to another `CustomMetadataProperty`.
   */
  public UpdateCustomMetadataPropertyDataInput dependency(ch.brix.gql.client.frontify.input_objects.CustomMetadataPropertyDependencyInput v) {
    values.put("dependency", v);
    return this;
  }
  /**
   * **BETA** `CustomMetadataProperty` permissions.
   */
  public UpdateCustomMetadataPropertyDataInput permissions(java.util.List<ch.brix.gql.client.frontify.input_objects.CustomMetadataPropertyPermissionInput> v) {
    values.put("permissions", v);
    return this;
  }
}
