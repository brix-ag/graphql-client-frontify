package ch.brix.gql.client.frontify.input_objects;

public class ReopenAssetCommentInput extends ch.brix.gql.client.InputObject {
  /**
   * `AssetComment` Id to reopen.
   */
  public ReopenAssetCommentInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
}
