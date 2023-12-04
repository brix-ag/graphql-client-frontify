package ch.brix.gql.client.frontify.input_objects;

public class ResolveAssetCommentInput extends ch.brix.gql.client.InputObject {
  /**
   * `AssetComment` Id to resolve.
   */
  public ResolveAssetCommentInput id(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("id", v);
    return this;
  }
}
