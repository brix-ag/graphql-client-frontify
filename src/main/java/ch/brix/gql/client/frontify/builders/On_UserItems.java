package ch.brix.gql.client.frontify.builders;

public class On_UserItems extends ch.brix.gql.client.TypeBuilder {
  public On_UserItems() {
    super(new ch.brix.gql.client.On("UserItems"));
  }
  /**
   * Total amount of results.
   */
  public On_UserItems total() {
    _add_field("total");
    return this;
  }
  /**
   * Current page number.
   */
  public On_UserItems page() {
    _add_field("page");
    return this;
  }
  /**
   * Number of results per page.
   */
  public On_UserItems limit() {
    _add_field("limit");
    return this;
  }
  /**
   * Indicates if a next page is available or not
   */
  public On_UserItems hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
  /**
   * `User` items list.
   */
  public On_UserItems items(UserItems_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
