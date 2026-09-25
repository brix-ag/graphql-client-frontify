package ch.brix.gql.client.frontify.builders;

public class On_GuidelinePageBlockAsset extends ch.brix.gql.client.TypeBuilder {
  public On_GuidelinePageBlockAsset() {
    super(new ch.brix.gql.client.On("GuidelinePageBlockAsset"));
  }
  /**
   * **BETA** Preview `Url` which has optional `width` and `height` arguments.
   */
  public On_GuidelinePageBlockAsset previewUrl(GuidelinePageBlockAsset_previewUrl callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
