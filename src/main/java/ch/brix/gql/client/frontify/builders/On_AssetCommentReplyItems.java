package ch.brix.gql.client.frontify.builders;

public class On_AssetCommentReplyItems extends ch.brix.gql.client.TypeBuilder {
  public On_AssetCommentReplyItems() {
    super(new ch.brix.gql.client.On("AssetCommentReplyItems"));
  }
  /**
   * Total amount of results.
   */
  public On_AssetCommentReplyItems total() {
    _add_field("total");
    return this;
  }
  /**
   * Current page number.
   */
  public On_AssetCommentReplyItems page() {
    _add_field("page");
    return this;
  }
  /**
   * Number of results per page.
   */
  public On_AssetCommentReplyItems limit() {
    _add_field("limit");
    return this;
  }
  /**
   * Indicates if a next page is available or not
   */
  public On_AssetCommentReplyItems hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
  /**
   * List of type `AssetCommentReply`.
   */
  public On_AssetCommentReplyItems items(AssetCommentReplyItems_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
