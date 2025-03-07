package ch.brix.gql.client.frontify.builders;

public class On_AssetItems extends ch.brix.gql.client.TypeBuilder {
  public On_AssetItems() {
    super(new ch.brix.gql.client.On("AssetItems"));
  }
  /**
   * Total amount of results.
   */
  public On_AssetItems total() {
    _add_field("total");
    return this;
  }
  /**
   * Current page number.
   */
  public On_AssetItems page() {
    _add_field("page");
    return this;
  }
  /**
   * Number of results per page.
   */
  public On_AssetItems limit() {
    _add_field("limit");
    return this;
  }
  /**
   * Indicates if a next page is available or not
   */
  public On_AssetItems hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
  /**
   * `Asset` items list.
   */
  public On_AssetItems items(AssetItems_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
