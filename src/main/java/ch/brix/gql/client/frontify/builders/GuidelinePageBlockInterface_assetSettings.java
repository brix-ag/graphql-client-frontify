package ch.brix.gql.client.frontify.builders;

public class GuidelinePageBlockInterface_assetSettings extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.GuidelinePageBlockAssetSettingItems> {
  public GuidelinePageBlockInterface_assetSettings() {
    super(new ch.brix.gql.client.Call<>("assetSettings", "GuidelinePageBlockAssetSettingItems"));
  }
  public GuidelinePageBlockInterface_assetSettings args(GuidelinePageBlockInterface_assetSettings_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public GuidelinePageBlockInterface_assetSettings onGuidelinePageBlockAssetSettingItems(On_GuidelinePageBlockAssetSettingItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
