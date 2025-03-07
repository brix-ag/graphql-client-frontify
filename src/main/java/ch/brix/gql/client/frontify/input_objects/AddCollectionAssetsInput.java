package ch.brix.gql.client.frontify.input_objects;

public class AddCollectionAssetsInput extends ch.brix.gql.client.InputObject {
  /**
   * `Collection` Id.
   */
  public AddCollectionAssetsInput collectionId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("collectionId", v);
    return this;
  }
  /**
   * Ids of the `Assets` to add to the `Collection`. Must be in the same `Library` as the `Collection`.
   */
  public AddCollectionAssetsInput assetIds(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> v) {
    values.put("assetIds", v);
    return this;
  }
}
