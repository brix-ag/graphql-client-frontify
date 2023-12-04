package ch.brix.gql.client.frontify.builders;

public class On_AssetCommentItems extends ch.brix.gql.client.TypeBuilder {
  public On_AssetCommentItems() {
    super(new ch.brix.gql.client.On("AssetCommentItems"));
  }
  /**
   * Total amount of results.
   */
  public On_AssetCommentItems total() {
    _add_field("total");
    return this;
  }
  /**
   * Current page number.
   */
  public On_AssetCommentItems page() {
    _add_field("page");
    return this;
  }
  /**
   * Number of results per page.
   */
  public On_AssetCommentItems limit() {
    _add_field("limit");
    return this;
  }
  /**
   * Indicates if a next page is available or not
   */
  public On_AssetCommentItems hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
  /**
   * List of `AssetComment` type comments.
   */
  public On_AssetCommentItems items(AssetCommentItems_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
