package ch.brix.gql.client.frontify.input_objects;

/**
 * Filter for a multi-valued id field. Exactly one field must be set.
 */
public class AssetIdArrayFilterInput extends ch.brix.gql.client.InputObject {
  /**
   * Match assets that have ALL of these values.
   */
  public AssetIdArrayFilterInput is(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> v) {
    values.put("is", v);
    return this;
  }
  /**
   * Match assets that have ANY of these values.
   */
  public AssetIdArrayFilterInput isAny(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> v) {
    values.put("isAny", v);
    return this;
  }
  /**
   * Match assets that do NOT have ALL of these values.
   */
  public AssetIdArrayFilterInput isNot(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> v) {
    values.put("isNot", v);
    return this;
  }
  /**
   * Match assets that have NONE of these values.
   */
  public AssetIdArrayFilterInput isNotAny(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> v) {
    values.put("isNotAny", v);
    return this;
  }
  /**
   * Match assets with no value set. Must be `true` when provided.
   */
  public AssetIdArrayFilterInput isEmpty(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("isEmpty", v);
    return this;
  }
  /**
   * Match assets with a value set. Must be `true` when provided.
   */
  public AssetIdArrayFilterInput isNotEmpty(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("isNotEmpty", v);
    return this;
  }
}
