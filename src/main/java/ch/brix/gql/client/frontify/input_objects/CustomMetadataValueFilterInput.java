package ch.brix.gql.client.frontify.input_objects;

/**
 * Filter for one custom metadata property's value. Values are matched as plain strings; the expected format depends on the property's type: date properties use `YYYY-MM-DD`, select/multi-select properties use the option's text (not its id), and catalog properties use the display value.
 */
public class CustomMetadataValueFilterInput extends ch.brix.gql.client.InputObject {
  /**
   * Id of the `CustomMetadataProperty` to filter on.
   */
  public CustomMetadataValueFilterInput propertyId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("propertyId", v);
    return this;
  }
  /**
   * Condition applied to the property's values.
   */
  public CustomMetadataValueFilterInput condition(ch.brix.gql.client.frontify.input_objects.CustomMetadataConditionInput v) {
    values.put("condition", v);
    return this;
  }
}
