package ch.brix.gql.client.frontify.input_objects;

public class CreateMetadataFieldInput extends ch.brix.gql.client.InputObject {
  /**
   * `Project`/`Library` Id where metadata field should be created.
   */
  public CreateMetadataFieldInput projectId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("projectId", v);
    return this;
  }
  /**
   * Create custom metadata field label.
   */
  public CreateMetadataFieldInput label(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("label", v);
    return this;
  }
  /**
   * Create custom metadata field type.
   */
  @ch.brix.gql.client.DefaultValue("TEXT")
  public CreateMetadataFieldInput type(ch.brix.gql.client.frontify.enums.MetadataFieldType v) {
    values.put("type", v);
    return this;
  }
  /**
   * Create custom metadata field allowed values. Only valid for `SELECT` type fields.
   */
  public CreateMetadataFieldInput values(java.util.List<ch.brix.gql.client.frontify.input_objects.MetadataFieldValuesInput> v) {
    values.put("values", v);
    return this;
  }
  /**
   * New custom metadata default value option. This value will be set to all new assets.
   */
  public CreateMetadataFieldInput defaultValue(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("defaultValue", v);
    return this;
  }
  /**
   * Allow multiple values in `SELECT` type `Metadata Field`.
   */
  @ch.brix.gql.client.DefaultValue("false")
  public CreateMetadataFieldInput allowMultipleValues(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("allowMultipleValues", v);
    return this;
  }
  /**
   * Allow an empty value as a valid `SELECT` type `Metadata Field` value.
   */
  @ch.brix.gql.client.DefaultValue("false")
  public CreateMetadataFieldInput allowEmptyValue(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("allowEmptyValue", v);
    return this;
  }
  /**
   * Allow users to search for `Metadata Field` values in the Frontify UI.
   */
  @ch.brix.gql.client.DefaultValue("true")
  public CreateMetadataFieldInput isSearchable(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("isSearchable", v);
    return this;
  }
  /**
   * Allow users to edit `Metadata Field` values in the Frontify UI.
   */
  @ch.brix.gql.client.DefaultValue("true")
  public CreateMetadataFieldInput isEditable(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("isEditable", v);
    return this;
  }
  /**
   * Show/hide `Metadata Field` values in the Frontify UI.
   */
  @ch.brix.gql.client.DefaultValue("true")
  public CreateMetadataFieldInput isVisible(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("isVisible", v);
    return this;
  }
}
