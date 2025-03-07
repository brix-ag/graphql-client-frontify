package ch.brix.gql.client.frontify.input_objects;

public class CustomMetadataInput extends ch.brix.gql.client.InputObject {
  /**
   * `CustomMetadataProperty` Id.
   */
  public CustomMetadataInput propertyId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("propertyId", v);
    return this;
  }
  /**
   * `CustomMetadataProperty` value.
   */
  public CustomMetadataInput value(ch.brix.gql.client.frontify.scalars.AnyScalar v) {
    values.put("value", v);
    return this;
  }
}
