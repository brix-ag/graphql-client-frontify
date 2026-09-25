package ch.brix.gql.client.frontify.builders;

public class On_BrandEssentialsFontFamilyItems extends ch.brix.gql.client.TypeBuilder {
  public On_BrandEssentialsFontFamilyItems() {
    super(new ch.brix.gql.client.On("BrandEssentialsFontFamilyItems"));
  }
  /**
   * Total amount of results.
   */
  public On_BrandEssentialsFontFamilyItems total() {
    _add_field("total");
    return this;
  }
  /**
   * Current page number.
   */
  public On_BrandEssentialsFontFamilyItems page() {
    _add_field("page");
    return this;
  }
  /**
   * Number of results per page.
   */
  public On_BrandEssentialsFontFamilyItems limit() {
    _add_field("limit");
    return this;
  }
  /**
   * Indicates if a next page is available or not
   */
  public On_BrandEssentialsFontFamilyItems hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
  /**
   * **BETA** `FontFamily` items.
   */
  public On_BrandEssentialsFontFamilyItems items(BrandEssentialsFontFamilyItems_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
