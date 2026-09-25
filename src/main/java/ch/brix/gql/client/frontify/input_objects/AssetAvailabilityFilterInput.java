package ch.brix.gql.client.frontify.input_objects;

/**
 * Filter by asset availability. Matches assets whose availability is one of `options` (or, with `negate`, none of them).
 */
public class AssetAvailabilityFilterInput extends ch.brix.gql.client.InputObject {
  /**
   * Availability states to match.
   */
  public AssetAvailabilityFilterInput options(java.util.List<ch.brix.gql.client.frontify.enums.AssetAvailabilityOption> v) {
    values.put("options", v);
    return this;
  }
  /**
   * Invert the match: true excludes assets in any of `options`.
   */
  @ch.brix.gql.client.DefaultValue("false")
  public AssetAvailabilityFilterInput negate(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("negate", v);
    return this;
  }
}
