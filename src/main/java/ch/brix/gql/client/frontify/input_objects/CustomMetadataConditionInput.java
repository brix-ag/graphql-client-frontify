package ch.brix.gql.client.frontify.input_objects;

/**
 * Condition applied to a custom metadata property's values. Exactly one field must be set.
 */
public class CustomMetadataConditionInput extends ch.brix.gql.client.InputObject {
  /**
   * Match assets that have ALL of these values. Only meaningful for multi-select and multi-value catalog properties.
   */
  public CustomMetadataConditionInput is(java.util.List<ch.brix.gql.client.frontify.scalars.StringScalar> v) {
    values.put("is", v);
    return this;
  }
  /**
   * Match assets that have ANY of these values.
   */
  public CustomMetadataConditionInput isAny(java.util.List<ch.brix.gql.client.frontify.scalars.StringScalar> v) {
    values.put("isAny", v);
    return this;
  }
  /**
   * Match assets that do NOT have ALL of these values. Only meaningful for multi-select and multi-value catalog properties.
   */
  public CustomMetadataConditionInput isNot(java.util.List<ch.brix.gql.client.frontify.scalars.StringScalar> v) {
    values.put("isNot", v);
    return this;
  }
  /**
   * Match assets that have NONE of these values.
   */
  public CustomMetadataConditionInput isNotAny(java.util.List<ch.brix.gql.client.frontify.scalars.StringScalar> v) {
    values.put("isNotAny", v);
    return this;
  }
  /**
   * Match assets with no value set for this property. Must be `true` when provided.
   */
  public CustomMetadataConditionInput isEmpty(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("isEmpty", v);
    return this;
  }
  /**
   * Match assets with a value set for this property. Must be `true` when provided.
   */
  public CustomMetadataConditionInput isNotEmpty(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("isNotEmpty", v);
    return this;
  }
}
