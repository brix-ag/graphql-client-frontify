package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class GuidelinePageBlockAssetSetting {
  /**
   * **BETA** The name of the `GuidelinePageBlockAssetSetting`.
   */
  @com.google.gson.annotations.SerializedName("settingName")
  private ch.brix.gql.client.frontify.scalars.StringScalar settingName;
  /**
   * **BETA** A list of `GuidelinePageBlockAsset` referenced by this `GuidelinePageBlockAssetSetting`.
   */
  @com.google.gson.annotations.SerializedName("assets")
  private ch.brix.gql.client.frontify.objects.GuidelinePageBlockAssetItems assets;
}
