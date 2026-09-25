package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CreateGuidelinePageBlock {
  /**
   * **BETA** The `GuidelinePageBlock` that was created.
   */
  @com.google.gson.annotations.SerializedName("block")
  private ch.brix.gql.client.frontify.objects.GuidelinePageBlock block;
}
