package ch.brix.gql.client.frontify.interfaces;

/**
 * Interface for all block types on a guideline page.
 */
@ch.brix.gql.client.PossibleTypes({ch.brix.gql.client.frontify.objects.BrandEssentialsColorBlock.class, ch.brix.gql.client.frontify.objects.GuidelinePageBlock.class})
public interface GuidelinePageBlockInterface {
  /**
   * **BETA** The id of the `GuidelinePageBlock`.
   */
  ch.brix.gql.client.frontify.scalars.IdScalar getId();
  /**
   * **BETA** The searchable content of the `GuidelinePageBlock`. When the block cannot be serialized, this field is `null`.
   */
  ch.brix.gql.client.frontify.scalars.StringScalar getContent();
  /**
   * **BETA** The url of the `GuidelinePageBlock`
   */
  ch.brix.gql.client.frontify.scalars.UrlScalar getUrl();
  /**
   * **BETA** The timestamp of the most recent modification to the `GuidelinePageBlock`. If not modified, this represents the creation time.
   */
  ch.brix.gql.client.frontify.scalars.DateTimeScalar getModifiedAt();
  /**
   * **BETA** The settings of the `GuidelinePageBlock`.
   */
  ch.brix.gql.client.frontify.scalars.JsonObjectScalar getSettings();
  /**
   * **BETA** A list of `GuidelinePageBlockAssetSetting` used by this `GuidelinePageBlock`.
   */
  ch.brix.gql.client.frontify.objects.GuidelinePageBlockAssetSettingItems getAssetSettings();
  /**
   * **BETA** The type of this `GuidelinePageBlock`.
   */
  ch.brix.gql.client.frontify.objects.GuidelinePageBlockType getType();
}
