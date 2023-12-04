package ch.brix.gql.client.frontify.input_objects;

public class AssetQueryFilterInput extends ch.brix.gql.client.InputObject {
  /**
   * The Asset must pass **all conditions** in this List to be present in the result set.
   */
  public AssetQueryFilterInput andConditions(java.util.List<ch.brix.gql.client.frontify.input_objects.AssetQueryFilterConditionInput> v) {
    values.put("andConditions", v);
    return this;
  }
  /**
   * The Asset must pass **at least one condition** in this List to be present in the result set.
   */
  public AssetQueryFilterInput orConditions(java.util.List<ch.brix.gql.client.frontify.input_objects.AssetQueryFilterConditionInput> v) {
    values.put("orConditions", v);
    return this;
  }
}
