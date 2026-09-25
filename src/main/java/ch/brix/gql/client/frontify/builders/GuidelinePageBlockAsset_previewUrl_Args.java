package ch.brix.gql.client.frontify.builders;

public class GuidelinePageBlockAsset_previewUrl_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * **BETA** `GuidelinePageBlockAsset` preview width value in pixels.
   * Default value: null
   */
  public GuidelinePageBlockAsset_previewUrl_Args width(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("width", value);
    return this;
  }
  /**
   * **BETA** `GuidelinePageBlockAsset` preview height value in pixels.
   * Default value: null
   */
  public GuidelinePageBlockAsset_previewUrl_Args height(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("height", value);
    return this;
  }
}
