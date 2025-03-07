package ch.brix.gql.client.frontify.input_objects;

public class MetadataFieldValuesInput extends ch.brix.gql.client.InputObject {
  /**
   * Possible value of `SELECT` type `Metadata Field`.
   */
  public MetadataFieldValuesInput value(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("value", v);
    return this;
  }
  /**
   * Optional setting to define current `SELECT` type `Metadata Field` value as default.
   */
  @ch.brix.gql.client.DefaultValue("false")
  public MetadataFieldValuesInput default_(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("default", v);
    return this;
  }
}
