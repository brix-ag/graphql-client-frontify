package ch.brix.gql.client.frontify.builders;

public class On_CatalogWindowRowItems extends ch.brix.gql.client.TypeBuilder {
  public On_CatalogWindowRowItems() {
    super(new ch.brix.gql.client.On("CatalogWindowRowItems"));
  }
  /**
   * Total amount of results.
   */
  public On_CatalogWindowRowItems total() {
    _add_field("total");
    return this;
  }
  /**
   * Current page number.
   */
  public On_CatalogWindowRowItems page() {
    _add_field("page");
    return this;
  }
  /**
   * Number of results per page.
   */
  public On_CatalogWindowRowItems limit() {
    _add_field("limit");
    return this;
  }
  /**
   * Indicates if a next page is available or not
   */
  public On_CatalogWindowRowItems hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
  /**
   * **BETA** `CatalogWindowRow` items.
   */
  public On_CatalogWindowRowItems items(CatalogWindowRowItems_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
