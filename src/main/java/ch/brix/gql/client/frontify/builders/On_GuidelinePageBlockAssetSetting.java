package ch.brix.gql.client.frontify.builders;

public class On_GuidelinePageBlockAssetSetting extends ch.brix.gql.client.TypeBuilder {
  public On_GuidelinePageBlockAssetSetting() {
    super(new ch.brix.gql.client.On("GuidelinePageBlockAssetSetting"));
  }
  /**
   * **BETA** The name of the `GuidelinePageBlockAssetSetting`.
   */
  public On_GuidelinePageBlockAssetSetting settingName() {
    _add_field("settingName");
    return this;
  }
  /**
   * **BETA** A list of `GuidelinePageBlockAsset` referenced by this `GuidelinePageBlockAssetSetting`.
   */
  public On_GuidelinePageBlockAssetSetting assets(GuidelinePageBlockAssetSetting_assets callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
