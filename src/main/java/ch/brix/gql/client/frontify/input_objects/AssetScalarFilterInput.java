package ch.brix.gql.client.frontify.input_objects;

/**
 * Filter for a single-valued text field. Exactly one field must be set.
 */
public class AssetScalarFilterInput extends ch.brix.gql.client.InputObject {
  /**
   * Match assets whose value is ANY of these.
   */
  public AssetScalarFilterInput isAny(java.util.List<ch.brix.gql.client.frontify.scalars.StringScalar> v) {
    values.put("isAny", v);
    return this;
  }
  /**
   * Match assets whose value is NONE of these.
   */
  public AssetScalarFilterInput isNotAny(java.util.List<ch.brix.gql.client.frontify.scalars.StringScalar> v) {
    values.put("isNotAny", v);
    return this;
  }
}
