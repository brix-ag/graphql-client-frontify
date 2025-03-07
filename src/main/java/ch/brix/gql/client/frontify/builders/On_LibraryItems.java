package ch.brix.gql.client.frontify.builders;

public class On_LibraryItems extends ch.brix.gql.client.TypeBuilder {
  public On_LibraryItems() {
    super(new ch.brix.gql.client.On("LibraryItems"));
  }
  /**
   * Total amount of results.
   */
  public On_LibraryItems total() {
    _add_field("total");
    return this;
  }
  /**
   * Current page number.
   */
  public On_LibraryItems page() {
    _add_field("page");
    return this;
  }
  /**
   * Number of results per page.
   */
  public On_LibraryItems limit() {
    _add_field("limit");
    return this;
  }
  /**
   * Indicates if a next page is available or not
   */
  public On_LibraryItems hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
  /**
   * List of type `Library`
   */
  public On_LibraryItems items(LibraryItems_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
