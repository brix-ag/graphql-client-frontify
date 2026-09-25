package ch.brix.gql.client.frontify.builders;

public class GuidelinePageBlockAssetItems_items extends ch.brix.gql.client.CallBuilder<java.util.List<ch.brix.gql.client.frontify.objects.GuidelinePageBlockAsset>> {
  public GuidelinePageBlockAssetItems_items() {
    super(new ch.brix.gql.client.Call<>("items", "GuidelinePageBlockAsset"));
  }
  public GuidelinePageBlockAssetItems_items onGuidelinePageBlockAsset(On_GuidelinePageBlockAsset typeBuilder) {
    _add_on(typeBuilder);
    return this;
  }
}
