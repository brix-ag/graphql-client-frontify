package ch.brix.gql.client.frontify.builders;

public class On_LibraryPageItems extends ch.brix.gql.client.TypeBuilder {
  public On_LibraryPageItems() {
    super(new ch.brix.gql.client.On("LibraryPageItems"));
  }
  /**
   * Total amount of results.
   */
  public On_LibraryPageItems total() {
    _add_field("total");
    return this;
  }
  /**
   * Current page number.
   */
  public On_LibraryPageItems page() {
    _add_field("page");
    return this;
  }
  /**
   * Number of results per page.
   */
  public On_LibraryPageItems limit() {
    _add_field("limit");
    return this;
  }
  /**
   * Indicates if a next page is available or not
   */
  public On_LibraryPageItems hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
  /**
   * List of type `LibraryPage`.
   */
  public On_LibraryPageItems items(LibraryPageItems_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
