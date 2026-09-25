package ch.brix.gql.client.frontify.builders;

public class On_BrandEssentialsColorItems extends ch.brix.gql.client.TypeBuilder {
  public On_BrandEssentialsColorItems() {
    super(new ch.brix.gql.client.On("BrandEssentialsColorItems"));
  }
  /**
   * Total amount of results.
   */
  public On_BrandEssentialsColorItems total() {
    _add_field("total");
    return this;
  }
  /**
   * Current page number.
   */
  public On_BrandEssentialsColorItems page() {
    _add_field("page");
    return this;
  }
  /**
   * Number of results per page.
   */
  public On_BrandEssentialsColorItems limit() {
    _add_field("limit");
    return this;
  }
  /**
   * Indicates if a next page is available or not
   */
  public On_BrandEssentialsColorItems hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
  /**
   * **BETA** `Color` items.
   */
  public On_BrandEssentialsColorItems items(BrandEssentialsColorItems_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
