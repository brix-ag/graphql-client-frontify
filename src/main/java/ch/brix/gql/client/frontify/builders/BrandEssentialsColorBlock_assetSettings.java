package ch.brix.gql.client.frontify.builders;

public class BrandEssentialsColorBlock_assetSettings extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.GuidelinePageBlockAssetSettingItems> {
  public BrandEssentialsColorBlock_assetSettings() {
    super(new ch.brix.gql.client.Call<>("assetSettings", "GuidelinePageBlockAssetSettingItems"));
  }
  public BrandEssentialsColorBlock_assetSettings args(BrandEssentialsColorBlock_assetSettings_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public BrandEssentialsColorBlock_assetSettings onGuidelinePageBlockAssetSettingItems(On_GuidelinePageBlockAssetSettingItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
