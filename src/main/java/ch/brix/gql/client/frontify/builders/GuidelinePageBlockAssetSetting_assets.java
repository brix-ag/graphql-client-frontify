package ch.brix.gql.client.frontify.builders;

public class GuidelinePageBlockAssetSetting_assets extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.objects.GuidelinePageBlockAssetItems> {
  public GuidelinePageBlockAssetSetting_assets() {
    super(new ch.brix.gql.client.Call<>("assets", "GuidelinePageBlockAssetItems"));
  }
  public GuidelinePageBlockAssetSetting_assets args(GuidelinePageBlockAssetSetting_assets_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
  public GuidelinePageBlockAssetSetting_assets onGuidelinePageBlockAssetItems(On_GuidelinePageBlockAssetItems typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
