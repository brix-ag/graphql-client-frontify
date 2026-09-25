package ch.brix.gql.client.frontify.input_objects;

/**
 * Filter for a multi-valued text field. Exactly one field must be set.
 */
public class AssetArrayFilterInput extends ch.brix.gql.client.InputObject {
  /**
   * Match assets that have ALL of these values.
   */
  public AssetArrayFilterInput is(java.util.List<ch.brix.gql.client.frontify.scalars.StringScalar> v) {
    values.put("is", v);
    return this;
  }
  /**
   * Match assets that have ANY of these values.
   */
  public AssetArrayFilterInput isAny(java.util.List<ch.brix.gql.client.frontify.scalars.StringScalar> v) {
    values.put("isAny", v);
    return this;
  }
  /**
   * Match assets that do NOT have ALL of these values.
   */
  public AssetArrayFilterInput isNot(java.util.List<ch.brix.gql.client.frontify.scalars.StringScalar> v) {
    values.put("isNot", v);
    return this;
  }
  /**
   * Match assets that have NONE of these values.
   */
  public AssetArrayFilterInput isNotAny(java.util.List<ch.brix.gql.client.frontify.scalars.StringScalar> v) {
    values.put("isNotAny", v);
    return this;
  }
  /**
   * Match assets with no value set. Must be `true` when provided.
   */
  public AssetArrayFilterInput isEmpty(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("isEmpty", v);
    return this;
  }
  /**
   * Match assets with a value set. Must be `true` when provided.
   */
  public AssetArrayFilterInput isNotEmpty(ch.brix.gql.client.frontify.scalars.BooleanScalar v) {
    values.put("isNotEmpty", v);
    return this;
  }
}
