package ch.brix.gql.client.frontify.builders;

public class On_UserGroupItems extends ch.brix.gql.client.TypeBuilder {
  public On_UserGroupItems() {
    super(new ch.brix.gql.client.On("UserGroupItems"));
  }
  /**
   * Total amount of results.
   */
  public On_UserGroupItems total() {
    _add_field("total");
    return this;
  }
  /**
   * Current page number.
   */
  public On_UserGroupItems page() {
    _add_field("page");
    return this;
  }
  /**
   * Number of results per page.
   */
  public On_UserGroupItems limit() {
    _add_field("limit");
    return this;
  }
  /**
   * Indicates if a next page is available or not
   */
  public On_UserGroupItems hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
  /**
   * List of type `UserGroup`.
   */
  public On_UserGroupItems items(UserGroupItems_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
