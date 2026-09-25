package ch.brix.gql.client.frontify.builders;

public class On_ColumnFilterItems extends ch.brix.gql.client.TypeBuilder {
  public On_ColumnFilterItems() {
    super(new ch.brix.gql.client.On("ColumnFilterItems"));
  }
  /**
   * Total amount of results.
   */
  public On_ColumnFilterItems total() {
    _add_field("total");
    return this;
  }
  /**
   * Current page number.
   */
  public On_ColumnFilterItems page() {
    _add_field("page");
    return this;
  }
  /**
   * Number of results per page.
   */
  public On_ColumnFilterItems limit() {
    _add_field("limit");
    return this;
  }
  /**
   * Indicates if a next page is available or not
   */
  public On_ColumnFilterItems hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
  /**
   * **BETA** Filter values with counts.
   */
  public On_ColumnFilterItems items(ColumnFilterItems_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
