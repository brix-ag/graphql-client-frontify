package ch.brix.gql.client.frontify.input_objects;

public class AssetCommentQueryInput extends ch.brix.gql.client.InputObject {
  /**
   * Filter `AssetComment` by status.
   */
  @ch.brix.gql.client.DefaultValue("ALL")
  public AssetCommentQueryInput status(ch.brix.gql.client.frontify.enums.AssetCommentStatusFilter v) {
    values.put("status", v);
    return this;
  }
}
