package ch.brix.gql.client.frontify.builders;

public class On_BrandSearchItems extends ch.brix.gql.client.TypeBuilder {
  public On_BrandSearchItems() {
    super(new ch.brix.gql.client.On("BrandSearchItems"));
  }
  /**
   * Total amount of results.
   */
  public On_BrandSearchItems total() {
    _add_field("total");
    return this;
  }
  /**
   * Current page number.
   */
  public On_BrandSearchItems page() {
    _add_field("page");
    return this;
  }
  /**
   * Number of results per page.
   */
  public On_BrandSearchItems limit() {
    _add_field("limit");
    return this;
  }
  /**
   * Indicates if a next page is available or not
   */
  public On_BrandSearchItems hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
  /**
   * List of `BrandSearchResult` items.
   */
  public On_BrandSearchItems items(BrandSearchItems_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * List of `BrandSearchResult` edges.
   */
  public On_BrandSearchItems edges(BrandSearchItems_edges callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
