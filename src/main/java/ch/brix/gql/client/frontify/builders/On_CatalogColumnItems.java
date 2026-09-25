package ch.brix.gql.client.frontify.builders;

public class On_CatalogColumnItems extends ch.brix.gql.client.TypeBuilder {
  public On_CatalogColumnItems() {
    super(new ch.brix.gql.client.On("CatalogColumnItems"));
  }
  /**
   * Total amount of results.
   */
  public On_CatalogColumnItems total() {
    _add_field("total");
    return this;
  }
  /**
   * Current page number.
   */
  public On_CatalogColumnItems page() {
    _add_field("page");
    return this;
  }
  /**
   * Number of results per page.
   */
  public On_CatalogColumnItems limit() {
    _add_field("limit");
    return this;
  }
  /**
   * Indicates if a next page is available or not
   */
  public On_CatalogColumnItems hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
  /**
   * **BETA** `CatalogColumn` items.
   */
  public On_CatalogColumnItems items(CatalogColumnItems_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
