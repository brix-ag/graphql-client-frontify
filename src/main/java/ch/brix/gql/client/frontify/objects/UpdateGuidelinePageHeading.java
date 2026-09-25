package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class UpdateGuidelinePageHeading {
  /**
   * **BETA** The `GuidelinePageHeading` that was modified.
   */
  @com.google.gson.annotations.SerializedName("heading")
  private ch.brix.gql.client.frontify.objects.GuidelinePageHeading heading;
}
