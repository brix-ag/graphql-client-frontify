package ch.brix.gql.client.frontify.input_objects;

public class MoveAssetsInput extends ch.brix.gql.client.InputObject {
  /**
   * Ids of the `Asset` items to be moved.
   */
  public MoveAssetsInput assetIds(java.util.List<ch.brix.gql.client.frontify.scalars.IdScalar> v) {
    values.put("assetIds", v);
    return this;
  }
  /**
   * Id of the destination entity where `Asset` items should be moved to. Allows `Library`/`Workspace`/`Folder` Ids only.
   */
  public MoveAssetsInput destinationId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("destinationId", v);
    return this;
  }
}
