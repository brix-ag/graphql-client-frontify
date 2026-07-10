package ch.brix.gql.client.frontify.builders;

public class On_AssetRevisionItems extends ch.brix.gql.client.TypeBuilder {
  public On_AssetRevisionItems() {
    super(new ch.brix.gql.client.On("AssetRevisionItems"));
  }
  /**
   * Total amount of results.
   */
  public On_AssetRevisionItems total() {
    _add_field("total");
    return this;
  }
  /**
   * Current page number.
   */
  public On_AssetRevisionItems page() {
    _add_field("page");
    return this;
  }
  /**
   * Number of results per page.
   */
  public On_AssetRevisionItems limit() {
    _add_field("limit");
    return this;
  }
  /**
   * Indicates if a next page is available or not
   */
  public On_AssetRevisionItems hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
  /**
   * List of `AssetRevision` items.
   */
  public On_AssetRevisionItems items(AssetRevisionItems_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
