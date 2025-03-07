package ch.brix.gql.client.frontify.builders;

public class On_LibraryPageCollectionItems extends ch.brix.gql.client.TypeBuilder {
  public On_LibraryPageCollectionItems() {
    super(new ch.brix.gql.client.On("LibraryPageCollectionItems"));
  }
  /**
   * Total amount of results.
   */
  public On_LibraryPageCollectionItems total() {
    _add_field("total");
    return this;
  }
  /**
   * Current page number.
   */
  public On_LibraryPageCollectionItems page() {
    _add_field("page");
    return this;
  }
  /**
   * Number of results per page.
   */
  public On_LibraryPageCollectionItems limit() {
    _add_field("limit");
    return this;
  }
  /**
   * Indicates if a next page is available or not
   */
  public On_LibraryPageCollectionItems hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
  /**
   * List of `LibraryPage` `Collection` items.
   */
  public On_LibraryPageCollectionItems items(LibraryPageCollectionItems_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
