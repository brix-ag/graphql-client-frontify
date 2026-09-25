package ch.brix.gql.client.frontify.input_objects;

/**
 * Filter for copyright status. Exactly one field must be set.
 */
public class CopyrightStatusFilterInput extends ch.brix.gql.client.InputObject {
  /**
   * Match assets whose copyright status is ANY of these.
   */
  public CopyrightStatusFilterInput isAny(java.util.List<ch.brix.gql.client.frontify.enums.AssetCopyrightStatus> v) {
    values.put("isAny", v);
    return this;
  }
  /**
   * Match assets whose copyright status is NONE of these.
   */
  public CopyrightStatusFilterInput isNotAny(java.util.List<ch.brix.gql.client.frontify.enums.AssetCopyrightStatus> v) {
    values.put("isNotAny", v);
    return this;
  }
}
