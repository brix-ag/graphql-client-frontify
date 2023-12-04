package ch.brix.gql.client.frontify.builders;

public class On_LibraryPageAssetItems extends ch.brix.gql.client.TypeBuilder {
  public On_LibraryPageAssetItems() {
    super(new ch.brix.gql.client.On("LibraryPageAssetItems"));
  }
  /**
   * Total amount of results.
   */
  public On_LibraryPageAssetItems total() {
    _add_field("total");
    return this;
  }
  /**
   * Current page number.
   */
  public On_LibraryPageAssetItems page() {
    _add_field("page");
    return this;
  }
  /**
   * Number of results per page.
   */
  public On_LibraryPageAssetItems limit() {
    _add_field("limit");
    return this;
  }
  /**
   * Indicates if a next page is available or not
   */
  public On_LibraryPageAssetItems hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
  /**
   * List of type `Asset`.
   */
  public On_LibraryPageAssetItems items(LibraryPageAssetItems_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
