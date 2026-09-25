package ch.brix.gql.client.frontify.input_objects;

/**
 * Inclusive date range.
 */
public class AssetDateRangeInput extends ch.brix.gql.client.InputObject {
  /**
   * Start of the range (inclusive).
   */
  public AssetDateRangeInput from(ch.brix.gql.client.frontify.scalars.DateTimeScalar v) {
    values.put("from", v);
    return this;
  }
  /**
   * End of the range (inclusive).
   */
  public AssetDateRangeInput to(ch.brix.gql.client.frontify.scalars.DateTimeScalar v) {
    values.put("to", v);
    return this;
  }
}
