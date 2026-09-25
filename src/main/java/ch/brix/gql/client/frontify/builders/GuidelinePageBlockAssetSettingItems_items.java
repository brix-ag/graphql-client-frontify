package ch.brix.gql.client.frontify.builders;

public class GuidelinePageBlockAssetSettingItems_items extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.GuidelinePageBlockAssetSetting>> {
  public GuidelinePageBlockAssetSettingItems_items() {
    super(new ch.brix.gql.client.Call<>("items", "GuidelinePageBlockAssetSetting"));
  }
  public GuidelinePageBlockAssetSettingItems_items onGuidelinePageBlockAssetSetting(On_GuidelinePageBlockAssetSetting typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
