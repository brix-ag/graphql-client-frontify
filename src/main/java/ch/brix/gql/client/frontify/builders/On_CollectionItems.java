package ch.brix.gql.client.frontify.builders;

public class On_CollectionItems extends ch.brix.gql.client.TypeBuilder {
  public On_CollectionItems() {
    super(new ch.brix.gql.client.On("CollectionItems"));
  }
  /**
   * Total amount of results.
   */
  public On_CollectionItems total() {
    _add_field("total");
    return this;
  }
  /**
   * Current page number.
   */
  public On_CollectionItems page() {
    _add_field("page");
    return this;
  }
  /**
   * Number of results per page.
   */
  public On_CollectionItems limit() {
    _add_field("limit");
    return this;
  }
  /**
   * Indicates if a next page is available or not
   */
  public On_CollectionItems hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
  /**
   * List of `Collection` items.
   */
  public On_CollectionItems items(CollectionItems_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
