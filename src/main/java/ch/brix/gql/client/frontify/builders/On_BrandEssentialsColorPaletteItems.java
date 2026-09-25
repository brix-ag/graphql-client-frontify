package ch.brix.gql.client.frontify.builders;

public class On_BrandEssentialsColorPaletteItems extends ch.brix.gql.client.TypeBuilder {
  public On_BrandEssentialsColorPaletteItems() {
    super(new ch.brix.gql.client.On("BrandEssentialsColorPaletteItems"));
  }
  /**
   * Total amount of results.
   */
  public On_BrandEssentialsColorPaletteItems total() {
    _add_field("total");
    return this;
  }
  /**
   * Current page number.
   */
  public On_BrandEssentialsColorPaletteItems page() {
    _add_field("page");
    return this;
  }
  /**
   * Number of results per page.
   */
  public On_BrandEssentialsColorPaletteItems limit() {
    _add_field("limit");
    return this;
  }
  /**
   * Indicates if a next page is available or not
   */
  public On_BrandEssentialsColorPaletteItems hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
  /**
   * **BETA** `ColorPalette` items.
   */
  public On_BrandEssentialsColorPaletteItems items(BrandEssentialsColorPaletteItems_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
