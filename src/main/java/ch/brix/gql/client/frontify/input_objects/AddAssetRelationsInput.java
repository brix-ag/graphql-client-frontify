package ch.brix.gql.client.frontify.input_objects;

public class AddAssetRelationsInput extends ch.brix.gql.client.InputObject {
  /**
   * `Asset` Id.
   */
  public AddAssetRelationsInput assetId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("assetId", v);
    return this;
  }
  /**
   * Related `Asset` Id list.
   */
  public AddAssetRelationsInput relatedAssetIds(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> v) {
    values.put("relatedAssetIds", v);
    return this;
  }
}
