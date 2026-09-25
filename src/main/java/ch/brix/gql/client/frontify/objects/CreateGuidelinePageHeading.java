package ch.brix.gql.client.frontify.objects;

@lombok.Data
public class CreateGuidelinePageHeading {
  /**
   * **BETA** The `GuidelinePageHeading` that was created.
   */
  @com.google.gson.annotations.SerializedName("heading")
  private ch.brix.gql.client.frontify.objects.GuidelinePageHeading heading;
}
