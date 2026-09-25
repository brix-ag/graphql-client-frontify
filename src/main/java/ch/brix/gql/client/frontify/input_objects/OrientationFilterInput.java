package ch.brix.gql.client.frontify.input_objects;

/**
 * Filter for image orientation. Exactly one field must be set.
 */
public class OrientationFilterInput extends ch.brix.gql.client.InputObject {
  /**
   * Match assets whose orientation is ANY of these.
   */
  public OrientationFilterInput isAny(java.util.List<ch.brix.gql.client.frontify.enums.AssetOrientation> v) {
    values.put("isAny", v);
    return this;
  }
  /**
   * Match assets whose orientation is NONE of these.
   */
  public OrientationFilterInput isNotAny(java.util.List<ch.brix.gql.client.frontify.enums.AssetOrientation> v) {
    values.put("isNotAny", v);
    return this;
  }
}
