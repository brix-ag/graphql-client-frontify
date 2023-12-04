package ch.brix.gql.client.frontify.input_objects;

public class CreateAssetCommentInput extends ch.brix.gql.client.InputObject {
  /**
   * Id of the `Asset` where you wish to create a new `AssetComment`.
   */
  public CreateAssetCommentInput assetId(ch.brix.gql.client.frontify.scalars.IdScalar v) {
    values.put("assetId", v);
    return this;
  }
  /**
   * `AssetComment` content. Can include `User` mentions by wrapping an authorized `Project` `User` Id in the form of `@[user:<id>]` where `<id>` is the `User` integer or global identifier.
   */
  public CreateAssetCommentInput content(ch.brix.gql.client.frontify.scalars.StringScalar v) {
    values.put("content", v);
    return this;
  }
  /**
   * Add a `Marking` (highlighted area) to the new `AssetComment`.
   */
  public CreateAssetCommentInput marking(ch.brix.gql.client.frontify.input_objects.MarkingInput v) {
    values.put("marking", v);
    return this;
  }
}
