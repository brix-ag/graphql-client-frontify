package ch.brix.gql.client.frontify.input_objects;

/**
 * Sets one custom metadata property's value on an `Asset`.
 */
public class CustomMetadataEntryInput extends ch.brix.gql.client.InputObject {
  /**
   * **BETA** `CustomMetadataProperty` id.
   */
  public CustomMetadataEntryInput propertyId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("propertyId", v);
    return this;
  }
  /**
   * **BETA** The value to store; the property's current value is replaced. `null` clears the value on this `Asset`. The field is required — omitting it rejects the request.
   */
  public CustomMetadataEntryInput value(ch.brix.gql.client.frontify.input_objects.CustomMetadataValueInput v) {
    values.put("value", v);
    return this;
  }
}
