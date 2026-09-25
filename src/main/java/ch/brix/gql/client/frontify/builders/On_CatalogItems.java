package ch.brix.gql.client.frontify.builders;

public class On_CatalogItems extends ch.brix.gql.client.TypeBuilder {
  public On_CatalogItems() {
    super(new ch.brix.gql.client.On("CatalogItems"));
  }
  /**
   * Total amount of results.
   */
  public On_CatalogItems total() {
    _add_field("total");
    return this;
  }
  /**
   * Current page number.
   */
  public On_CatalogItems page() {
    _add_field("page");
    return this;
  }
  /**
   * Number of results per page.
   */
  public On_CatalogItems limit() {
    _add_field("limit");
    return this;
  }
  /**
   * Indicates if a next page is available or not
   */
  public On_CatalogItems hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
  /**
   * **BETA** `Catalog` items.
   */
  public On_CatalogItems items(CatalogItems_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
