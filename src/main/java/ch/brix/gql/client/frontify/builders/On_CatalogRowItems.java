package ch.brix.gql.client.frontify.builders;

public class On_CatalogRowItems extends ch.brix.gql.client.TypeBuilder {
  public On_CatalogRowItems() {
    super(new ch.brix.gql.client.On("CatalogRowItems"));
  }
  /**
   * Total amount of results.
   */
  public On_CatalogRowItems total() {
    _add_field("total");
    return this;
  }
  /**
   * Current page number.
   */
  public On_CatalogRowItems page() {
    _add_field("page");
    return this;
  }
  /**
   * Number of results per page.
   */
  public On_CatalogRowItems limit() {
    _add_field("limit");
    return this;
  }
  /**
   * Indicates if a next page is available or not
   */
  public On_CatalogRowItems hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
  /**
   * **BETA** `CatalogRow` items.
   */
  public On_CatalogRowItems items(CatalogRowItems_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
