package ch.brix.gql.client.frontify.builders;

public class On_BrandEnhancedSearchItems extends ch.brix.gql.client.TypeBuilder {
  public On_BrandEnhancedSearchItems() {
    super(new ch.brix.gql.client.On("BrandEnhancedSearchItems"));
  }
  /**
   * Current page number.
   */
  public On_BrandEnhancedSearchItems page() {
    _add_field("page");
    return this;
  }
  /**
   * Number of results per page.
   */
  public On_BrandEnhancedSearchItems limit() {
    _add_field("limit");
    return this;
  }
  /**
   * Indicates if a next page is available or not
   */
  public On_BrandEnhancedSearchItems hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
  /**
   * List of `BrandSearchResult` items.
   */
  public On_BrandEnhancedSearchItems items(BrandEnhancedSearchItems_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * List of `BrandSearchResult` edges.
   */
  public On_BrandEnhancedSearchItems edges(BrandEnhancedSearchItems_edges callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
