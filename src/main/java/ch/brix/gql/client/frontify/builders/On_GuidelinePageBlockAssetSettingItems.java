package ch.brix.gql.client.frontify.builders;

public class On_GuidelinePageBlockAssetSettingItems extends ch.brix.gql.client.TypeBuilder {
  public On_GuidelinePageBlockAssetSettingItems() {
    super(new ch.brix.gql.client.On("GuidelinePageBlockAssetSettingItems"));
  }
  /**
   * Total amount of results.
   */
  public On_GuidelinePageBlockAssetSettingItems total() {
    _add_field("total");
    return this;
  }
  /**
   * Current page number.
   */
  public On_GuidelinePageBlockAssetSettingItems page() {
    _add_field("page");
    return this;
  }
  /**
   * Number of results per page.
   */
  public On_GuidelinePageBlockAssetSettingItems limit() {
    _add_field("limit");
    return this;
  }
  /**
   * Indicates if a next page is available or not
   */
  public On_GuidelinePageBlockAssetSettingItems hasNextPage() {
    _add_field("hasNextPage");
    return this;
  }
  /**
   * **BETA** List of `GuidelinePageBlockAssetSetting` items.
   */
  public On_GuidelinePageBlockAssetSettingItems items(GuidelinePageBlockAssetSettingItems_items callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
