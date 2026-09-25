package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class UpdateGuidelinePageBlockSettings {
  /**
   * **BETA** The `GuidelinePageBlock` which settings were updated.
   */
  @com.google.gson.annotations.SerializedName("block")
  private ch.brix.gql.client.frontify.objects.GuidelinePageBlock block;
}
