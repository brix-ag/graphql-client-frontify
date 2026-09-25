package ch.brix.gql.client.frontify.input_objects;

/**
 * Filter for a non-nullable date field. Exactly one field must be set. Accepts a full date-time; send UTC to avoid ambiguity.
 */
public class AssetDateFilterInput extends ch.brix.gql.client.InputObject {
  /**
   * Match assets before this date-time.
   */
  public AssetDateFilterInput isBefore(ch.brix.gql.client.frontify.scalars.DateTimeScalar v) {
    values.put("isBefore", v);
    return this;
  }
  /**
   * Match assets after this date-time.
   */
  public AssetDateFilterInput isAfter(ch.brix.gql.client.frontify.scalars.DateTimeScalar v) {
    values.put("isAfter", v);
    return this;
  }
  /**
   * Match assets within this date-time range.
   */
  public AssetDateFilterInput isBetween(ch.brix.gql.client.frontify.input_objects.AssetDateRangeInput v) {
    values.put("isBetween", v);
    return this;
  }
}
