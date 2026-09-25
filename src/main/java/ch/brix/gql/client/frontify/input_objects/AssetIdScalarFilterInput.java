package ch.brix.gql.client.frontify.input_objects;

/**
 * Filter for a single-valued id field. Exactly one field must be set.
 */
public class AssetIdScalarFilterInput extends ch.brix.gql.client.InputObject {
  /**
   * Match assets whose value is ANY of these.
   */
  public AssetIdScalarFilterInput isAny(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> v) {
    values.put("isAny", v);
    return this;
  }
  /**
   * Match assets whose value is NONE of these.
   */
  public AssetIdScalarFilterInput isNotAny(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> v) {
    values.put("isNotAny", v);
    return this;
  }
}
