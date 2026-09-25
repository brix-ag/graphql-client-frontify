package ch.brix.gql.client.frontify.builders;

public class GuidelinePageBlockAsset_previewUrl extends ch.brix.gql.client.CallBuilder<ch.brix.gql.client.frontify.scalars.UrlScalar> {
  public GuidelinePageBlockAsset_previewUrl() {
    super(new ch.brix.gql.client.Call<>("previewUrl", "Url"));
  }
  public GuidelinePageBlockAsset_previewUrl args(GuidelinePageBlockAsset_previewUrl_Args argsBuilder) {
    _set_args(argsBuilder);
    return this;
  }
}
