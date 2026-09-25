package ch.brix.gql.client.frontify.builders;

public class GuidelinePageBlockAssetSetting_assets_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * **BETA** Current page number.
   * Default value: 1
   */
  public GuidelinePageBlockAssetSetting_assets_Args page(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("page", value);
    return this;
  }
  /**
   * **BETA** How many `GuidelinePageBlockAsset` to show per query.
   * Default value: 25
   */
  public GuidelinePageBlockAssetSetting_assets_Args limit(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("limit", value);
    return this;
  }
}
