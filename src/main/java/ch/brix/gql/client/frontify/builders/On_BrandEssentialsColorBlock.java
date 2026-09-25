package ch.brix.gql.client.frontify.builders;

public class On_BrandEssentialsColorBlock extends ch.brix.gql.client.TypeBuilder {
  public On_BrandEssentialsColorBlock() {
    super(new ch.brix.gql.client.On("BrandEssentialsColorBlock"));
  }
  /**
   * **BETA** The id of the `GuidelinePageBlock`.
   */
  public On_BrandEssentialsColorBlock id() {
    _add_field("id");
    return this;
  }
  /**
   * **BETA** The searchable content of the `GuidelinePageBlock`. When the block cannot be serialized, this field is `null`.
   */
  public On_BrandEssentialsColorBlock content() {
    _add_field("content");
    return this;
  }
  /**
   * **BETA** The url of the `GuidelinePageBlock`
   */
  public On_BrandEssentialsColorBlock url() {
    _add_field("url");
    return this;
  }
  /**
   * **BETA** The timestamp of the most recent modification to the `GuidelinePageBlock`. If not modified, this represents the creation time.
   */
  public On_BrandEssentialsColorBlock modifiedAt() {
    _add_field("modifiedAt");
    return this;
  }
  /**
   * **BETA** The settings of the `GuidelinePageBlock`.
   */
  public On_BrandEssentialsColorBlock settings() {
    _add_field("settings");
    return this;
  }
  /**
   * **BETA** A list of `GuidelinePageBlockAssetSetting` used by this `GuidelinePageBlock`.
   */
  public On_BrandEssentialsColorBlock assetSettings(BrandEssentialsColorBlock_assetSettings callBuilder) {
    _add_call(callBuilder);
    return this;
  }
  /**
   * **BETA** The type of this `GuidelinePageBlock`.
   */
  public On_BrandEssentialsColorBlock type(BrandEssentialsColorBlock_type callBuilder) {
    _add_call(callBuilder);
    return this;
  }
}
