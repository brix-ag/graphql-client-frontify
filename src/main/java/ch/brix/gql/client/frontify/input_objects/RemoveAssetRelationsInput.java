package ch.brix.gql.client.frontify.input_objects;

public class RemoveAssetRelationsInput extends ch.brix.gql.client.InputObject {
  /**
   * `Asset` Id.
   */
  public RemoveAssetRelationsInput assetId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("assetId", v);
    return this;
  }
  /**
   * Related `Asset` Id list.
   */
  public RemoveAssetRelationsInput relatedAssetIds(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> v) {
    values.put("relatedAssetIds", v);
    return this;
  }
}
