package ch.brix.gql.client.frontify.builders;

public class On_AccountSearchItems extends ch.brix.gql.client.TypeBuilder {
  public On_AccountSearchItems() {
    super(new ch.brix.gql.client.On("AccountSearchItems"));
  }
  /**
   * Total amount of results.
   */
  public On_AccountSearchItems total() {
    _add_field("total");
    return this;
  }
  /**
   * Current page number.
   */
  public On_AccountSearchItems page() {
    _add_field("page");
    return this;
  }
  /**
   * Number of results per page.
   */
  public On_AccountSearchItems limit() {
    _add_field("limit");
    return this;
  }
  /**
   * Indicates if a next page is available or not
   */
  public On_AccountSearchItems hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
  /**
   * List of `AccountSearchResult` items.
   */
  public On_AccountSearchItems items(AccountSearchItems_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
