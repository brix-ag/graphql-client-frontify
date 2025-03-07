package ch.brix.gql.client.frontify.input_objects;

public class RemoveCollectionAssetsInput extends ch.brix.gql.client.InputObject {
  /**
   * `Collection` Id.
   */
  public RemoveCollectionAssetsInput collectionId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("collectionId", v);
    return this;
  }
  /**
   * Ids of the `Assets` to remove from the `Collection`.
   */
  public RemoveCollectionAssetsInput assetIds(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> v) {
    values.put("assetIds", v);
    return this;
  }
}
