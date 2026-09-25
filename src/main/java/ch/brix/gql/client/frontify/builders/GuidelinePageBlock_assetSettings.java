package ch.brix.gql.client.frontify.builders;

public class GuidelinePageBlock_assetSettings extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.GuidelinePageBlockAssetSettingItems> {
  public GuidelinePageBlock_assetSettings() {
    super(new ch.brix.gql.client.Call<>("assetSettings", "GuidelinePageBlockAssetSettingItems"));
  }
  public GuidelinePageBlock_assetSettings args(GuidelinePageBlock_assetSettings_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public GuidelinePageBlock_assetSettings onGuidelinePageBlockAssetSettingItems(On_GuidelinePageBlockAssetSettingItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
