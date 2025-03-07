package ch.brix.gql.client.frontify.input_objects;

public class SetCollectionAssetsInput extends ch.brix.gql.client.InputObject {
  /**
   * `Collection` Id.
   */
  public SetCollectionAssetsInput collectionId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("collectionId", v);
    return this;
  }
  /**
   * Ids of the `Assets` to replace existing `Assets` in the `Collection`. Must be in the same `Library` as the `Collection`.
   */
  public SetCollectionAssetsInput assetIds(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> v) {
    values.put("assetIds", v);
    return this;
  }
}
