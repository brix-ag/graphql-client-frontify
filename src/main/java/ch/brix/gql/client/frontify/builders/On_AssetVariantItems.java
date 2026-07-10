package ch.brix.gql.client.frontify.builders;

public class On_AssetVariantItems extends ch.brix.gql.client.TypeBuilder {
  public On_AssetVariantItems() {
    super(new ch.brix.gql.client.On("AssetVariantItems"));
  }
  /**
   * Total amount of results.
   */
  public On_AssetVariantItems total() {
    _add_field("total");
    return this;
  }
  /**
   * Current page number.
   */
  public On_AssetVariantItems page() {
    _add_field("page");
    return this;
  }
  /**
   * Number of results per page.
   */
  public On_AssetVariantItems limit() {
    _add_field("limit");
    return this;
  }
  /**
   * Indicates if a next page is available or not
   */
  public On_AssetVariantItems hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
  /**
   * `AssetVariant` items list.
   */
  public On_AssetVariantItems items(AssetVariantItems_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
