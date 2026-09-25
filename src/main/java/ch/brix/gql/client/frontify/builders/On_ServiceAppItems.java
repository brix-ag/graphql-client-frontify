package ch.brix.gql.client.frontify.builders;

public class On_ServiceAppItems extends ch.brix.gql.client.TypeBuilder {
  public On_ServiceAppItems() {
    super(new ch.brix.gql.client.On("ServiceAppItems"));
  }
  /**
   * **BETA** `ServiceApp` items.
   */
  public On_ServiceAppItems items(ServiceAppItems_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * Total amount of results.
   */
  public On_ServiceAppItems total() {
    _add_field("total");
    return this;
  }
  /**
   * Current page number.
   */
  public On_ServiceAppItems page() {
    _add_field("page");
    return this;
  }
  /**
   * Number of results per page.
   */
  public On_ServiceAppItems limit() {
    _add_field("limit");
    return this;
  }
  /**
   * Indicates if a next page is available or not
   */
  public On_ServiceAppItems hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
}
