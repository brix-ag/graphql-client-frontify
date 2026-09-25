package ch.brix.gql.client.frontify.builders;

public class On_GuidelinePageBlockAssetItems extends ch.brix.gql.client.TypeBuilder {
  public On_GuidelinePageBlockAssetItems() {
    super(new ch.brix.gql.client.On("GuidelinePageBlockAssetItems"));
  }
  /**
   * Total amount of results.
   */
  public On_GuidelinePageBlockAssetItems total() {
    _add_field("total");
    return this;
  }
  /**
   * Current page number.
   */
  public On_GuidelinePageBlockAssetItems page() {
    _add_field("page");
    return this;
  }
  /**
   * Number of results per page.
   */
  public On_GuidelinePageBlockAssetItems limit() {
    _add_field("limit");
    return this;
  }
  /**
   * Indicates if a next page is available or not
   */
  public On_GuidelinePageBlockAssetItems hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
  /**
   * **BETA** List of `GuidelinePageBlockAsset` items.
   */
  public On_GuidelinePageBlockAssetItems items(GuidelinePageBlockAssetItems_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
