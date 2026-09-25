package ch.brix.gql.client.frontify.builders;

public class GuidelinePageBlock_assetSettings_Args extends ch.brix.gql.client.ArgsBuilder {
  /**
   * **BETA** Current page number.
   * Default value: 1
   */
  public GuidelinePageBlock_assetSettings_Args page(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("page", value);
    return this;
  }
  /**
   * **BETA** How many `GuidelinePageBlockAssetSetting` to show per query.
   * Default value: 25
   */
  public GuidelinePageBlock_assetSettings_Args limit(ch.brix.gql.client.frontify.scalars.IntScalar value) {
    _add_arg("limit", value);
    return this;
  }
}
