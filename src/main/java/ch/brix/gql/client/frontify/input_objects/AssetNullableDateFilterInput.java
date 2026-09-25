package ch.brix.gql.client.frontify.input_objects;

/**
 * Filter for a nullable date field. Exactly one field must be set. Accepts a full date-time; send UTC to avoid ambiguity.
 */
public class AssetNullableDateFilterInput extends ch.brix.gql.client.InputObject {
  /**
   * Match assets exactly on this date-time.
   */
  public AssetNullableDateFilterInput is(ch.brix.gql.client.frontify.scalars.DateTimeScalar v) {
    values.put("is", v);
    return this;
  }
  /**
   * Match assets before this date-time.
   */
  public AssetNullableDateFilterInput isBefore(ch.brix.gql.client.frontify.scalars.DateTimeScalar v) {
    values.put("isBefore", v);
    return this;
  }
  /**
   * Match assets after this date-time.
   */
  public AssetNullableDateFilterInput isAfter(ch.brix.gql.client.frontify.scalars.DateTimeScalar v) {
    values.put("isAfter", v);
    return this;
  }
  /**
   * Match assets within this date-time range.
   */
  public AssetNullableDateFilterInput isBetween(ch.brix.gql.client.frontify.input_objects.AssetDateRangeInput v) {
    values.put("isBetween", v);
    return this;
  }
  /**
   * Match assets with no value set. Must be `true` when provided.
   */
  public AssetNullableDateFilterInput isEmpty(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("isEmpty", v);
    return this;
  }
  /**
   * Match assets with a value set. Must be `true` when provided.
   */
  public AssetNullableDateFilterInput isNotEmpty(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("isNotEmpty", v);
    return this;
  }
}
